// Generated with VGen 2.0.0

package ast.expression;

import ast.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	identificadorExpresion: expression -> name:string
	expression -> 
	
	PHASE Identification
	identificadorExpresion -> definicion:definicion
*/
public class IdentificadorExpresion extends AbstractExpression  {

    // ----------------------------------
    // Instance Variables

	// identificadorExpresion: expression -> string
	private String name;

    // PHASE Identification
	private Definicion definicion;

    // ----------------------------------
    // Constructors

	public IdentificadorExpresion(String name) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(name);
	}

	public IdentificadorExpresion(Object name) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(name);
	}


    // ----------------------------------
    // identificadorExpresion: expression -> string

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }



    // --------------------------------
    // PHASE Identification

	// Attribute 'definicion' 

	public void setDefinicion(Definicion definicion) {
		if (definicion == null)
			throw new IllegalArgumentException("Parameter 'definicion' can't be null. Pass a non-null value or use 'definicion?' in the abstract grammar");
		this.definicion = definicion;

	}

    public Definicion getDefinicion() {
        return definicion;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "IdentificadorExpresion{" + " name=" + this.getName() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
