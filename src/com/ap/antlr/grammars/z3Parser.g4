parser grammar z3Parser;
options { tokenVocab= z3Lexer; }

result
    : SAT LPAREN MODEL value+ RPAREN;

value
    : LPAREN FUNC field LPAREN RPAREN INT NUMBER RPAREN;

field
    : FIELD NUMBER NUMBER;

