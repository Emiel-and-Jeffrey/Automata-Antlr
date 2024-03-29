package com.ap.automata;

import com.ap.antlr.base.Z3Parser;

import java.util.Stack;

public class Z3BParserListener extends Z3ParserListener {

    private final Stack<Integer> coordinates = new Stack<>();

    @Override
    public void exitStatementIfElse(Z3Parser.StatementIfElseContext ctx) {
        int y = coordinates.pop() - 1;
        int x = coordinates.pop() - 1;

        int value = Integer.parseInt(ctx.statement().get(0).getText());

        sudokuGrid[x][y] = value;
    }

    @Override
    public void exitComparisonExpressionEqualTo(Z3Parser.ComparisonExpressionEqualToContext ctx) {
        int coordinate = Integer.parseInt(ctx.value(1).getText());
        coordinates.push(coordinate);
    }
}
