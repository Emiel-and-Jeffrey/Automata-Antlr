parser grammar Z3Parser;
options { tokenVocab= Z3Lexer; }

result
    : SAT LPAREN MODEL statement* RPAREN;

statement
    : LPAREN function statement* RPAREN               #StatementFunction
    | LPAREN IF_ELSE value statement statement RPAREN #StatementIfElse
    | LPAREN variable RPAREN                          #StatementVariableDeclaration
    | value                                           #StatementValue;

value
    : IDENTIFIER              # ValueVariable
    | STRING_LITERAL          # ValueString
	| NUMBER                  # ValueBasicNumber
	| comparison_expression   # ValueComparisonExpresssion
	| function_call           # ValueFunctionCall
	| logical_expression      # ValueLogicalExpression
	| numeric_expression      # ValueNumericExpression;

function
    : FUNC IDENTIFIER LPAREN parameter* RPAREN types;

parameter
    : LPAREN IDENTIFIER types RPAREN;

function_call
    :  LPAREN IDENTIFIER value* RPAREN
    |  LPAREN IDENTIFIER.IDENTIFIER value* RPAREN;

variable
    :   LET LPAREN value*;


logical_expression
	: LPAREN AND value* RPAREN # LogicalExpressionAnd
	| LPAREN OR value* RPAREN  # LogicalExpressionOr
	| LPAREN NOT value RPAREN  # LogicalExpressionNot;

numeric_expression
    : LPAREN ADD value* RPAREN   # NumericExpressionAdd
    | LPAREN MINUS value* RPAREN # NumericExpressionMinus;

comparison_expression
    : LPAREN GREATER_THAN value value RPAREN          # ComparisonExpressionGreaterThan
    | LPAREN GREATER_THAN_OR_EQUAL value value RPAREN # ComparisonExpressionGreaterThanOrEqual
    | LPAREN LESS_THAN value value RPAREN             # ComparisonExpressionLessThan
    | LPAREN LESS_THAN_OR_EQUAL value value RPAREN    # ComparisonExpressionLessThanOrEqual
    | LPAREN EQUALS value* RPAREN                     # ComparisonExpressionEqualTo;

types
    : INT
    | STRING
    | BOOL;


