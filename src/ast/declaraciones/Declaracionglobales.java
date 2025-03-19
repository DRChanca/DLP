// Generated with VGen 2.0.0

package ast.declaraciones;

import ast.*;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	declaracionglobales: declaraciones -> definicion:definicion
	declaraciones -> 
*/
public class Declaracionglobales extends AbstractDeclaraciones  {

    // ----------------------------------
    // Instance Variables

	// declaracionglobales: declaraciones -> definicion
	private Definicion definicion;

    // ----------------------------------
    // Constructors

	public Declaracionglobales(Definicion definicion) {
		super();

		if (definicion == null)
			throw new IllegalArgumentException("Parameter 'definicion' can't be null. Pass a non-null value or use 'definicion?' in the abstract grammar");
		this.definicion = definicion;

		updatePositions(definicion);
	}

	public Declaracionglobales(Object definicion) {
		super();

        if (definicion == null)
            throw new IllegalArgumentException("Parameter 'definicion' can't be null. Pass a non-null value or use 'definicion?' in the abstract grammar");
		this.definicion = (Definicion) definicion;

		updatePositions(definicion);
	}


    // ----------------------------------
    // declaracionglobales: declaraciones -> definicion

	// Child 'definicion' 

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
        return "Declaracionglobales{" + " definicion=" + this.getDefinicion() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
