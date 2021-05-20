package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseListener;

import java.util.Stack;

public class AutomataParserListener extends AutomataParserBaseListener {
    private Stack<Float> resultStack = new Stack<>();

    public Float getResult() {
        return resultStack.peek();
    }

    @Override
    public void exitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx) {
        Float rightNumber = resultStack.pop();
        Float leftNumber = resultStack.pop();

        Float result = leftNumber + rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx) {
        Float rightNumber = resultStack.pop();
        Float leftNumber = resultStack.pop();

        Float result = leftNumber - rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionTimes(AutomataParser.MathExpressionTimesContext ctx) {
        Float rightNumber = resultStack.pop();
        Float leftNumber = resultStack.pop();

        Float result = leftNumber * rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionDivision(AutomataParser.MathExpressionDivisionContext ctx) {
        Float rightNumber = resultStack.pop();
        Float leftNumber = resultStack.pop();

        Float result = leftNumber / rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx) {
        resultStack.push(Float.valueOf(ctx.NUMBER().getText()));
    }
}
