// Generated with VGen 2.0.0

package ast.expression;

import ast.declaraciones.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	funcionExpresion: expression -> nombre:string argumentos:expression*
	expression -> 
	
	PHASE Identification
	funcionExpresion -> declaracionfuncion:declaracionfuncion
*/
public class FuncionExpresion extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// funcionExpresion: expression -> nombre:string argumentos:expression*
	private String nombre;
	private List<Expression> argumentos;

    // PHASE Identification
	private Declaracionfuncion declaracionfuncion;

    // ----------------------------------
    // Constructors

	public FuncionExpresion(String nombre, List<Expression> argumentos) {
		super();

		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

		if (argumentos == null)
			argumentos = new ArrayList<>();
		this.argumentos = argumentos;

		updatePositions(nombre, argumentos);
	}

	public FuncionExpresion(Object nombre, Object argumentos) {
		super();

        if (nombre == null)
            throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getText() : (String) nombre;

        this.argumentos = castList(argumentos, unwrapIfContext.andThen(Expression.class::cast));
		updatePositions(nombre, argumentos);
	}


    // ----------------------------------
    // funcionExpresion: expression -> nombre:string argumentos:expression*

	// Child 'nombre:string' 

	public void setNombre(String nombre) {
		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

	}

    public String getNombre() {
        return nombre;
    }


	// Child 'argumentos:expression*' 

	public void setArgumentos(List<Expression> argumentos) {
		if (argumentos == null)
			argumentos = new ArrayList<>();
		this.argumentos = argumentos;

	}

    public List<Expression> getArgumentos() {
        return argumentos;
    }

    public Stream<Expression> argumentos() {
        return argumentos.stream();
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


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FuncionExpresion{" + " nombre=" + this.getNombre() + " argumentos=" + this.getArgumentos() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
