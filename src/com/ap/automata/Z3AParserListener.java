package com.ap.automata;

import com.ap.antlr.base.Z3Parser;
import com.ap.antlr.base.Z3ParserBaseListener;

import java.lang.reflect.Array;

public class Z3AParserListener extends Z3ParserListener {

    @Override
    public void exitStatementFunction(Z3Parser.StatementFunctionContext ctx) {
        String[] functionName = ctx.function().IDENTIFIER().getText().split("(?!^)");
        int x = Integer.parseInt(functionName[1]) - 1;
        int y = Integer.parseInt(functionName[2]) - 1;

        int value = Integer.parseInt(ctx.statement().get(0).getText());

        sudokuGrid[x][y] = value;
    }
}
