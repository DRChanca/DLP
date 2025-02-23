grammar Grammar;

import Tokenizer;

program
	: declaracionstructs* declaracionglobales* declaracionfuncion* EOF
	;


declaracionstructs
	: 'struct' IDENT '{' (declaracion )* '}'
	; 
	
declaracionglobales
	: 'var' declaracion
	; 
	
declaracionfuncion
	: IDENT '(' (argumento (',' argumento)*)* ')' (':' tipo)? '{' '}'
	;  

argumento
	: IDVAR ':' (tipo|IDENT)
	; 

declaracion
	:  IDVAR ':' ('[' INT_LITERAL ']')* (tipo|IDENT) ';'
	; 
tipo
	: 'int'
	| 'float'
	| 'char'
	; 