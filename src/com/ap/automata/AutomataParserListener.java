package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseListener;
import com.ap.automata.SymbolTable.SymbolTable;
import com.ap.automata.SymbolTable.symbol.Variable;
import com.ap.automata.SymbolTable.value.NumberValue;
import org.apache.commons.math3.special.Gamma;

import java.util.Stack;

public class AutomataParserListener extends AutomataParserBaseListener {
    private Stack<Double> stack = new Stack<>();
    private SymbolTable symbolTable;

    private String output = "";

    private void print(String out) {
        output += out + ' ';
    }

    public String getOutput() {
        return output;
    }

    public AutomataParserListener(SymbolTable table) {
        symbolTable = table;
    }

    @Override
    public void exitVariableNumericDeclaration(AutomataParser.VariableNumericDeclarationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        NumberValue value = new NumberValue(0.0);
        Variable variable = new Variable(variableName, value);

        symbolTable.addSymbol(variable);
    }

    @Override
    public void exitVariableNumericInitialization(AutomataParser.VariableNumericInitializationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();

        NumberValue value = new NumberValue(stack.pop());
        Variable variable = new Variable(variableName, value);

        symbolTable.addSymbol(variable);
    }

    @Override
    public void exitVariableNumericAssignment(AutomataParser.VariableNumericAssignmentContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Double variableValue = stack.pop();

        NumberValue number = symbolTable.getSymbol(variableName, Variable.class).getValue().getValueAs(NumberValue.class);
        number.setValue(variableValue);
    }

    @Override
    public void exitMathExpressionVariable(AutomataParser.MathExpressionVariableContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();

        NumberValue number = symbolTable.getSymbol(variableName, Variable.class).getValue().getValueAs(NumberValue.class);
        stack.push(number.getValue());
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
    public void exitPrintExpressionNumeric(AutomataParser.PrintExpressionNumericContext ctx) {
        Double result = stack.pop();
        print(result.toString());
    }
}
