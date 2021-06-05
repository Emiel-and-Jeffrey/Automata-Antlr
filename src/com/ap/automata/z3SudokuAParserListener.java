package com.ap.automata;

import com.ap.antlr.base.z3SudokuAParser;
import com.ap.antlr.base.z3SudokuAParserBaseListener;

public class z3SudokuAParserListener extends z3SudokuAParserBaseListener {

    int[][] sudokuGrid = new int[9][9];

    public String printSudokuGrid() {
        return "TODO";
    }

    @Override
    public void exitValue(z3SudokuAParser.ValueContext ctx) {
        int x = Integer.parseInt(ctx.field().NUMBER(0).getText()) - 1;
        int y = Integer.parseInt(ctx.field().NUMBER(1).getText()) - 1;
        int value = Integer.parseInt(ctx.NUMBER().getText());

        sudokuGrid[x][y] = value;
    }
}
