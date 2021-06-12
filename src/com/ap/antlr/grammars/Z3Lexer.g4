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
EXLAMATION_MARK: '!';

AND: 'and';
IF_ELSE: 'ite';

FUNC: 'define-fun';

INT: 'Int';

IDENTIFIER: [a-zA-Z_][!]*[a-zA-Z_0-9]*;
NUMBER: [0-9]+;

WS: [ \t\r\n]+ -> skip;
