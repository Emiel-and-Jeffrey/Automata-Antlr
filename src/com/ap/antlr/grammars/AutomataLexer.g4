lexer grammar AutomataLexer;

NUMBER: '-'?[0-9]+('.'[0-9]+)?;
ADD: '+';
TIMES: '*';
DIVISION: '/';
MINUS: '-';
FACTORIAL: '!';
POWER: '^';
LEFT_PARANTHESIS: '(';
RIGHT_PARANTHESIS: ')';

WS: [ \t\r\n]+ -> skip;