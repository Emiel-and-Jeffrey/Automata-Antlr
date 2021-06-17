package com.ap.automata;

import com.ap.antlr.base.Z3Parser;
import com.ap.antlr.base.Z3ParserBaseListener;

public abstract class GraphListener extends Z3ParserBaseListener {
    private int minNode;
    private int maxNode;


    @Override()
    public void exitValueString(Z3Parser.ValueStringContext ctx) {
        String[] size = ctx.STRING_LITERAL().getText().split(":");

        minNode = Integer.parseInt(size[0]);
        maxNode = Integer.parseInt(size[1]);
    }

    @Override()
    public void enterLogicalExpressionAnd(Z3Parser.LogicalExpressionAndContext ctx) {
        var values = ctx.value().toArray();
        if (values.length != 3) {
            return;
        }
    }
}
