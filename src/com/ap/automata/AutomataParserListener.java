package com.ap.automata;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseListener;

import java.util.Stack;

public class AutomataParserListener extends AutomataParserBaseListener {
    private Stack<Integer> resultStack = new Stack<>();

    public Integer getResult() {
        return resultStack.peek();
    }

    @Override
    public void exitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx) {
        Integer rightNumber = resultStack.pop();
        Integer leftNumber = resultStack.pop();

        Integer result = leftNumber + rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionMinus(AutomataParser.MathExpressionMinusContext ctx) {
        Integer rightNumber = resultStack.pop();
        Integer leftNumber = resultStack.pop();

        Integer result = leftNumber - rightNumber;
        resultStack.push(result);
    }

    @Override
    public void exitMathExpressionBasicNumber(AutomataParser.MathExpressionBasicNumberContext ctx) {
        resultStack.push(Integer.valueOf(ctx.NUMBER().getText()));
    }
}
