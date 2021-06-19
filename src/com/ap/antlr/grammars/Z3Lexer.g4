lexer grammar Z3Lexer;

SAT: 'sat';
MODEL: 'model';

LPAREN: '(';
RPAREN: ')';
EQUALS: '=';
GREATER_THAN: '>' ;
LESS_THAN: '<' ;
GREATER_THAN_OR_EQUAL: '>=' ;
LESS_THAN_OR_EQUAL: '<=' ;
DOT: '.';

MINUS: '-';
ADD: '+';

AND: 'and';
OR: 'or';
NOT: 'not';
IF_ELSE: 'ite';

FUNC: 'define-fun';
LET: 'let';

INT: 'Int';
STRING: 'String';
BOOL: 'Bool';

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9!]*;
STRING_LITERAL:  '"' ~('"')* '"';

NUMBER: [0-9]+;

WS: [ \t\r\n]+ -> skip;
