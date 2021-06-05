parser grammar z3SudokuAParser;
options { tokenVocab= z3SudokuALexer; }

result
    : SAT LPAREN MODEL value+ RPAREN;

value
    : LPAREN FUNC field LPAREN RPAREN INT NUMBER RPAREN;

field
    : FIELD NUMBER NUMBER;

