// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import java.lang.invoke.TypeDescriptor.OfField;

import ast.expression.*;
import ast.tipo.StringTipo;
import codegeneration.mapl.*;


public class Direccion extends AbstractCodeFunction {

    public Direccion(MaplCodeSpecification specification) {
        super(specification);
    }



	// class IdentificadorExpresion(String name)
	// phase Identification { Definicion definicion }
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(IdentificadorExpresion identificadorExpresion, Object param) {
		var aux = identificadorExpresion.getDefinicion();
		
		if(identificadorExpresion.getDefinicion().scope == 0) {
			//variable global
			out("pusha "+aux.getAddress());		
		}else if (identificadorExpresion.getDefinicion().scope == 1) {
			//argumento 
			out("pusha BP"); 
			out("pusha "+ aux.getAddress());
			out("add"); 
		}else if (identificadorExpresion.getDefinicion().scope == 2)
		{
			//variable local 
			out("pusha BP "); 
			out("pusha "+-aux.getAddress()); 
			out("subi"); 
		}
		return null;
	}


	// class AccessoArrayExpresion(Expression acceso, Expression indice)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AccessoArrayExpresion accessoArrayExpresion, Object param) {
	
		direccion(accessoArrayExpresion.getAcceso());
		valor(accessoArrayExpresion.getIndice());
	
		out("pushi "+accessoArrayExpresion.getTipoexpresion().getSize()); 
		out("mul"); 
		out("add"); 
		 
		return null;
	}

	// class ParentesisExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(ParentesisExpresion parentesisExpresion, Object param) {

		// valor(parentesisExpresion.getExpression());
		// direccion(parentesisExpresion.getExpression());
		if(parentesisExpresion.getExpression().isLvalue())
			direccion(parentesisExpresion.getExpression()); 

		return null;
	}

	// class CastExpresion(Tipo tipo, Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(CastExpresion castExpresion, Object param) {

		// valor(castExpresion.getExpression());
		// direccion(castExpresion.getExpression());

		if(castExpresion.getExpression().isLvalue())
			direccion(castExpresion.getExpression()); 

		return null;
	}

	// class NegacionExpresion(Expression expression)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(NegacionExpresion negacionExpresion, Object param) {

		// valor(negacionExpresion.getExpression());
		// direccion(negacionExpresion.getExpression());

		out("<instruction>");

		return null;
	}




	// class AcederCap(Expression left, String right)
	// phase TypeChecking { Tipo tipoexpresion, boolean lvalue }
	@Override
	public Object visit(AcederCap acederCap, Object param) {
		
		direccion(acederCap.getLeft()); 
		var struct = (StringTipo)acederCap.getLeft().getTipoexpresion();
		struct.getDefinicions().forEach(p -> {
			if(p.getIDENT().equalsIgnoreCase(acederCap.getRight())) {	
				out("pushi "+p.getAddress()); 
			}
		}); 
		out("add"); 

		return null;
	}



}
