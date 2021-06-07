package com.ap.automata;

public class z3ParserListener extends z3SudokuAParserBaseListener {

    int[][] sudokuGrid = new int[9][9];

    public String printSudokuGrid() {
        StringBuilder output = new StringBuilder();

        output.append("╔═╦═╦═╦═╦═╦═╦═╦═╦═╗" + '\n');

        for (int y = 0; y < 9; y++){

            output.append("║");

            for (int x = 0; x < 9; x++) {
                output.append(sudokuGrid[x][y]).append("║");
            }

            output.append('\n');
            output.append((y == 8)? "╚═╩═╩═╩═╩═╩═╩═╩═╩═╝" : "╠═╬═╬═╬═╬═╬═╬═╬═╬═╣" + '\n');
        }

        return output.toString();
    }

    @Override
    public void exitValue(z3SudokuAParser.ValueContext ctx) {
        int x = Integer.parseInt(ctx.field().NUMBER(0).getText()) - 1;
        int y = Integer.parseInt(ctx.field().NUMBER(1).getText()) - 1;
        int value = Integer.parseInt(ctx.NUMBER().getText());

        sudokuGrid[x][y] = value;
    }
}
