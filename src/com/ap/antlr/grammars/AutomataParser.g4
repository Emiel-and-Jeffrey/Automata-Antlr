parser grammar AutomataParser;
options { tokenVocab= AutomataLexer; }

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
