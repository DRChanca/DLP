// Generated with VGen 2.0.0

package ast.declaraciones;

import ast.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	declaracionstructs: declaraciones -> nombre:string declaracions:declaracion*
	declaraciones -> 
*/
public class Declaracionstructs extends AbstractDeclaraciones  {

    // ----------------------------------
    // Instance Variables

	// declaracionstructs: declaraciones -> nombre:string declaracion*
	private String nombre;
	private List<Declaracion> declaracions;

    // ----------------------------------
    // Constructors

	public Declaracionstructs(String nombre, List<Declaracion> declaracions) {
		super();

		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

		if (declaracions == null)
			declaracions = new ArrayList<>();
		this.declaracions = declaracions;

		updatePositions(nombre, declaracions);
	}

	public Declaracionstructs(Object nombre, Object declaracions) {
		super();

        if (nombre == null)
            throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getText() : (String) nombre;

        this.declaracions = castList(declaracions, unwrapIfContext.andThen(Declaracion.class::cast));
		updatePositions(nombre, declaracions);
	}


    // ----------------------------------
    // declaracionstructs: declaraciones -> nombre:string declaracion*

	// Child 'nombre:string' 

	public void setNombre(String nombre) {
		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

	}

    public String getNombre() {
        return nombre;
    }


	// Child 'declaracion*' 

	public void setDeclaracions(List<Declaracion> declaracions) {
		if (declaracions == null)
			declaracions = new ArrayList<>();
		this.declaracions = declaracions;

	}

    public List<Declaracion> getDeclaracions() {
        return declaracions;
    }

    public Stream<Declaracion> declaracions() {
        return declaracions.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Declaracionstructs{" + " nombre=" + this.getNombre() + " declaracions=" + this.getDeclaracions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
