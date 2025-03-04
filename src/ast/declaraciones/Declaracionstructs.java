// Generated with VGen 2.0.0

package ast.declaraciones;

import ast.*;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	declaracionstructs: declaraciones -> nombre:string declaracion:declaracion
	declaraciones -> 
*/
public class Declaracionstructs extends AbstractDeclaraciones  {

    // ----------------------------------
    // Instance Variables

	// declaracionstructs: declaraciones -> nombre:string declaracion
	private String nombre;
	private Declaracion declaracion;

    // ----------------------------------
    // Constructors

	public Declaracionstructs(String nombre, Declaracion declaracion) {
		super();

		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

		if (declaracion == null)
			throw new IllegalArgumentException("Parameter 'declaracion' can't be null. Pass a non-null value or use 'declaracion?' in the abstract grammar");
		this.declaracion = declaracion;

		updatePositions(nombre, declaracion);
	}

	public Declaracionstructs(Object nombre, Object declaracion) {
		super();

        if (nombre == null)
            throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getText() : (String) nombre;

        if (declaracion == null)
            throw new IllegalArgumentException("Parameter 'declaracion' can't be null. Pass a non-null value or use 'declaracion?' in the abstract grammar");
		this.declaracion = (Declaracion) declaracion;

		updatePositions(nombre, declaracion);
	}


    // ----------------------------------
    // declaracionstructs: declaraciones -> nombre:string declaracion

	// Child 'nombre:string' 

	public void setNombre(String nombre) {
		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

	}

    public String getNombre() {
        return nombre;
    }


	// Child 'declaracion' 

	public void setDeclaracion(Declaracion declaracion) {
		if (declaracion == null)
			throw new IllegalArgumentException("Parameter 'declaracion' can't be null. Pass a non-null value or use 'declaracion?' in the abstract grammar");
		this.declaracion = declaracion;

	}

    public Declaracion getDeclaracion() {
        return declaracion;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Declaracionstructs{" + " nombre=" + this.getNombre() + " declaracion=" + this.getDeclaracion() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
