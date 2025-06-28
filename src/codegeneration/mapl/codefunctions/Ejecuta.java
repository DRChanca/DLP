// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import java.util.Random;

import ast.sentencia.*;
import ast.tipo.VoidTipo;
import codegeneration.mapl.*;


public class Ejecuta extends AbstractCodeFunction {

	public static Random r = new Random(); 
    public Ejecuta(MaplCodeSpecification specification) {
        super(specification);
    }


	// class PrintSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintSentencia printSentencia, Object param) {

		coment(printSentencia); 
		printSentencia.getExpressions().forEach( expr -> {
			valor(expr);
			out("out"+expr.getTipoexpresion().sufijo()); 
		});


		return null;
	}

	// class ReadSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(ReadSentencia readSentencia, Object param) {

		// valor(readSentencia.expressions());
		// direccion(readSentencia.expressions());
		var valor = readSentencia.getExpressions().getFirst(); 
		direccion(valor); 
		out("in"+valor.getTipoexpresion().sufijo()); 
		out("store"+valor.getTipoexpresion().sufijo()); 

		return null;
	}

	// class PrintspSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintspSentencia printspSentencia, Object param) {

		coment(printspSentencia); 
		printspSentencia.getExpressions().forEach( expr -> {
			valor(expr);
			out("out"+expr.getTipoexpresion().sufijo()); 
			out("pushb 32"); 
			out("outb"); 
		});
		
		if(printspSentencia.getExpressions().size() == 0) {
			out("pushb 32"); 
			out("outb"); 
		}

		return null;
	}




	// class PrintlnSentencia(List<Expression> expressions)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(PrintlnSentencia printlnSentencia, Object param) {

		coment(printlnSentencia); 
		printlnSentencia.getExpressions().forEach( expr -> {
			valor(expr);
			out("out"+expr.getTipoexpresion().sufijo()); 
			out("pushb 10"); 
			out("outb"); 
		});
		
		if(printlnSentencia.getExpressions().size() == 0) {
			out("pushb 10"); 
			out("outb"); 
		}

		return null;
	}

	// class FuncionSentencia(String nombre, List<Expression> argumento)
	// phase Identification { Declaracionfuncion declaracionfuncion, Declaracionfuncion declafuncion }
	// phase TypeChecking { Tipo tipofunc }
	@Override
	public Object visit(FuncionSentencia funcionSentencia, Object param) {
		
		funcionSentencia.getArgumento().forEach(arg -> {
			valor(arg); 
		});
		
		out("call "+funcionSentencia.getNombre());

		if(funcionSentencia.getDeclaracionfuncion().getTipo().isPresent() && funcionSentencia.getDeclaracionfuncion().getTipo().get().getClass() != VoidTipo.class) {
			out("pop"+funcionSentencia.getDeclaracionfuncion().getTipo().get().sufijo()); 
		}
		

		// valor(funcionSentencia.argumento());
		// direccion(funcionSentencia.argumento());


		return null;
	}

	// class AsignacionSentencia(Expression left, Expression expression)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(AsignacionSentencia asignacionSentencia, Object param) {
		coment(asignacionSentencia);
		
		direccion(asignacionSentencia.getLeft()); 

		valor(asignacionSentencia.getExpression()); 
		out("store"+asignacionSentencia.getLeft().getTipoexpresion().sufijo()); 


		return null;
	}

	// class ReturnSentencia(Optional<Expression> expression)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(ReturnSentencia returnSentencia, Object param) {

		// direccion(returnSentencia.getExpression());
		 if(returnSentencia.getExpression().isPresent()) {
			 valor(returnSentencia.getExpression().get());
		 
		 //out("ret "+returnSize+", "+variablesLocalesSize+", "+parametrosSize); 
		 }

		return null;
	}

	// class IfSentencia(Expression condicion, List<Sentencia> entonces, List<Sentencia> otro)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(IfSentencia ifSentencia, Object param) {
		coment(ifSentencia);
		
		valor(ifSentencia.getCondicion());
		
		var valorAleatorio = r.nextInt(0, 50000);
		var etiquetaElse = "else_"+valorAleatorio; 
		var etiquetaFinal = "end_if_else_"+valorAleatorio;
		
		if(ifSentencia.otro().count() != 0) {
			out("jz "+etiquetaElse); 
			ifSentencia.getEntonces().forEach( p -> ejecuta(p));
			out("jmp "+etiquetaFinal);
			out(etiquetaElse+":"); 
			ifSentencia.getOtro().forEach(p -> ejecuta(p));
		}else {
			out("jz "+etiquetaFinal); 
			ifSentencia.getEntonces().forEach( p -> p.accept(this, param));
		}
		out(etiquetaFinal+":"); 
		
	
		
		// direccion(ifSentencia.getCondicion());

		// ejecuta(ifSentencia.entonces());

		// ejecuta(ifSentencia.otro());

		

		return null;
	}

	// class WhileSentencia(Expression condicion, List<Sentencia> entonces)
	// phase Identification { Declaracionfuncion declafuncion }
	@Override
	public Object visit(WhileSentencia whileSentencia, Object param) {

		// valor(whileSentencia.getCondicion());
		// direccion(whileSentencia.getCondicion());
		// ejecuta(whileSentencia.entonces());
		int numero = r.nextInt(0,50000); 
		String inicio_condicion = "inicio_condicion"+numero; 
		String final_condicion = "final_condicion"+numero; 
		out(inicio_condicion+":"); 
		valor(whileSentencia.getCondicion()); 
		out("jz "+final_condicion);
		whileSentencia.getEntonces().forEach(p -> ejecuta(p));
		out("jmp "+inicio_condicion); 
		out(final_condicion+":"); 


		return null;
	}
	
	private void coment(AbstractSentencia sentencia) {
		try {
			if(sentencia != null) {
				out("\n#line "+sentencia.end().getLine()); 
		}} catch(Exception e) {
			
		}
			
		
		
	}

}
