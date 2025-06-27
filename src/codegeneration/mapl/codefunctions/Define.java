// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.declaraciones.*;
import ast.tipo.Tipo;
import ast.tipo.VoidTipo;
import codegeneration.mapl.*;


public class Define extends AbstractCodeFunction {

    public Define(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Declaracionstructs(String nombre, List<Definicion> definicions)
	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {
		out("#type "+declaracionstructs.getNombre()+": {"); 
		declaracionstructs.getDefinicions().forEach(p->{
			out(p.getIDENT()+":"+p.getTipo().tipoMapl()); 
		});
		
		out("}"); 
		return null;
	}

	// class Declaracionglobales(Definicion definicion)
	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {
		out("#global "+declaracionglobales.getDefinicion().getIDENT()+":"+declaracionglobales.getDefinicion().getTipo().tipoMapl()); 
	

		return null;
	}

	// class Declaracionfuncion(String nombre, List<Definicion> argumento, Optional<Tipo> tipo, List<Definicion> variablesLocales, List<Sentencia> sentencias)
	// phase TypeChecking { Tipo tipofunc }
	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {
		out("#func "+declaracionfuncion.getNombre());
		out(declaracionfuncion.getNombre()+":"); 
		
		
		declaracionfuncion.getArgumento().forEach(arg -> {
			out( "#param "+arg.getIDENT()+":"+arg.getTipo().tipoMapl());
			
		});
		
		var acumuladorParam = declaracionfuncion.getArgumento()
					.stream()
					.mapToInt(p -> p.getTipo().getSize())
					.sum(); 
		var acumuladorVar = declaracionfuncion.getVariablesLocales()
					.stream()
					.mapToInt(p -> p.getTipo().getSize())
					.sum(); 
		declaracionfuncion.getVariablesLocales()
				.forEach(p -> out("#local "+p.getIDENT()+":"+p.getTipo().tipoMapl())); 
		out("#ret "+declaracionfuncion.getTipofunc().tipoMapl()); 
		out("enter "+acumuladorVar); 
		ejecuta(declaracionfuncion.sentencias());
		if(declaracionfuncion.getTipo().isEmpty())
			out("ret 0, "+acumuladorVar+", "+acumuladorParam); 
		else
			out("ret "+declaracionfuncion.getTipo().get().getSize()+", "+acumuladorVar+", "+acumuladorParam); 


		return null;
	}
		

}
