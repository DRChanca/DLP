package semantic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;

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
import main.ErrorManager;
import visitor.DefaultVisitor;

// This class will be implemented in identification phase

public class Identification extends DefaultVisitor {

    private ErrorManager errorManager;
    private ContextMap<String, Declaracionfuncion> funciones = new ContextMap<String, Declaracionfuncion>();
    private ContextMap<String, Declaracionstructs> estructuras = new ContextMap<String, Declaracionstructs>(); 
    private ContextMap<String, Definicion> variables = new ContextMap<String, Definicion>();  

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public void process(AST ast) {
        ast.accept(this, null);
    }

	@Override
	public Object visit(FuncionSentencia funcionSentencia, Object param) {
		var definition = funciones.getFromAny(funcionSentencia.getNombre());
		if(definition == null)
			this.notifyError("Invocando a una funcion sin inicializar "+funcionSentencia.getNombre());
		else
			funcionSentencia.setDeclaracionfuncion(definition);

		return null;
	}

	@Override
	public Object visit(Program program, Object param) {

		// program.getDeclaracioneses().forEach(declaraciones -> declaraciones.accept(this, param));
		super.visit(program, param);

		return null;
	}

	// class Declaracionstructs(String nombre, List<Definicion> definicions)
	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {

		// declaracionstructs.getDefinicions().forEach(definicion -> definicion.accept(this, param));
		var struct = estructuras.getFromAny(declaracionstructs.getNombre());
		if(struct != null) {
			notifyError("Se intenta crear una estructura ya definida: "+declaracionstructs.getNombre());
		}else {
			estructuras.put(declaracionstructs.getNombre(), declaracionstructs); 
		}
		
		
		
		variables.set();
		var listaDefiniciones = declaracionstructs.getDefinicions(); 
		for(var def : listaDefiniciones) {
			var aux = variables.getFromTop(def.getIDENT()); 
			if(aux != null)
				notifyError("Variable ya definida en el ambito "+ def.getIDENT());
			else
				variables.put(def.getIDENT(), def);
			
		}
		variables.reset();

		return null;
	}

	// class Declaracionglobales(Definicion definicion)
	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {

		// declaracionglobales.getDefinicion().accept(this, param);
		
		
		var aux = declaracionglobales.getDefinicion().getIDENT();
		var dfGlobal = variables.getFromAny(aux); 
		
		if(dfGlobal != null)
			notifyError("Variable global ya definida "+aux);
		else
			variables.put(aux, declaracionglobales.getDefinicion());
		
		super.visit(declaracionglobales, param);

		return null;
	}

	// class Declaracionfuncion(String nombre, List<Definicion> argumento, Optional<Tipo> tipo, List<Definicion> variablesLocales, List<Sentencia> sentencias)
	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {
		
		
		for (var sentencia : declaracionfuncion.getSentencias()) {
			// TODO: Remember to initialize INHERITED attributes <----
			// sentencia.setDeclafuncion(?);
			sentencia.setDeclafuncion(declaracionfuncion);

		}
		
		
		var definition = funciones.getFromAny(declaracionfuncion.getNombre()); 

		if(definition != null)
			notifyError("Intentando declarar una funcion ya definida "+ definition.getNombre());
		else
			funciones.put(declaracionfuncion.getNombre(),declaracionfuncion); 
		
		
		// lista Argumetnos declaracionfuncion.getArgumento().forEach(definicion -> definicion.accept(this, param));
		variables.set();
		var argumentos = declaracionfuncion.getArgumento(); 
		for( var argu : argumentos) {
			var nombre = argu.getIDENT(); 
			var ob = variables.getFromTop(nombre); 
			if(ob != null) {
				notifyError("Intentando declarar un argumento ya definido "+ob.getIDENT());
			}else {
				variables.put(nombre, argu);
			}
		}
		
		declaracionfuncion.getTipo().ifPresent(tipo -> tipo.accept(this, param));
		
		//LIsta de variables locales
		var listaLocales = declaracionfuncion.getVariablesLocales();
		for( var variable : listaLocales) {
			var nombre = variable.getIDENT(); 
			var ob = variables.getFromTop(nombre); 
			if(ob != null) {
				notifyError("Intentando declara una funcion ya definida "+ob.getIDENT());
			}else {
				variables.put(nombre, variable);
			}
		}
		
		declaracionfuncion.getSentencias().forEach(sentencia -> sentencia.accept(this, param));
		
		
		variables.reset();
		
		return null;
	}
	
