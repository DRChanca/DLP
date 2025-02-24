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
	|  funcion ';'
	|  asignacion';'
	; 
funcion
	: IDENT '(' (expr (',' expr)*)* ')' 
	; 
expr
	: INT_LITERAL
	| REAL_LITERAL
	| CHAR_LITERAL
	| IDENT ('[' INT_LITERAL ']')* 
	| '(' expr ')'
	| '<'tipo'>' '('expr')'
	| '!' expr
	| expr ( '*' | '/' ) expr                    
    | expr ( '+' | '-' ) expr                    
    | expr ( '<' | '>' | '<=' | '>=' ) expr
    | expr '==' expr 
    | expr '&&' expr                             
    | expr '||' expr      
    | expr '.' expr       
    | funcion           
	; 	
asignacion
	: expr '=' expr
	;   
	
tipo
	: 'int'
	| 'float'
	| 'char'
	; 