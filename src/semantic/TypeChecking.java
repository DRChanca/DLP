/**
 * MLang. Programming Language Design Tutorial
 * @author Raúl Izquierdo (raul@uniovi.es)
 */

package semantic;

import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.type.NullType;

import ast.*;
import ast.declaraciones.Declaracionfuncion;
import ast.declaraciones.Declaracionglobales;
import ast.declaraciones.Declaracionstructs;
import ast.expression.AccessoArrayExpresion;
import ast.expression.AcederCap;
import ast.expression.ArithmeticExpresion;
import ast.expression.BoolExpression;
import ast.expression.CastExpresion;
import ast.expression.CharExpresion;
import ast.expression.Expression;
import ast.expression.FuncionExpresion;
import ast.expression.IdentificadorExpresion;
import ast.expression.IntExpresion;
import ast.expression.LogicExpression;
import ast.expression.NegacionExpresion;
import ast.expression.ParentesisExpresion;
import ast.expression.RealExpresion;
import ast.sentencia.AsignacionSentencia;
import ast.sentencia.FuncionSentencia;
import ast.sentencia.IfSentencia;
import ast.sentencia.PrintSentencia;
import ast.sentencia.PrintlnSentencia;
import ast.sentencia.PrintspSentencia;
import ast.sentencia.ReadSentencia;
import ast.sentencia.ReturnSentencia;
import ast.sentencia.WhileSentencia;
import ast.tipo.ArrayTipo;
import ast.tipo.CharTipo;
import ast.tipo.FloatTipo;
import ast.tipo.IntTipo;
import ast.tipo.StringTipo;
import ast.tipo.Tipo;
import ast.tipo.VoidTipo;
import main.ErrorManager;
import visitor.DefaultVisitor;

// This class will be implemented in type checking phase

public class TypeChecking extends DefaultVisitor {

    private ErrorManager errorManager;
    private ContextMap<String, List<Definicion>> variables = new ContextMap<String, List<Definicion>>();  

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

    // # ----------------------------------------------------------
    /*
    * Implement visit methods here.
    */



    // Visit Methods --------------------------------------------------------------

	// class Program(List<Declaraciones> declaracioneses)
	@Override
	public Object visit(Program program, Object param) {

		// program.getDeclaracioneses().forEach(declaraciones -> declaraciones.accept(this, param));
		super.visit(program, param);

		return null;
	}

	// class Declaracionstructs(String nombre, List<Definicion> definicions)
	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {
		 List<Definicion> defs = new ArrayList<Definicion>(); 
		 declaracionstructs.getDefinicions().forEach(definicion -> {
			 definicion.accept(this, param); 
			 defs.add(definicion); 
			 
		 });
		 variables.put(declaracionstructs.getNombre(), defs);
		//super.visit(declaracionstructs, param);

		return null;
	}

	// class Declaracionglobales(Definicion definicion)
	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {

		// declaracionglobales.getDefinicion().accept(this, param);
		super.visit(declaracionglobales, param);

		return null;
	}

	// class Declaracionfuncion(String nombre, List<Definicion> argumento, Optional<Tipo> tipo, List<Definicion> variablesLocales, List<Sentencia> sentencias)
	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {

		 declaracionfuncion.getArgumento().forEach(definicion -> {
			var aux = tipoSimple(definicion.getTipo()); 
			if(predicate(aux, "El tipo del parametro debe ser simple", declaracionfuncion))
				definicion.accept(this, param); 
		 });
		 declaracionfuncion.getTipo().ifPresent(tipo -> {
		 	var aux = tipoSimple(tipo);  
			if(predicate(aux, "El tipo de retorno debe ser simple o vacio", declaracionfuncion))
				tipo.accept(this, param);
			declaracionfuncion.setTipofunc(tipo); 
		 });
		 if(declaracionfuncion.getTipo().isEmpty()) {
			 declaracionfuncion.setTipofunc(new VoidTipo()); 
		 }; 
		 
		 
		 declaracionfuncion.getVariablesLocales().forEach(definicion -> {definicion.accept(this, param);});
		 declaracionfuncion.getSentencias().forEach(sentencia -> {sentencia.accept(this, param);});
		//super.visit(declaracionfuncion, param);

		return null;
	}

