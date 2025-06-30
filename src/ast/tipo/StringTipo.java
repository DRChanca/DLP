// Generated with VGen 2.0.0

package ast.tipo;

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
	StringTipo: tipo -> name:string
	tipo -> 
	
	PHASE Identification
	StringTipo -> definicions:definicion*
*/
public class StringTipo extends AbstractTipo  {

    // ----------------------------------
    // Instance Variables

	// StringTipo: tipo -> string
	private String name;

    // PHASE Identification
	private List<Definicion> definicions;

    // ----------------------------------
    // Constructors

	public StringTipo(String name) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(name);
	}

	public StringTipo(Object name) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(name);
	}


    // ----------------------------------
    // StringTipo: tipo -> string

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

	// Attribute 'definicion*' 

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
        return "StringTipo{" + " name=" + this.getName() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed
	@Override
	public boolean mismoTipo(Tipo a) {
		if(a == null || a.getClass() != this.getClass())
			return false;
		StringTipo otro = (StringTipo) a; 
		return this.getName().equalsIgnoreCase(otro.getName()); 
	}
	@Override 
	public int getSize() {
			
		var map = this.getDefinicions().stream().mapToInt(p -> p.getTipo().getSize()).sum(); 
	
		return map; 
	}
	@Override
	public char sufijo() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String tipoMapl() {
		return this.getName();
	}
    // %% --------------------------------------
}
