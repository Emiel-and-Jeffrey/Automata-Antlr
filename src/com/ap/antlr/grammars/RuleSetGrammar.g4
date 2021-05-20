grammar RuleSetGrammar;

/* lexical rules/token definition */

IF : 'if' ;
THEN : 'then' ;

AND : 'and' ;
OR : 'or' ;

TRUE  : 'true' ;
FALSE : 'false' ;

MULT : '*' ;
DIV : '/' ;
PLUS : '+' ;
MIN : '-' ;

GT : '>' ;
LT : '<' ;
GE : '>=' ;
LE : '<=' ;
EQ : '=' ;

LPAREN : '(' ;
RPAREN : ')' ;

SEMI : ';' ;

// regex identifiers

DECIMAL : '-'?[0-9]+('.'[0-9]+)? ;
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]* ;

COMMENT : '//' .+? ('\n'|EOF) -> skip ;

WS : [ \t\r\n]+ -> skip ;


/* grammar rules */

rule_set : single_rule* EOF ;
single_rule : IF condition THEN conclusion SEMI ;

condition : logical_expr ;
conclusion : IDENTIFIER ;

logical_expr
	: logical_expr AND logical_expr # LogicalExpressionAnd
	| logical_expr OR logical_expr 	# LogicalExpressionOr
	| comparison_expr				# ComparisonExpression
	| LPAREN logical_expr RPAREN	# LogicalExpressionInParen
	| logical_entity				# LogicalEntity
	;

comparison_expr
	: comparison_operand comp_operator comparison_operand # ComparisonExpressionWithOperator
	| LPAREN comparison_expr RPAREN # ComparisonExpressionInParen
	;

comparison_operand : arithmetic_expr ;

comp_operator
	: GT
	| LT
	| GE
	| LE
	| EQ
	;

arithmetic_expr
	: arithmetic_expr MULT arithmetic_expr	# ArithmeticExpressionMult
	| arithmetic_expr DIV arithmetic_expr	# ArithmeticExpressionDiv
	| arithmetic_expr PLUS arithmetic_expr	# ArithmeticExpressionPlus
	| arithmetic_expr MIN arithmetic_expr	# ArithmeticExpressionMin
	| MIN arithmetic_expr					# ArithmeticExpressionNegation
	| LPAREN arithmetic_expr RPAREN			# ArithmeticExpressionInParen
	| numeric_entity						# ArithmeticExpressionNumericEntity
	;

logical_entity
	: (TRUE | FALSE) 	# LogicalConst
	| IDENTIFIER		# LogicalVariable
	;

numeric_entity
	: DECIMAL		# NumericConst
	| IDENTIFIER	# NumericVariable
	;