	// class BoolExpression(Expression left, String operator, Expression right)
	@Override
	public Object visit(BoolExpression boolExpression, Object param) {

		// boolExpression.getLeft().accept(this, param);
		// boolExpression.getRight().accept(this, param);
		super.visit(boolExpression, param);

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
	@Override
	public Object visit(PrintSentencia printSentencia, Object param) {

		// printSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printSentencia, param);

		return null;
	}

	// class ReadSentencia(List<Expression> expressions)
	@Override
	public Object visit(ReadSentencia readSentencia, Object param) {

		// readSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(readSentencia, param);

		return null;
	}

	// class PrintspSentencia(List<Expression> expressions)
	@Override
	public Object visit(PrintspSentencia printspSentencia, Object param) {

		// printspSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printspSentencia, param);

		return null;
	}

	// class PrintlnSentencia(List<Expression> expressions)
	@Override
	public Object visit(PrintlnSentencia printlnSentencia, Object param) {

		// printlnSentencia.getExpressions().forEach(expression -> expression.accept(this, param));
		super.visit(printlnSentencia, param);

		return null;
	}



	// class AsignacionSentencia(Expression left, Expression expression)
	@Override
	public Object visit(AsignacionSentencia asignacionSentencia, Object param) {

		// asignacionSentencia.getLeft().accept(this, param);
		// asignacionSentencia.getExpression().accept(this, param);
		super.visit(asignacionSentencia, param);

		return null;
	}

	// class ReturnSentencia(Optional<Expression> expression)
	@Override
	public Object visit(ReturnSentencia returnSentencia, Object param) {

		// returnSentencia.getExpression().ifPresent(expression -> expression.accept(this, param));
		
		super.visit(returnSentencia, param);
		

		return null;
	}

	// class IfSentencia(Expression condicion, List<Sentencia> entonces, List<Sentencia> otro)
	@Override
	public Object visit(IfSentencia ifSentencia, Object param) {

		// ifSentencia.getCondicion().accept(this, param);
		// ifSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		// ifSentencia.getOtro().forEach(sentencia -> sentencia.accept(this, param));
		super.visit(ifSentencia, param);

		return null;
	}

	// class WhileSentencia(Expression condicion, List<Sentencia> entonces)
	@Override
	public Object visit(WhileSentencia whileSentencia, Object param) {

		// whileSentencia.getCondicion().accept(this, param);
		// whileSentencia.getEntonces().forEach(sentencia -> sentencia.accept(this, param));
		super.visit(whileSentencia, param);

		return null;
	}

	// class IntExpresion(int intValue)
	@Override
	public Object visit(IntExpresion intExpresion, Object param) {

		return null;
	}

	// class RealExpresion(double doubleValue)
	@Override
	public Object visit(RealExpresion realExpresion, Object param) {

		return null;
	}

	// class IdentificadorExpresion(String name)
	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {
		var nombre = identificadorExpresion.getName(); 
		var aux = variables.getFromAny(nombre); 
		if(aux == null) {
			notifyError("Intentado acceder a un valor sin especificar "+ nombre);
		}else {
			identificadorExpresion.setDefinicion(aux);
		}
		
		return null;
	}

	// class CharExpresion(char charValue)
	@Override
	public Object visit(CharExpresion charExpresion, Object param) {

		return null;
	}

	// class AccessoArrayExpresion(Expression acceso, Expression indice)
	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {

		// accessoArrayExpresion.getAcceso().accept(this, param);
		// accessoArrayExpresion.getIndice().accept(this, param);
		super.visit(accessoArrayExpresion, param);

		return null;
	}

	// class ParentesisExpresion(Expression expression)
	@Override
	public Object visit(ParentesisExpresion parentesisExpresion, Object param) {

		// parentesisExpresion.getExpression().accept(this, param);
		super.visit(parentesisExpresion, param);

		return null;
	}

	// class CastExpresion(Tipo tipo, Expression expression)
	@Override
	public Object visit(CastExpresion castExpresion, Object param) {

		// castExpresion.getTipo().accept(this, param);
		// castExpresion.getExpression().accept(this, param);
		super.visit(castExpresion, param);

		return null;
	}

	// class NegacionExpresion(Expression expression)
	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		// negacionExpresion.getExpression().accept(this, param);
		super.visit(negacionExpresion, param);

		return null;
	}

	// class ArithmeticExpresion(Expression left, String operator, Expression right)
	@Override
	public Object visit(ArithmeticExpresion arithmeticExpresion, Object param) {

		// arithmeticExpresion.getLeft().accept(this, param);
		// arithmeticExpresion.getRight().accept(this, param);
		super.visit(arithmeticExpresion, param);

		return null;
	}

	// class LogicExpression(Expression left, String operator, Expression right)
	@Override
	public Object visit(LogicExpression logicExpression, Object param) {

		// logicExpression.getLeft().accept(this, param);
		// logicExpression.getRight().accept(this, param);
		super.visit(logicExpression, param);

		return null;
	}

	// class AcederCap(Expression left, String right)
	@Override
	public Object visit(AcederCap acederCap, Object param) {

		// acederCap.getLeft().accept(this, param);
		super.visit(acederCap, param);

		return null;
	}

	// class FuncionExpresion(String nombre, List<Expression> argumentos)
	@Override
	public Object visit(FuncionExpresion funcionExpresion, Object param) {

		// funcionExpresion.getArgumentos().forEach(expression -> expression.accept(this, param));
		
		var func = funciones.getFromAny(funcionExpresion.getNombre()); 
		
		if(func == null)
			notifyError("Se intenta llamar a una expresion no definida con nombre "+funcionExpresion.getNombre());
		else
			funcionExpresion.setDeclaracionfuncion(func);
		
		super.visit(funcionExpresion, param);

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
		var aux = stringTipo.getName(); 
		var objeto = estructuras.getFromAny(aux); 
		if(objeto == null)
			notifyError("Declaracion de campo no definido " + aux);
		
		return null;
	}
    

    private void notifyError(String msg) {
        errorManager.notify("Identification", msg);
    }

    private void notifyError(String msg, Position position) {
        errorManager.notify("Identification", msg, position);
    }

    private void notifyError(String msg, AST node) {
        notifyError(msg, node.start());
    }

}
