package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseVisitor;

//first we need a value payload type
//then implement the visitor methods

public class AutomataParserVisitor extends AutomataParserBaseVisitor<Value> {
    @Override
    public Value visitProgram(AutomataParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Value visitStatement(AutomataParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Value visitPrint_expression(AutomataParser.Print_expressionContext ctx) {
        Double value = visit(ctx.numeric_expression()).getValueAs(NumberValue.class).getValue();
        System.out.println(value);
        return null;
    }

    @Override
    public Value visitConditionalExpressionIf(AutomataParser.ConditionalExpressionIfContext ctx) {
        boolean condition = visit(ctx.logical_expression()).getValueAs(BooleanValue.class).getValue();

        if(condition) {
            visitChildren(ctx);
        }

        return new VoidValue();
    }

    @Override
    public Value visitConditional_loop_expression(AutomataParser.Conditional_loop_expressionContext ctx) {
        return super.visitConditional_loop_expression(ctx);
    }

    @Override
    public Value visitVariableNumericDeclaration(AutomataParser.VariableNumericDeclarationContext ctx) {
        return super.visitVariableNumericDeclaration(ctx);
    }

    @Override
    public Value visitVariableNumericInitialization(AutomataParser.VariableNumericInitializationContext ctx) {
        return super.visitVariableNumericInitialization(ctx);
    }

    @Override
    public Value visitVariableBooleanDeclaration(AutomataParser.VariableBooleanDeclarationContext ctx) {
        return super.visitVariableBooleanDeclaration(ctx);
    }

    @Override
    public Value visitVariableBooleanInitialization(AutomataParser.VariableBooleanInitializationContext ctx) {
        return super.visitVariableBooleanInitialization(ctx);
    }

    @Override
    public Value visitVariableNumericAssignment(AutomataParser.VariableNumericAssignmentContext ctx) {
        return super.visitVariableNumericAssignment(ctx);
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
        return super.visitMathExpressionTimes(ctx);
    }

    @Override
    public Value visitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new NumberValue(value1 - value2);
    }

    @Override
    public Value visitMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx) {
        return super.visitMathExpressionFactorial(ctx);
    }

    @Override
    public Value visitMathExpressionVariable(AutomataParser.MathExpressionVariableContext ctx) {
        //get symbol
        //get value from symbol table
        //return value

        return super.visitMathExpressionVariable(ctx);
    }

    @Override
    public Value visitMathExpressionParentheses(AutomataParser.MathExpressionParenthesesContext ctx) {
        return super.visitMathExpressionParentheses(ctx);
    }

    @Override
    public Value visitMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx) {
        return super.visitMathExpressionPower(ctx);
    }

    @Override
    public Value visitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx) {
        return super.visitMathExpressionDivision(ctx);
    }

    @Override
    public Value visitLogicalExpressionParentheses(AutomataParser.LogicalExpressionParenthesesContext ctx) {
        return super.visitLogicalExpressionParentheses(ctx);
    }

    @Override
    public Value visitLogicalExpressionComparison(AutomataParser.LogicalExpressionComparisonContext ctx) {
        return super.visitLogicalExpressionComparison(ctx);
    }

    @Override
    public Value visitLogicalExpressionVariable(AutomataParser.LogicalExpressionVariableContext ctx) {
        return super.visitLogicalExpressionVariable(ctx);
    }

    @Override
    public Value visitLogicalExpressionBoolean(AutomataParser.LogicalExpressionBooleanContext ctx) {
        Boolean value = Boolean.valueOf(ctx.BOOLEAN().getText());
        return  new BooleanValue(value);
    }

    @Override
    public Value visitLogicalExpressionAnd(AutomataParser.LogicalExpressionAndContext ctx) {
        return super.visitLogicalExpressionAnd(ctx);
    }

    @Override
    public Value visitLogicalExpressionNegation(AutomataParser.LogicalExpressionNegationContext ctx) {
        return super.visitLogicalExpressionNegation(ctx);
    }

    @Override
    public Value visitLogicalExpressionOr(AutomataParser.LogicalExpressionOrContext ctx) {
        return super.visitLogicalExpressionOr(ctx);
    }

    @Override
    public Value visitComparisionExpressionGreaterThan(AutomataParser.ComparisionExpressionGreaterThanContext ctx) {
        return super.visitComparisionExpressionGreaterThan(ctx);
    }

    @Override
    public Value visitComparisionExpressionGreaterThanOrEqual(AutomataParser.ComparisionExpressionGreaterThanOrEqualContext ctx) {
        return super.visitComparisionExpressionGreaterThanOrEqual(ctx);
    }

    @Override
    public Value visitComparisionExpressionLessThan(AutomataParser.ComparisionExpressionLessThanContext ctx) {
        return super.visitComparisionExpressionLessThan(ctx);
    }

    @Override
    public Value visitComparisionExpressionLessThanOrEqual(AutomataParser.ComparisionExpressionLessThanOrEqualContext ctx) {
        return super.visitComparisionExpressionLessThanOrEqual(ctx);
    }

    @Override
    public Value visitComparisionExpressionEqualTo(AutomataParser.ComparisionExpressionEqualToContext ctx) {
        Double value1 = visit(ctx.numeric_expression(0)).getValueAs(NumberValue.class).getValue();
        Double value2 = visit(ctx.numeric_expression(1)).getValueAs(NumberValue.class).getValue();

        return new BooleanValue(value1.equals(value2));
    }
}
