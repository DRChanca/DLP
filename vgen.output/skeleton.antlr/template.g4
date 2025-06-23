// Generated with VGen 2.0.0

grammar Grammar;

@header {
	    import ast.declaraciones.*;
	    import ast.tipo.*;
	    import ast.sentencia.*;
	    import ast.expression.*;
	    import ast.*;
}

program returns[Program ast]
    : declaracioneses+=declaraciones*     { $ast = new Program($declaracioneses); }              
	;

declaraciones returns[Declaraciones ast]
    : nombre=IDENT definicions+=definicion* { $ast = new Declaracionstructs($nombre, $definicions); }
    | definicion                          { $ast = new Declaracionglobales($definicion.ast); }   
    | nombre=IDENT argumento+=definicion* tipo? variablesLocales+=definicion* sentencias+=sentencia* { $ast = new Declaracionfuncion($nombre, $argumento, ($tipo.ctx == null) ? null : $tipo.ast, $variablesLocales, $sentencias); }
	;

definicion returns[Definicion ast]
    : IDENT=IDENT tipo                    { $ast = new Definicion($IDENT, $tipo.ast); }          
	;

tipo returns[Tipo ast]
    : name=IDENT                          { $ast = new IntTipo($name); }                         
    | name=IDENT                          { $ast = new FloatTipo($name); }                       
    | name=IDENT                          { $ast = new CharTipo($name); }                        
    | INT_LITERAL tipo                    { $ast = new ArrayTipo($INT_LITERAL, $tipo.ast); }     
    | name=IDENT                          { $ast = new StringTipo($name); }                      
    |                                     { $ast = new VoidTipo(); }                             
	;

sentencia returns[Sentencia ast]
    : expressions+=expression*            { $ast = new PrintSentencia($expressions); }           
    | expressions+=expression*            { $ast = new ReadSentencia($expressions); }            
    | expressions+=expression*            { $ast = new PrintspSentencia($expressions); }         
    | expressions+=expression*            { $ast = new PrintlnSentencia($expressions); }         
    | nombre=IDENT argumento+=expression* { $ast = new FuncionSentencia($nombre, $argumento); }  
    | left=expression expression=expression { $ast = new AsignacionSentencia($left.ast, $expression.ast); }
    | expression?                         { $ast = new ReturnSentencia(($expression.ctx == null) ? null : $expression.ast); }
    | expression entonces+=sentencia* otro+=sentencia* { $ast = new IfSentencia($expression.ast, $entonces, $otro); }
    | expression entonces+=sentencia*     { $ast = new WhileSentencia($expression.ast, $entonces); }
	;

expression returns[Expression ast]
    : INT_LITERAL                         { $ast = new IntExpresion($INT_LITERAL); }             
    | DOUBLE_LITERAL                      { $ast = new RealExpresion($DOUBLE_LITERAL); }         
    | name=IDENT                          { $ast = new IdentificadorExpresion($name); }          
    | name=IDENT                          { $ast = new CharExpresion($name); }                   
    | acceso=expression indice=expression { $ast = new AccessoArrayExpresion($acceso.ast, $indice.ast); }
    | expression                          { $ast = new ParentesisExpresion($expression.ast); }   
    | tipo expression                     { $ast = new CastExpresion($tipo.ast, $expression.ast); }
    | expression                          { $ast = new NegacionExpresion($expression.ast); }     
    | left=expression operator=IDENT right=expression { $ast = new ArithmeticExpresion($left.ast, $operator, $right.ast); }
    | left=expression operator=IDENT right=expression { $ast = new LogicExpression($left.ast, $operator, $right.ast); }
    | left=expression operator=IDENT right=expression { $ast = new BoolExpression($left.ast, $operator, $right.ast); }
    | expression right=IDENT              { $ast = new AcederCap($expression.ast, $right); }     
    | nombre=IDENT argumentos+=expression* { $ast = new FuncionExpresion($nombre, $argumentos); } 
	;


// ---------------------------------------------------------------
// Tokens

IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
DOUBLE_LITERAL: [0-9]+ '.' [0-9]+;
INT_LITERAL: [0-9]+;
