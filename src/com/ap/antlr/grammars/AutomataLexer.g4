lexer grammar AutomataLexer;

NUMBER: [0-9]+;
ADD: '+';
TIMES: '*';
DIVISION: '/';
MINUS: '-';
FACTORIAL: '!';
POWER: '^';
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';

WS: [ \t\r\n]+ -> skip;