// Generated with VGen 2.0.0

package ast.sentencia;

import ast.expression.*;
import ast.declaraciones.*;
import ast.tipo.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	funcionSentencia: sentencia -> nombre:string argumento:expression*
	sentencia -> 
	
	PHASE Identification
	funcionSentencia -> declaracionfuncion:declaracionfuncion
	sentencia -> declafuncion:declaracionfuncion
	
	PHASE TypeChecking
	funcionSentencia -> tipofunc:tipo
*/
public class FuncionSentencia extends AbstractSentencia  {

    // ----------------------------------
    // Instance Variables

	// funcionSentencia: sentencia -> nombre:string argumento:expression*
	private String nombre;
	private List<Expression> argumento;

    // PHASE Identification
	private Declaracionfuncion declaracionfuncion;

    // PHASE TypeChecking
	private Tipo tipofunc;

    // ----------------------------------
    // Constructors

	public FuncionSentencia(String nombre, List<Expression> argumento) {
		super();

		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

		if (argumento == null)
			argumento = new ArrayList<>();
		this.argumento = argumento;

		updatePositions(nombre, argumento);
	}

	public FuncionSentencia(Object nombre, Object argumento) {
		super();

        if (nombre == null)
            throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getText() : (String) nombre;

        this.argumento = castList(argumento, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(nombre, argumento);
	}


    // ----------------------------------
    // funcionSentencia: sentencia -> nombre:string argumento:expression*

	// Child 'nombre:string' 

	public void setNombre(String nombre) {
		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

	}

    public String getNombre() {
        return nombre;
    }


	// Child 'argumento:expression*' 

	public void setArgumento(List<Expression> argumento) {
		if (argumento == null)
			argumento = new ArrayList<>();
		this.argumento = argumento;

	}

    public List<Expression> getArgumento() {
        return argumento;
    }

    public Stream<Expression> argumento() {
        return argumento.stream();
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'declaracionfuncion' 

	public void setDeclaracionfuncion(Declaracionfuncion declaracionfuncion) {
		if (declaracionfuncion == null)
			throw new IllegalArgumentException("Parameter 'declaracionfuncion' can't be null. Pass a non-null value or use 'declaracionfuncion?' in the abstract grammar");
		this.declaracionfuncion = declaracionfuncion;

	}

    public Declaracionfuncion getDeclaracionfuncion() {
        return declaracionfuncion;
    }



    // --------------------------------
    // PHASE TypeChecking

	// Attribute 'tipofunc:tipo' 

	public void setTipofunc(Tipo tipofunc) {
		if (tipofunc == null)
			throw new IllegalArgumentException("Parameter 'tipofunc' can't be null. Pass a non-null value or use 'tipo?' in the abstract grammar");
		this.tipofunc = tipofunc;

	}

    public Tipo getTipofunc() {
        return tipofunc;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FuncionSentencia{" + " nombre=" + this.getNombre() + " argumento=" + this.getArgumento() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
