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
	declaracionstructs: declaraciones -> nombre:string definicions:definicion*
	declaraciones -> 
*/
public class Declaracionstructs extends AbstractDeclaraciones  {

    // ----------------------------------
    // Instance Variables

	// declaracionstructs: declaraciones -> nombre:string definicion*
	private String nombre;
	private List<Definicion> definicions;

    // ----------------------------------
    // Constructors

	public Declaracionstructs(String nombre, List<Definicion> definicions) {
		super();

		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

		if (definicions == null)
			definicions = new ArrayList<>();
		this.definicions = definicions;

		updatePositions(nombre, definicions);
	}

	public Declaracionstructs(Object nombre, Object definicions) {
		super();

        if (nombre == null)
            throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getText() : (String) nombre;

        this.definicions = castList(definicions, unwrapIfContext.andThen(Definicion.class::cast));
		updatePositions(nombre, definicions);
	}


    // ----------------------------------
    // declaracionstructs: declaraciones -> nombre:string definicion*

	// Child 'nombre:string' 

	public void setNombre(String nombre) {
		if (nombre == null)
			throw new IllegalArgumentException("Parameter 'nombre' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.nombre = nombre;

	}

    public String getNombre() {
        return nombre;
    }


	// Child 'definicion*' 

	public void setDefinicions(List<Definicion> definicions) {
		if (definicions == null)
			definicions = new ArrayList<>();
		this.definicions = definicions;

	}

    public List<Definicion> getDefinicions() {
        return definicions;
    }

    public Stream<Definicion> definicions() {
        return definicions.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Declaracionstructs{" + " nombre=" + this.getNombre() + " definicions=" + this.getDefinicions() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
