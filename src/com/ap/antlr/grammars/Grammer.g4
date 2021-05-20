grammar Grammer;

program: statement*;
statement: expression;

expression:
	NUMBER # MathExpressionBasicNumber
	| LEFT_PARANTHESIS expression RIGHT_PARANTHESIS # MathExpressionParanthesis
	| expression FACTORIAL # MathExpressionFactorial // Factorial
	| expression POWER expression # MathExpressionPower // Power
	| expression TIMES expression # MathExpressionTimes // Times
	| expression DIVISION expression # MathExpressionDivision // Division
	| expression ADD expression # MathExpressionSum // Sum
	| expression MINUS expression # MathExpressionMinus; // Minus

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
