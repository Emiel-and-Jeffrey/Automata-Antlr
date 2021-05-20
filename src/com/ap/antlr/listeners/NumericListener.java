package com.ap.antlr.listeners;

import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.base.AutomataParserBaseListener;

public class NumericListener extends AutomataParserBaseListener
{
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMathExpressionSum(AutomataParser.MathExpressionSumContext ctx)
    {
        System.out.println("Enter sum");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMathExpressionSum(AutomataParser.MathExpressionSumContext ctx)
    {
        System.out.println("Exit sum");
    }
}
