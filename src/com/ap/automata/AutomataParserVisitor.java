package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseVisitor;
import com.ap.automata.SymbolTable.SymbolTable;
import com.ap.automata.SymbolTable.symbol.Symbol;
import com.ap.automata.SymbolTable.value.BooleanValue;
import com.ap.automata.SymbolTable.value.NumberValue;
import com.ap.automata.SymbolTable.value.Value;
import com.ap.automata.SymbolTable.value.VoidValue;
import org.apache.commons.math3.special.Gamma;

import java.util.List;

//first we need a value payload type
//then implement the visitor methods

public class AutomataParserVisitor extends AutomataParserBaseVisitor<Value> {

    private final SymbolTable table;

    public AutomataParserVisitor(SymbolTable table) {
        this.table = table;
    }

    @Override
    public Value visitPrintExpressionNumeric(AutomataParser.PrintExpressionNumericContext ctx) {
        Double value = visit(ctx.numeric_expression()).getValueAs(NumberValue.class).getValue();
        System.out.println(value);
        return new VoidValue();
    }

    @Override
    public Value visitConditionalExpressionIf(AutomataParser.ConditionalExpressionIfContext ctx) {

        List<AutomataParser.Logical_expressionContext> conditions = ctx.logical_expression();
        List<AutomataParser.Statement_blockContext> statements = ctx.statement_block();

        boolean ifStatementEvaluated = false;

        for(int i = 0; i < conditions.size() && !ifStatementEvaluated; i++)
        {
            BooleanValue ifStatementEvaluation = visit(conditions.get(i)).getValueAs(BooleanValue.class);
            ifStatementEvaluated = ifStatementEvaluation.getValue();

            if (ifStatementEvaluated) {
                visitChildren(statements.get(i));
            }
        }

        if (!ifStatementEvaluated && statements.size() == conditions.size() + 1) {
            visitChildren(statements.get(statements.size() - 1));
        }

        return new VoidValue();
    }

    @Override
    public Value visitConditionalExpressionWhile(AutomataParser.ConditionalExpressionWhileContext ctx) {

        while (visit(ctx.logical_expression()).getValueAs(BooleanValue.class).getValue()) {

            for (var statement : ctx.statement_block().statement()) {
                visit(statement);
            }
        }
        return new VoidValue();
    }

    @Override
    public Value visitVariableNumericDeclaration(AutomataParser.VariableNumericDeclarationContext ctx) {

        NumberValue value = new NumberValue(0.0);
        Symbol symbol = new Symbol(ctx.IDENTIFIER().getText(), value);
        table.AddSymbol(symbol);
        return value;
    }

    @Override
    public Value visitVariableNumericInitialization(AutomataParser.VariableNumericInitializationContext ctx) {
        Symbol symbol = new Symbol(ctx.IDENTIFIER().getText(), visit(ctx.numeric_expression()));
        table.AddSymbol(symbol);
        return symbol.getValue();
    }

    @Override
    public Value visitVariableBooleanDeclaration(AutomataParser.VariableBooleanDeclarationContext ctx) {
        BooleanValue value = new BooleanValue(Boolean.FALSE);
        Symbol symbol = new Symbol(ctx.IDENTIFIER().getText(), value);
        table.AddSymbol(symbol);
        return value;
    }

    @Override
    public Value visitVariableBooleanInitialization(AutomataParser.VariableBooleanInitializationContext ctx) {
        Symbol symbol = new Symbol(ctx.IDENTIFIER().getText(), visit(ctx.logical_expression()));
        table.AddSymbol(symbol);
        return symbol.getValue();
    }

    @Override
    public Value visitVariableNumericAssignment(AutomataParser.VariableNumericAssignmentContext ctx) {
        Symbol symbol = table.GetSymbol(ctx.IDENTIFIER().getText());
        NumberValue value = symbol.getValue().getValueAs(NumberValue.class);
        NumberValue newValue = visit(ctx.numeric_expression()).getValueAs(NumberValue.class);
        value.setValue(newValue.getValue());
        return value;
    }

