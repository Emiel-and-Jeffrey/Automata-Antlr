package com.ap.automata;

import com.ap.antlr.base.Z3ParserBaseListener;

public abstract class Z3ParserListener extends Z3ParserBaseListener {
    protected final int[][] sudokuGrid = new int[9][9];

    public String printSudokuGrid() {
        StringBuilder output = new StringBuilder();

        output.append("╔═╦═╦═╦═╦═╦═╦═╦═╦═╗" + '\n');

        for (int y = 0; y < 9; y++) {

            output.append("║");

            for (int x = 0; x < 9; x++) {
                output.append(sudokuGrid[x][y]).append("║");
            }

            output.append('\n');
            output.append((y == 8) ? "╚═╩═╩═╩═╩═╩═╩═╩═╩═╝" : "╠═╬═╬═╬═╬═╬═╬═╬═╬═╣" + '\n');
        }

        return output.toString();
    }
}
