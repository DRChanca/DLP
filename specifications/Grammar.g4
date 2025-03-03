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
	: 'var' IDENT ':' tipo ';'
	; 
	
argumento
	: IDENT ':' tipo
	; 

declaracion
	:  IDENT ':' tipo ';'
	; 
sentencia
	: 'print' (expr (',' expr)*)?  ';'
	| 'read' (expr (',' expr)*)? ';'
	| 'printsp' (expr (',' expr)*)? ';'
	| 'println' (expr (',' expr)*)? ';'
	|  funcion ';'
	|  asignacion';'
	| 'return' expr? ';'
	|  'if' '(' expr ')' '{' sentencia* '}' ('else' '{' sentencia* '}')? 
	|  'while' '(' expr ')' '{' sentencia* '}'
	; 
funcion
	: IDENT '(' (expr (',' expr)*)* ')' 
	; 
expr
	: INT_LITERAL
	| REAL_LITERAL
	| IDENT
	| CHAR_LITERAL
	| expr '[' expr ']' 
	| '(' expr ')'
	| '<'tipo'>' '('expr')'
	| '!' expr
	| expr ( '*' | '/' ) expr                    
    | expr ( '+' | '-' ) expr                    
    | expr ( '<' | '>' | '<=' | '>='| ) expr
    | expr ('=='| '!=') expr 
    | expr '&&' expr                             
    | expr '||' expr      
    | expr '.' IDENT       
    | funcion           
	; 	
asignacion
	: expr '=' expr
	;   
	
tipo
	: 'int'
	| 'float'
	| 'char'
	| '['INT_LITERAL']' tipo
	| IDENT
	; 