    @Override
    public Value visitVariableBooleanAssignment(AutomataParser.VariableBooleanAssignmentContext ctx) {
        Symbol symbol = table.GetSymbol(ctx.IDENTIFIER().getText());
        BooleanValue value = symbol.getValue().getValueAs(BooleanValue.class);
        BooleanValue newValue = visit(ctx.logical_expression()).getValueAs(BooleanValue.class);
        value.setValue(newValue.getValue());
        return value;
    }

    @Override
    public Value visitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 + value2);
    }

    @Override
    public Value visitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx) {
        Double number = Double.valueOf(ctx.NUMBER().getText());
        return new NumberValue(number);
    }

    @Override
    public Value visitMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 * value2);
    }

    @Override
    public Value visitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 - value2);
    }

    @Override
    public Value visitMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx) {
        Double value = visit(ctx.numeric_expression()).getValueAs(NumberValue.class).getValue();

        Double result = Gamma.gamma(value + 1);
        return new NumberValue(result);
    }

    @Override
    public Value visitMathExpressionVariable(AutomataParser.MathExpressionVariableContext ctx) {
        return table.GetSymbol(ctx.IDENTIFIER().getText()).getValue().getValueAs(NumberValue.class);
    }

    @Override
    public Value visitMathExpressionParentheses(AutomataParser.MathExpressionParenthesesContext ctx) {
        return visit(ctx.numeric_expression());
    }

    @Override
    public Value visitMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx) {

        Double value = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double power = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        Double result = Math.pow(value, power);
        return new NumberValue(result);
    }

    @Override
    public Value visitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 / value2);
    }

    @Override
    public Value visitLogicalExpressionParentheses(AutomataParser.LogicalExpressionParenthesesContext ctx) {
        return visit(ctx.logical_expression());
    }
    
    @Override
    public Value visitLogicalExpressionVariable(AutomataParser.LogicalExpressionVariableContext ctx) {
        return table.GetSymbol(ctx.IDENTIFIER().getText()).getValue().getValueAs(BooleanValue.class);
    }

    @Override
    public Value visitLogicalExpressionBoolean(AutomataParser.LogicalExpressionBooleanContext ctx) {
        Boolean value = Boolean.valueOf(ctx.BOOLEAN().getText());
        return new BooleanValue(value);
    }

    @Override
    public Value visitLogicalExpressionAnd(AutomataParser.LogicalExpressionAndContext ctx) {
        Boolean leftStatement = visit(ctx.logical_expression(0)).getValueAs(BooleanValue.class).getValue();
        Boolean rightStatement = visit(ctx.logical_expression(1)).getValueAs(BooleanValue.class).getValue();

        return new BooleanValue(leftStatement && rightStatement);
    }

    @Override
    public Value visitLogicalExpressionNegation(AutomataParser.LogicalExpressionNegationContext ctx) {
        Boolean value = visit(ctx.logical_expression()).getValueAs(BooleanValue.class).getValue();

        return new BooleanValue(!value);
    }

    @Override
    public Value visitLogicalExpressionOr(AutomataParser.LogicalExpressionOrContext ctx) {
        Boolean leftStatement = visit(ctx.logical_expression(0)).getValueAs(BooleanValue.class).getValue();
        Boolean rightStatement = visit(ctx.logical_expression(1)).getValueAs(BooleanValue.class).getValue();

        return new BooleanValue(leftStatement || rightStatement);
    }

    @Override
    public Value visitComparisonExpressionGreaterThan(AutomataParser.ComparisonExpressionGreaterThanContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1 > value2);
    }

    @Override
    public Value visitComparisonExpressionGreaterThanOrEqual(AutomataParser.ComparisonExpressionGreaterThanOrEqualContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1 >= value2);
    }

    @Override
    public Value visitComparisonExpressionLessThan(AutomataParser.ComparisonExpressionLessThanContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1 < value2);
    }

    @Override
    public Value visitComparisonExpressionLessThanOrEqual(AutomataParser.ComparisonExpressionLessThanOrEqualContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1 <= value2);
    }

    @Override
    public Value visitComparisonExpressionEqualTo(AutomataParser.ComparisonExpressionEqualToContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1.equals(value2));
    }
}
