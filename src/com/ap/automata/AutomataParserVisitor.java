package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseVisitor;
import com.ap.automata.SymbolTable.SymbolTable;
import com.ap.automata.SymbolTable.exceptions.TypeMismatchException;
import com.ap.automata.SymbolTable.exceptions.UnknownVariableException;
import com.ap.automata.SymbolTable.symbol.ISymbol;
import com.ap.automata.SymbolTable.symbol.Function;
import com.ap.automata.SymbolTable.symbol.ReturnFunction;
import com.ap.automata.SymbolTable.symbol.Variable;
import com.ap.automata.SymbolTable.value.*;
import org.apache.commons.math3.special.Gamma;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AutomataParserVisitor extends AutomataParserBaseVisitor<Value> {

    private final SymbolTable globalTable;

    private final Stack<SymbolTable> scopedTable;

    public AutomataParserVisitor(SymbolTable table) {
        this.globalTable = table;
        this.scopedTable = new Stack<>();
        scopedTable.push(globalTable); //just in case
    }

    private Variable getValueFromTables(String symbol) {
        Variable variable;
        try {
            variable = scopedTable.peek().getSymbol(symbol, Variable.class);
        }
        catch (UnknownVariableException e) {
            variable = globalTable.getSymbol(symbol, Variable.class);
        }

        return variable;
    }

    @Override
    public Value visitPrintCall(AutomataParser.PrintCallContext ctx) {
        Value value = visit(ctx.expression());

        switch (value.getType()) {
            case BOOL -> System.out.println(value.getValueAs(BooleanValue.class).getValue());
            case NUMBER -> System.out.println(value.getValueAs(NumberValue.class).getValue());
            default -> System.out.println("???");
        }

        return new VoidValue();
    }

    @Override
    public Value visitLoopStructureWhile(AutomataParser.LoopStructureWhileContext ctx) {

        while (visit(ctx.expression()).getValueAs(BooleanValue.class).getValue()) {
            visit(ctx.statement_block());
        }
        return new VoidValue();
    }

    @Override
    public Value visitConditionalStructureIf(AutomataParser.ConditionalStructureIfContext ctx) {

        List<AutomataParser.ExpressionContext> conditions = ctx.expression();
        List<AutomataParser.Statement_blockContext> statements = ctx.statement_block();

        boolean ifStatementEvaluated = false;

        for (int i = 0; i < conditions.size() && !ifStatementEvaluated; i++) {
            BooleanValue ifStatementEvaluation = visit(conditions.get(i)).getValueAs(BooleanValue.class);
            ifStatementEvaluated = ifStatementEvaluation.getValue();

            if (ifStatementEvaluated) {
                visit(statements.get(i));
            }
        }

        if (!ifStatementEvaluated && statements.size() == conditions.size() + 1) {
            visit(statements.get(statements.size() - 1));
        }

        return new VoidValue();
    }

    @Override
    public Value visitFunctionDeclarationReturn(AutomataParser.FunctionDeclarationReturnContext ctx) {

        List<String> parameterNames = new ArrayList<>();
        List<VariableType> parameterTypes = new ArrayList<>();

        for (AutomataParser.ParameterContext parameter : ctx.parameters().parameter()) {
            parameterNames.add(parameter.IDENTIFIER().getText());
            parameterTypes.add(VariableType.valueOf(parameter.value_type().getText().toUpperCase()));
        }

        ReturnFunction function = new ReturnFunction(
                ctx.IDENTIFIER().getText(),
                parameterNames.toArray(new String[0]),
                parameterTypes.toArray(new VariableType[0]),
                ctx.statement_block(),
                ctx.expression());

        globalTable.addSymbol(function);
        return new VoidValue();
    }

    @Override
    public Value visitFunctionDeclarationVoid(AutomataParser.FunctionDeclarationVoidContext ctx) {

        List<String> parameterNames = new ArrayList<>();
        List<VariableType> parameterTypes = new ArrayList<>();

        for (AutomataParser.ParameterContext parameter : ctx.parameters().parameter()) {
            parameterNames.add(parameter.IDENTIFIER().getText());
            parameterTypes.add(VariableType.valueOf(parameter.value_type().getText().toUpperCase()));
        }

        Function function = new Function(
                ctx.IDENTIFIER().getText(),
                parameterNames.toArray(new String[0]),
                parameterTypes.toArray(new VariableType[0]),
                ctx.statement_block());

        globalTable.addSymbol(function);
        return new VoidValue();
    }

    @Override
    public Value visitFunctionCall(AutomataParser.FunctionCallContext ctx) {

        Function function = globalTable.getSymbol(ctx.IDENTIFIER().getText(), Function.class);

        SymbolTable table = new SymbolTable();

        String[] parameterNames = function.getParameterNames();
        VariableType[] parameterTypes = function.getParameterTypes();

        List<AutomataParser.ExpressionContext> arguments = ctx.expression();

        for (int i = 0; i < arguments.size(); i++) {
            String parameterName = parameterNames[i];
            VariableType parameterType = parameterTypes[i];
            Value value = visit(arguments.get(i));

            //i thought this was necessary but we can also ignore it here
            //then this exception just gets thrown later down the line
            if(value.getType() != parameterType) {
                throw new TypeMismatchException("Value of incorrect type supplied");
            }

            ISymbol symbol = new Variable(parameterName, value);
            table.addSymbol(symbol);
        }

        scopedTable.push(table);

        visit(function.getFunctionBody());

        AutomataParser.ExpressionContext returnStatement = function.getReturnStatement();
        Value returnValue = (returnStatement != null) ? visit(returnStatement) : new VoidValue();

        scopedTable.pop();

        return returnValue;
    }

    @Override
    public Value visitVariableDeclarationDefault(AutomataParser.VariableDeclarationDefaultContext ctx) {
        VariableType variableType = VariableType.valueOf(ctx.value_type().getText().toUpperCase());

        Value value = switch (variableType) {
            case NUMBER -> new NumberValue(0.0);
            case BOOL -> new BooleanValue(Boolean.FALSE);
            default -> throw new TypeMismatchException("Unknown type specified");
        };

        Variable variable = new Variable(ctx.IDENTIFIER().getText(), value);

        scopedTable.peek().addSymbol(variable);
        return new VoidValue();
    }

    @Override
    public Value visitVariableDeclaration(AutomataParser.VariableDeclarationContext ctx) {
        VariableType variableType = VariableType.valueOf(ctx.value_type().getText().toUpperCase());
        Value value = visit(ctx.expression());

        if (value.getType() != variableType) {
            throw new TypeMismatchException("Value of incorrect type supplied");
        }

        Variable variable = new Variable(ctx.IDENTIFIER().getText(), value);

        scopedTable.peek().addSymbol(variable);
        return new VoidValue();
    }

    @Override
    public Value visitVariableAssignment(AutomataParser.VariableAssignmentContext ctx) {
        Variable variable = getValueFromTables(ctx.IDENTIFIER().getText());

        Value value = visit(ctx.expression());

        if (variable.getValue().getType() != value.getType()) {
            throw new TypeMismatchException("Value of incorrect type supplied");
        }

        variable.setValue(value);
        return new VoidValue();
    }

    //if required add:
    //expressionvalue visitor
    //expressionfunctioncall visitor

    @Override
    public Value visitExpressionParentheses(AutomataParser.ExpressionParenthesesContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Value visitNumericExpressionAdd(AutomataParser.NumericExpressionAddContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 + value2);
    }

    @Override
    public Value visitNumericExpressionMinus(AutomataParser.NumericExpressionMinusContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 - value2);
    }

    @Override
    public Value visitNumericExpressionTimes(AutomataParser.NumericExpressionTimesContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 * value2);
    }

    @Override
    public Value visitNumericExpressionDivision(AutomataParser.NumericExpressionDivisionContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 / value2);
    }

    @Override
    public Value visitNumericExpressionPower(AutomataParser.NumericExpressionPowerContext ctx) {
        Double value = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double power = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(Math.pow(value, power));
    }

    @Override
    public Value visitNumericExpressionFactorial(AutomataParser.NumericExpressionFactorialContext ctx) {
        Double value = visit(ctx.expression()).getValueAs(NumberValue.class).getValue();

        return new NumberValue(Gamma.gamma(value + 1));
    }

    @Override
    public Value visitNumericExpressionNegate(AutomataParser.NumericExpressionNegateContext ctx) {
        Double value = visit(ctx.expression()).getValueAs(NumberValue.class).getValue();

        return new NumberValue(-value);
    }

    @Override
    public Value visitBooleanExpressionAnd(AutomataParser.BooleanExpressionAndContext ctx) {
        Boolean value1 = visit(ctx.expression(0)).getValueAs(BooleanValue.class).getValue();
        Boolean value2 = visit(ctx.expression(1)).getValueAs(BooleanValue.class).getValue();

        return new BooleanValue(value1 && value2);
    }

    @Override
    public Value visitBooleanExpressionOr(AutomataParser.BooleanExpressionOrContext ctx) {
        Boolean value1 = visit(ctx.expression(0)).getValueAs(BooleanValue.class).getValue();
        Boolean value2 = visit(ctx.expression(1)).getValueAs(BooleanValue.class).getValue();

        return new BooleanValue(value1 || value2);
    }

    @Override
    public Value visitBooleanExpressionNegate(AutomataParser.BooleanExpressionNegateContext ctx) {
        Boolean value = visit(ctx.expression()).getValueAs(BooleanValue.class).getValue();

        return new BooleanValue(!value);
    }

    @Override
    public Value visitBooleanExpressionGreaterThan(AutomataParser.BooleanExpressionGreaterThanContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1 > value2);
    }

    @Override
    public Value visitBooleanExpressionGreaterThanOrEqual(AutomataParser.BooleanExpressionGreaterThanOrEqualContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1 >= value2);
    }

    @Override
    public Value visitBooleanExpressionLessThan(AutomataParser.BooleanExpressionLessThanContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1 < value2);
    }

    @Override
    public Value visitBooleanExpressionLessThanOrEqual(AutomataParser.BooleanExpressionLessThanOrEqualContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1 <= value2);
    }

    @Override
    public Value visitBooleanExpressionEqualTo(AutomataParser.BooleanExpressionEqualToContext ctx) {
        Double value1 = visit(ctx.expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1.equals(value2));
    }

    @Override
    public Value visitValueVariable(AutomataParser.ValueVariableContext ctx) {
        return getValueFromTables(ctx.IDENTIFIER().getText()).getValue();
    }

    @Override
    public Value visitValueBoolean(AutomataParser.ValueBooleanContext ctx) {
        Boolean value = Boolean.valueOf(ctx.BOOLEAN().getText());
        return new BooleanValue(value);
    }

    @Override
    public Value visitValueNumber(AutomataParser.ValueNumberContext ctx) {
        Double value = Double.valueOf(ctx.NUMBER().getText());
        return new NumberValue(value);
    }
}
