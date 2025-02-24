grammar Grammar;

import Tokenizer;

program
	: declaraciones EOF
	;


declaraciones 
	: (declaracionstructs|declaracionglobales|declaracionfuncion)+
	; 
declaracionstructs
	: 'struct' IDENT '{' (declaracion )* '}'
	; 
	
declaracionglobales
	: 'var' declaracion
	; 
	
declaracionfuncion
	: IDENT '(' (argumento (',' argumento)*)* ')' (':' tipo)? '{' (variablesLocales)* (sentencia)*'}'
	; 
	
variablesLocales
	: 'var' IDENT ':' ('[' INT_LITERAL ']')* (tipo|IDENT) ';'
	; 
	
argumento
	: IDENT ':' (tipo|IDENT)
	; 

declaracion
	:  IDENT ':' ('[' INT_LITERAL ']')* (tipo|IDENT) ';'
	; 
sentencia
	: 'print' (expr (',' expr)*)?  ';'
	| 'read' (expr (',' expr)*)? ';'
	| 'printsp' (expr (',' expr)*)? ';'
	| 'println' (expr (',' expr)*)? ';'
	|  asignacion ';'
	; 
expr
	: INT_LITERAL
	| REAL_LITERAL
	| IDENT ('[' INT_LITERAL ']')* 
	| expr operador expr
	| expr '.' IDENT
	| '<'tipo'>' '('expr')'
	; 	
asignacion
	: IDENT ('[' INT_LITERAL ']')* '='  expr
	| expr '.' IDENT '='  expr 
	; 
operador
	:  ('+'|'-'|'*'|'/')
	| ('&&' | '||' | '!' |'<' |'>'| '<='| '>=' |'!=' ) 
	;   
	
tipo
	: 'int'
	| 'float'
	| 'char'
	; 