package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseListener;
import org.apache.commons.math3.special.Gamma;

import java.util.Stack;

public class AutomataParserListener extends AutomataParserBaseListener {
    private Stack<Double> resultStack = new Stack<>();

    public Double getResult() {
        return resultStack.peek();
    }

    @Override
    public void exitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx) {
        Double rightNumber = resultStack.pop();
        Double leftNumber = resultStack.pop();

        Double result = leftNumber + rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx) {
        Double rightNumber = resultStack.pop();
        Double leftNumber = resultStack.pop();

        Double result = leftNumber - rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx) {
        Double rightNumber = resultStack.pop();
        Double leftNumber = resultStack.pop();

        Double result = leftNumber * rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx) {
        Double rightNumber = resultStack.pop();
        Double leftNumber = resultStack.pop();

        Double result = leftNumber / rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionFactorial(AutomataParser.MathExpressionFactorialContext ctx) {
        Double number = resultStack.pop();

        Double result = Gamma.gamma(number + 1);
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx) {
        resultStack.push(Double.valueOf(ctx.NUMBER().getText()));
    }
}
