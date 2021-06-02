lexer grammar AutomataLexer;

//numeric operators:
ADD: '+';
TIMES: '*';
DIVISION: '/';
MINUS: '-';
FACTORIAL: '!';
POWER: '^';

// logical operators:
GREATER_THAN : '>' ;
LESS_THAN : '<' ;
GREATER_THAN_OR_EQUAL : '>=' ;
LESS_THAN_OR_EQUAL : '<=' ;
AND: '&&';
OR: '||';
NEGATION: '!';

//assignment operator:
EQUALS: '=';

//reserved characters:
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
DOT: '.';
SEMICOLON: ';';

//types (lowercase is convention):
VARIABLE_TYPE_NUMBER: 'number';
VARIABLE_TYPE_BOOLEAN: 'bool';
VARIABLE_TYPE_STRING: 'string';

//function keywords (capital letter is convention):
PRINT: 'Print';

//conditional operators
IF: 'if';
THEN: 'then';
FI: 'fi';
ELSE: 'else';
//ELIF: 'else if'; <- this might not be needed
WHILE: 'while';
ELIHW: 'elihw';

NUMBER: MINUS?[0-9]+(DOT[0-9]+)?;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;
