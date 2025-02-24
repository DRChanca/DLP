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
	| IDENT '(' (expr (',' expr)*)* ')' ';'
	|  asignacion ';'
	; 
expr
	: INT_LITERAL
	| REAL_LITERAL
	| CHAR_LITERAL
	| IDENT ('[' INT_LITERAL ']')* 
	| '(' expr ')'
	| expr '.' IDENT
	| '<'tipo'>' '('expr')'
	| '!' expr
	| expr ( '*' | '/' ) expr                    
    | expr ( '+' | '-' ) expr                    
    | expr ( '<' | '>' | '<=' | '>=' ) expr
    | expr '==' expr 
    | expr '&&' expr                             
    | expr '||' expr      
    | expr '.' expr                       
	; 	
asignacion
	: expr '=' expr
	;   
	
tipo
	: 'int'
	| 'float'
	| 'char'
	; 