	// class Definicion(String IDENT, Tipo tipo)
	@Override
	public Object visit(Definicion definicion, Object param) {

		// definicion.getTipo().accept(this, param);
		super.visit(definicion, param);

		return null;
	}

	// class PrintSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintSentencia printSentencia, Object param) {

		printSentencia.getExpressions().forEach(expression -> {
		expression.accept(this, param);
		var cond = tipoSimple(expression.getTipoexpresion()); 
		predicate(cond, "print debe tener como argumento tipos basicos", printSentencia);
		if(expression.getTipoexpresion() != null && expression.getTipoexpresion().getClass() == VoidTipo.class) {
			predicate(false, "la funcion no devuelve nada", printSentencia); 
		}
	 }); 
		//super.visit(printSentencia, param);

		return null;
	}

	// class ReadSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(ReadSentencia readSentencia, Object param) {

		// readSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		readSentencia.getExpressions().forEach( expression -> {
			expression.accept(this, param);
			var cond = tipoSimple(expression.getTipoexpresion()); 
			predicate(cond, "print debe tener como argumento tipos basicos", readSentencia);
			predicate(expression.isLvalue(), "no es lvalue", readSentencia); 
		});


		return null;
	}

	// class PrintspSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintspSentencia printspSentencia, Object param) {

		printspSentencia.getExpressions().forEach(expression -> {
		expression.accept(this, param);
		var cond = tipoSimple(expression.getTipoexpresion()); 
		predicate(cond, "print debe tener como argumento tipos basicos", printspSentencia);
		if(expression.getTipoexpresion() != null && expression.getTipoexpresion().getClass() == VoidTipo.class) {
			predicate(false, "la funcion no devuelve nada", printspSentencia); 
		}
	 }); 
		//super.visit(printSentencia, param);

		return null;
	}

	// class PrintlnSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintlnSentencia printlnSentencia, Object param) {

		printlnSentencia.getExpressions().forEach(expression -> {
		expression.accept(this, param);
		var cond = tipoSimple(expression.getTipoexpresion()); 
		predicate(cond, "print debe tener como argumento tipos basicos", printlnSentencia);
		if(expression.getTipoexpresion() != null && expression.getTipoexpresion().getClass() == VoidTipo.class) {
			predicate(false, "la funcion no devuelve nada", printlnSentencia); 
		}
	 }); 
		//super.visit(printSentencia, param);

		return null;
	}

	// class FuncionSentencia(String nombre, List<Expression> argumento)
	// phase Identification { Declaracionfuncion declaracionfuncion, Declaracionfuncion declafuncion }
	@Override
	public Object visit(FuncionSentencia funcionSentencia, Object param) {

		// funcionSentencia.getArgumento().forEach(expression -> expression.accept(this, param));
		var tamArgumentos = funcionSentencia.getDeclaracionfuncion().getArgumento().size() == funcionSentencia.getArgumento().size();
		predicate(tamArgumentos, "numero erroneo de argumentos", funcionSentencia); 
		super.visit(funcionSentencia, param);
		
		if(tamArgumentos)
			for(int i=0; i< funcionSentencia.getArgumento().size(); i++)
				predicate(funcionSentencia.getArgumento().get(i).getTipoexpresion().mismoTipo(
						funcionSentencia.getDeclaracionfuncion().getArgumento().get(i).getTipo()),
							"tipo del argumento erroneo",
							funcionSentencia); 
		

		return null;
	}

	// class AsignacionSentencia(Expression left, Expression expression)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(AsignacionSentencia asignacionSentencia, Object param) {

		// asignacionSentencia.getLeft().accept(this, param);
		// asignacionSentencia.getExpression().accept(this, param);
		super.visit(asignacionSentencia, param);
		var tipoizq = asignacionSentencia.getLeft().getTipoexpresion();
		var tipodrch = asignacionSentencia.getExpression().getTipoexpresion(); 
		predicate(tipoSimple(tipoizq), "El tipo de la izquerida no es tipo simple", asignacionSentencia); 
		predicate(asignacionSentencia.getLeft().isLvalue(), "No es l-value",asignacionSentencia);
		predicate(tipoizq.mismoTipo(tipodrch), "No son del mismo tipo ", asignacionSentencia); 
		
		return null;
	}

	// class ReturnSentencia(Optional<Expression> expression)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(ReturnSentencia returnSentencia, Object param) {

		// returnSentencia.getExpression().ifPresent(expression -> expression.accept(this, param));
		super.visit(returnSentencia, param);
		if(returnSentencia.getDeclafuncion().getTipo().isEmpty()) {
			 var cond = returnSentencia.getExpression().isEmpty();
			 predicate(cond, "No puede tener expresion en función void", returnSentencia); 
		}else if(returnSentencia.getDeclafuncion().getTipo().isPresent() && returnSentencia.getExpression().isPresent()) {
			var cond = returnSentencia.getDeclafuncion().getTipo().get().mismoTipo(returnSentencia.getExpression().get().getTipoexpresion()); 
			predicate(cond, "No coinciden los tipos de retorno", returnSentencia); 
		}else if(returnSentencia.getDeclafuncion().getTipo().isPresent()) {
			var cond = returnSentencia.getExpression().isEmpty(); 
			predicate(!cond, "Debe tener una expresión de retorno", returnSentencia);
		}
		

		return null;
	}

	// class IfSentencia(Expression condicion, List<Sentencia> entonces, List<Sentencia> otro)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(IfSentencia ifSentencia, Object param) {

		 ifSentencia.getCondicion().accept(this, param);
		 
		 predicate(IntTipo.class == ifSentencia.getCondicion().getTipoexpresion().getClass(),
				 	"La condicion de un if debe ser un int",
				 	ifSentencia); 
		 
	     ifSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		 ifSentencia.getOtro().forEach(sentencia -> sentencia.accept(this, param));
		//super.visit(ifSentencia, param);

		return null;
	}

	// class WhileSentencia(Expression condicion, List<Sentencia> entonces)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(WhileSentencia whileSentencia, Object param) {

		 whileSentencia.getCondicion().accept(this, param);
		 predicate(IntTipo.class == whileSentencia.getCondicion().getTipoexpresion().getClass(),
				 	"La condicion de un while debe ser un int",
				 	whileSentencia); 
		 whileSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		//super.visit(whileSentencia, param);

		return null;
	}

	// class IntExpresion(int intValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IntExpresion intExpresion, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// intExpresion.setTipoexpresion(?);
		intExpresion.setTipoexpresion(new IntTipo(intExpresion.getIntValue()+""));
		// intExpresion.setLvalue(?);
		return null;
	}

	// class RealExpresion(double doubleValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(RealExpresion realExpresion, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// realExpresion.setTipoexpresion(?);
		realExpresion.setTipoexpresion(new FloatTipo(realExpresion.getDoubleValue()+""));
		// realExpresion.setLvalue(?);
		return null;
	}

	// class IdentificadorExpresion(String name)
	// phase Identification { Definicion definicion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// identificadorExpresion.setTipoexpresion(?);

		identificadorExpresion.setTipoexpresion(identificadorExpresion.getDefinicion().getTipo());
		// identificadorExpresion.setLvalue(?);
		identificadorExpresion.setLvalue(true);
		return null;
	}

	// class CharExpresion(char charValue)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(CharExpresion charExpresion, Object param) {

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// charExpresion.setTipoexpresion(?);
		charExpresion.setTipoexpresion(new CharTipo(charExpresion.toString()));
		// charExpresion.setLvalue(?);
		charExpresion.setLvalue(false);
		return null;
	}

	// class AccessoArrayExpresion(Expression acceso, Expression indice)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {

		// accessoArrayExpresion.getAcceso().accept(this, param);
		// accessoArrayExpresion.getIndice().accept(this, param);

		super.visit(accessoArrayExpresion, param);

		
		var left = accessoArrayExpresion.getAcceso().getTipoexpresion(); 
		var right = accessoArrayExpresion.getIndice().getTipoexpresion();
		
		var aux = predicate(left.getClass() == ArrayTipo.class, "Acesso a un NO-ARRAY", accessoArrayExpresion); 
		var aux2 = predicate(right.getClass() == IntTipo.class, "Acesso a array con indice no entero", accessoArrayExpresion); 
		
		
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// accessoArrayExpresion.setTipoexpresion(?);
		if( aux && aux2) {			
			ArrayTipo tipoArray = (ArrayTipo) left; 
			accessoArrayExpresion.setTipoexpresion(tipoArray.getTipo());
		}
		// accessoArrayExpresion.setLvalue(?);
		accessoArrayExpresion.setLvalue(true);
		return null;
	}

	// class ParentesisExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(ParentesisExpresion parentesisExpresion, Object param) {

		// parentesisExpresion.getExpression().accept(this, param);
		super.visit(parentesisExpresion, param);

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// parentesisExpresion.setTipoexpresion(?);
		parentesisExpresion.setTipoexpresion(parentesisExpresion.getExpression().getTipoexpresion());
		// parentesisExpresion.setLvalue(?);
		return null;
	}

	// class CastExpresion(Tipo tipo, Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(CastExpresion castExpresion, Object param) {

		// castExpresion.getTipo().accept(this, param);
		// castExpresion.getExpression().accept(this, param);
		super.visit(castExpresion, param);
		
		var tipoCast = castExpresion.getTipo();

		var a1= predicate(tipoCast.getClass() != ArrayTipo.class, "no se puede hacer cast a tipo array", castExpresion); 
		var a2=predicate(tipoCast.getClass() != StringTipo.class, "no se puede hacer cast a tipo struct", castExpresion); 
		
		var a3=predicate(castExpresion.getExpression().getTipoexpresion().getClass() != ArrayTipo.class, "no se puede convertir un array", castExpresion); 
		var a4=predicate(castExpresion.getExpression().getTipoexpresion().getClass() != StringTipo.class, "no se puede convertir un struct", castExpresion); 
		if(a1 && a2 && a3 && a4) {
			predicate(castExpresion.getTipo().getClass() != castExpresion.getExpression().getTipoexpresion().getClass(), 
					"el tipo de la expresión y el tipo destino deben ser distintos", 
					castExpresion); 
			
		}

		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// castExpresion.setTipoexpresion(?);
		castExpresion.setTipoexpresion(castExpresion.getTipo());
		// castExpresion.setLvalue(?);
		castExpresion.setLvalue(false);
		return null;
	}

	// class NegacionExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		// negacionExpresion.getExpression().accept(this, param);
		super.visit(negacionExpresion, param);

		var cond= negacionExpresion.getExpression().getTipoexpresion();
		
		predicate(cond.getClass() == IntTipo.class, "el operando debe ser int", negacionExpresion); 
		
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// negacionExpresion.setTipoexpresion(?);
		negacionExpresion.setTipoexpresion(negacionExpresion.getExpression().getTipoexpresion());
		// negacionExpresion.setLvalue(?);
		negacionExpresion.setLvalue(false);
		return null;
	}

	// class ArithmeticExpresion(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param) {

		// arithmeticExpresion.getLeft().accept(this, param);
		// arithmeticExpresion.getRight().accept(this, param);
		super.visit(arithmeticExpresion, param);
		
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		var valor = nullOVoid(arithmeticExpresion.getLeft().getTipoexpresion()) ||nullOVoid(arithmeticExpresion.getRight().getTipoexpresion());

		
		if(!valor) {
			var cond = sameType(arithmeticExpresion.getLeft(), arithmeticExpresion.getRight());
			var condEntero = arithmeticExpresion.getLeft().getTipoexpresion().getClass() == IntTipo.class || arithmeticExpresion.getRight().getTipoexpresion().getClass() == IntTipo.class; 
			predicate(cond, "ambos operandos tiene quer ser del mismo tipo", arithmeticExpresion); 
			predicate(condEntero, "ambos operandos tienen que ser enteros",arithmeticExpresion); 		
			if(arithmeticExpresion.getOperator().contentEquals("%"))
				predicate(true,"ambos operandos tienen que ser enteros", arithmeticExpresion);
			arithmeticExpresion.setTipoexpresion(arithmeticExpresion.getLeft().getTipoexpresion());
			
		}else {
			predicate(!valor, "la funcion no devuelve nada", arithmeticExpresion); 
		}
			
		arithmeticExpresion.setLvalue(false);
		
		// arithmeticExpresion.setTipoexpresion(?);
		// arithmeticExpresion.setLvalue(?);
		return null;
	}

	// class LogicExpression(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(LogicExpression logicExpression, Object param) {
		// logicExpression.getLeft().accept(this, param);
		// logicExpression.getRight().accept(this, param);
		super.visit(logicExpression, param);

		var tipo1 = logicExpression.getLeft().getTipoexpresion(); 
		var tipo2 = logicExpression.getRight().getTipoexpresion();
		
		var cond = (tipo1.getClass() == IntTipo.class) || (tipo2.getClass() == IntTipo.class);
		predicate(cond, "ambos operandos tienen que ser enteros", logicExpression); 
		var cond2 = (tipo1.getClass() == tipo2.getClass()); 
		predicate(cond2, "ambos operandos deben ser del mismo tipo", logicExpression); 
		
		
		
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// logicExpression.setTipoexpresion(?);
		logicExpression.setTipoexpresion(logicExpression.getLeft().getTipoexpresion());
		// logicExpression.setLvalue(?);
		logicExpression.setLvalue(false);
		return null;
	}

	// class BoolExpression(Expression left, String operator, Expression right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(BoolExpression boolExpression, Object param) {

		// boolExpression.getLeft().accept(this, param);
		// boolExpression.getRight().accept(this, param);
		super.visit(boolExpression, param);
		
		predicate(boolExpression.getLeft().getTipoexpresion().getClass() == IntTipo.class, "El primer operando debe ser entero", boolExpression); 
		predicate(boolExpression.getRight().getTipoexpresion().getClass() == IntTipo.class, "El segundo operando debe ser entero", boolExpression); 
		
		
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// boolExpression.setTipoexpresion(?);
		boolExpression.setTipoexpresion(boolExpression.getLeft().getTipoexpresion());
		// boolExpression.setLvalue(?);
		boolExpression.setLvalue(false);
		return null;
	}

	// class AcederCap(Expression left, String right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AcederCap acederCap, Object param) {

		// acederCap.getLeft().accept(this, param);
		super.visit(acederCap, param);
		

		var cond =predicate(acederCap.getLeft().getTipoexpresion().getClass() == StringTipo.class, "acesso a no-array", acederCap);
		
		if(cond) {
			IdentificadorExpresion exp = (IdentificadorExpresion) acederCap.getLeft();
			StringTipo est = (StringTipo) exp.getTipoexpresion();
			var listadef = variables.getFromAny(est.getName());
			for(Definicion def : listadef) {
				if(def.getIDENT().equals(acederCap.getRight())) {
					acederCap.setTipoexpresion(def.getTipo());
					acederCap.setLvalue(true);
					return null; 
				}
			}
			predicate(false, "El campo no existe", acederCap); 
			
		}
			
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// acederCap.setTipoexpresion(?);
		// acederCap.setLvalue(?);
		return null;
	}

	// class FuncionExpresion(String nombre, List<Expression> argumentos)
	// phase Identification { Declaracionfuncion declaracionfuncion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(FuncionExpresion funcionExpresion, Object param) {

		// funcionExpresion.getArgumentos().forEach(expression -> expression.accept(this, param));
		
		var tamArgumentos = funcionExpresion.getDeclaracionfuncion().getArgumento().size() == funcionExpresion.getArgumentos().size(); 
		predicate(tamArgumentos, "numero erroneo de argumentos", funcionExpresion); 
		super.visit(funcionExpresion, param);
		
		if(tamArgumentos)
			for(int i=0; i< funcionExpresion.getArgumentos().size(); i++)
				predicate(funcionExpresion.getArgumentos().get(i).getTipoexpresion().getClass() ==
						funcionExpresion.getDeclaracionfuncion().getArgumento().get(i).getTipo().getClass(),
							"tipo del argumento erroneo",
							funcionExpresion); 
				 
		
		
		
		// TODO: Remember to initialize SYNTHESIZED attributes <-----
		// funcionExpresion.setTipoexpresion(?);
		funcionExpresion.setTipoexpresion(funcionExpresion.getDeclaracionfuncion().getTipofunc());
		funcionExpresion.setLvalue(false);
		// funcionExpresion.setLvalue(?);
		return null;
	}

	// class IntTipo(String name)
	@Override
	public Object visit(IntTipo intTipo, Object param) {

		return null;
	}

	// class FloatTipo(String name)
	@Override
	public Object visit(FloatTipo floatTipo, Object param) {

		return null;
	}

	// class CharTipo(String name)
	@Override
	public Object visit(CharTipo charTipo, Object param) {

		return null;
	}

	// class ArrayTipo(int tamArray, Tipo tipo)
	@Override
	public Object visit(ArrayTipo arrayTipo, Object param) {
		
		// arrayTipo.getTipo().accept(this, param);
		super.visit(arrayTipo, param);

		return null;
	}

	// class StringTipo(String name)
	@Override
	public Object visit(StringTipo stringTipo, Object param) {
		
		return null;
	}

    //# ----------------------------------------------------------
    //# Auxiliary methods (optional)

    private void notifyError(String errorMessage, Position position) {
        errorManager.notify("Type Checking", errorMessage, position);
    }

    private void notifyError(String msg) {
        errorManager.notify("Type Checking", msg);
    }

    /**
     * predicate. Auxiliary method to implement predicates. Delete if not needed.
     *
     * Usage examples:
     *
     *    predicate(expr.type != null), "Type cannot be null", expr.start());
     *
     *    predicate(expr.type != null), "Type cannot be null", expr);       // expr.start() is assumed
     *
     * The start() method (example 1) indicates the position in the file where the node was. If VGen is used, this method
     * will have been generated in all AST nodes.
     *
     * @param condition     Must be met to avoid an error
     * @param errorMessage  Printed if the condition is not met
     * @param errorPosition Row and column in the file where the error occurred.
     * @return true if the condition is met
     */

    private boolean predicate(boolean condition, String errorMessage, Position position) {
        if (!condition) {
            notifyError(errorMessage, position);
            return false;
        }

        return true;
    }

    private boolean sameType(Expression a, Expression b) {
    	return (a.getTipoexpresion().getClass() == b.getTipoexpresion().getClass()); 
    }
    private boolean predicate(boolean condition, String errorMessage, AST node) {
        return predicate(condition, errorMessage, node.start());
    }
    private boolean tipoSimple(Tipo a) {
    	if(a == null || a.getClass() == VoidTipo.class)
    		return false; 
    	return a.getClass().equals(IntTipo.class) || a.getClass().equals(FloatTipo.class) || a.getClass().equals(CharTipo.class); 
    }
    /**
     * 
     * @param a
     * @return true si el tipo es null o void 
     */
    private boolean nullOVoid(Tipo a) {
    	return a == null || a.getClass() == VoidTipo.class; 
    }

}
