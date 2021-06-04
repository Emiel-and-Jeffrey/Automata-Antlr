package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseListener;
import com.ap.automata.SymbolTable.ISymbol;
import com.ap.automata.SymbolTable.NumberSymbol;
import com.ap.automata.SymbolTable.SymbolTable;
import com.ap.automata.SymbolTable.VariableType;
import com.ap.automata.SymbolTable.exceptions.TypeMismatchException;
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
        Double variableValue = 0.0;
        NumberSymbol symbol = new NumberSymbol(variableName, variableValue);

        symbolTable.AddSymbol(symbol);
    }

    @Override
    public void exitVariableNumericInitialization(AutomataParser.VariableNumericInitializationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Double variableValue = stack.pop();

        NumberSymbol symbol = new NumberSymbol(variableName, variableValue);

        symbolTable.AddSymbol(symbol);
    }

    @Override
    public void exitVariable_assignment(AutomataParser.Variable_assignmentContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Double variableValue = stack.pop();

        ISymbol symbol = symbolTable.GetSymbol(variableName);
        if (symbol.getType() == VariableType.NUMBER) {
            ((NumberSymbol) symbol).setValue(variableValue);
        } else {
            throw new TypeMismatchException("Symbol was not a number");
        }
    }

    @Override
    public void exitMathExpressionVariable(AutomataParser.MathExpressionVariableContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();

        ISymbol symbol = symbolTable.GetSymbol(variableName);
        if (symbol.getType() == VariableType.NUMBER) {
            stack.push(((NumberSymbol) symbol).getValue());
        } else {
            throw new TypeMismatchException("Symbol was not a number");
        }
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
        print(result.toString());
    }
}
