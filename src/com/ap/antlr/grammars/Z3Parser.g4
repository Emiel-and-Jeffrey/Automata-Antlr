parser grammar Z3Parser;
options { tokenVocab= Z3Lexer; }

result
    : SAT LPAREN MODEL value+ RPAREN;

value
    : LPAREN FUNC field LPAREN RPAREN INT NUMBER RPAREN;

field
    : FIELD NUMBER NUMBER;

