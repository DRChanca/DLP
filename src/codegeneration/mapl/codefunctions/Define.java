// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.declaraciones.*;
import codegeneration.mapl.*;


public class Define extends AbstractCodeFunction {

    public Define(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Declaracionstructs(String nombre, List<Definicion> definicions)
	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {

		return null;
	}

	// class Declaracionglobales(Definicion definicion)
	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {

	

		return null;
	}

	// class Declaracionfuncion(String nombre, List<Definicion> argumento, Optional<Tipo> tipo, List<Definicion> variablesLocales, List<Sentencia> sentencias)
	// phase TypeChecking { Tipo tipofunc }
	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {

		ejecuta(declaracionfuncion.sentencias());


		return null;
	}

}
