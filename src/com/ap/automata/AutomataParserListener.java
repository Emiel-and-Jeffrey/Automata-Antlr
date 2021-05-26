package com.ap.automata;

import com.ap.antlr.base.AutomataLexer;
import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseListener;
import org.apache.commons.math3.special.Gamma;

import java.util.Stack;
import java.util.HashMap;

public class AutomataParserListener extends AutomataParserBaseListener {
    private Stack<Double> stack = new Stack<>();

    private HashMap<String, Double> symbolTable = new HashMap<>();

    @Override
    public void exitVariableNumericDeclaration(AutomataParser.VariableNumericDeclarationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Double variableValue = 0.0;

        //if symbol is already declared raise exception
        symbolTable.put(variableName, variableValue);
    }

    @Override
    public void exitVariableNumericInitialization(AutomataParser.VariableNumericInitializationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Double variableValue = stack.pop();

        //if symbol is already declared raise exception
        symbolTable.put(variableName, variableValue);
    }

    @Override
    public void exitVariable_assignment(AutomataParser.Variable_assignmentContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Double variableValue = stack.pop();

        //if symbol is not declared raise exception
        symbolTable.replace(variableName, variableValue);
    }

    @Override
    public void exitMathExpressionVariable(AutomataParser.MathExpressionVariableContext ctx) {
        //if symbol is not declared raise exception
        String variableName = ctx.IDENTIFIER().getText();
        Double variableValue = symbolTable.get(variableName);

        stack.push(variableValue);
    }

    @Override
    public void exitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx) {
        stack.push(Double.valueOf(ctx.NUMBER().getText()));
    }

    @Override
    public void exitMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx) {
        Double number = stack.pop();

        Double result = Gamma.gamma(number + 1);
        stack.push(result);
    }

    @Override
    public void exitMathExpressionPower(AutomataParser.MathExpressionPowerContext ctx) {
        Double rightNumber = stack.pop();
        Double leftNumber = stack.pop();

        Double result = Math.pow(leftNumber, rightNumber);
        stack.push(result);
    }

    @Override
    public void exitMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx) {
        Double rightNumber = stack.pop();
        Double leftNumber = stack.pop();

        Double result = leftNumber * rightNumber;
        stack.push(result);
    }

    @Override
    public void exitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx) {
        Double rightNumber = stack.pop();
        Double leftNumber = stack.pop();

        Double result = leftNumber / rightNumber;
        stack.push(result);
    }

    @Override
    public void exitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx) {
        Double rightNumber = stack.pop();
        Double leftNumber = stack.pop();

        Double result = leftNumber + rightNumber;
        stack.push(result);
    }

    @Override
    public void exitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx) {
        Double rightNumber = stack.pop();
        Double leftNumber = stack.pop();

        Double result = leftNumber - rightNumber;
        stack.push(result);
    }

    @Override
    public void exitPrint_expression(AutomataParser.Print_expressionContext ctx) {
        Double result = stack.pop();
        System.out.println(result);
    }
}
