grammar BaseGrammer;

program: statement*;
statement: expression;

expression:
	NUMBER
	| LEFT_PARANTHESIS expression RIGHT_PARANTHESIS
	| expression FACTORIAL // Factorial
	| expression POWER expression // Power
	| expression TIMES expression // Times
	| expression DIVISION expression // Division
	| expression ADD expression // Sum
	| expression MINUS expression; // Minus

// Lexicon
NUMBER: [0-9]+;
ADD: '+';
TIMES: '*';
DIVISION: '/';
MINUS: '-';
FACTORIAL: '!';
POWER: '^';
LEFT_PARANTHESIS: '(';
RIGHT_PARANTHESIS: ')';

WS: [ \t\r\n]+ -> skip;
// skip spaces, tabs, newlines
