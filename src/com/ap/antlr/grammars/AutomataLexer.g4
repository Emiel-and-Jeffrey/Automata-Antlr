lexer grammar AutomataLexer;

//numeric operators:
ADD: '+';
TIMES: '*';
DIVISION: '/';
MINUS: '-';
FACTORIAL: '!';
POWER: '^';

//assignment operator:
EQUALS: '=';

//reserved characters:
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
DOT: '.';
SEMICOLON: ';';

//types (lowercase is convention):
VARIABLE_TYPE_NUMBER: 'number';

//function keywords (capital letter is convention):
PRINT: 'Print';

NUMBER: MINUS?[0-9]+(DOT[0-9]+)?;
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;
