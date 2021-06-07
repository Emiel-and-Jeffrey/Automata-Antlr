lexer grammar z3Lexer;

SAT: 'sat';

LPAREN: '(';
RPAREN: ')';

MODEL: 'model';

FUNC: 'define-fun';

FIELD: 'a';

INT: 'Int';

NUMBER: [1-9];

WS: [ \t\r\n]+ -> skip;
