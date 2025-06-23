// Generated with VGen 2.0.0

package ast.tipo;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	floatTipo: tipo -> name:string
	tipo -> 
*/
public class FloatTipo extends AbstractTipo  {

    // ----------------------------------
    // Instance Variables

	// floatTipo: tipo -> string
	private String name;

    // ----------------------------------
    // Constructors

	public FloatTipo(String name) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(name);
	}

	public FloatTipo(Object name) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(name);
	}


    // ----------------------------------
    // floatTipo: tipo -> string

	// Child 'string' 

	public void setName(String name) {
		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

	}

    public String getName() {
        return name;
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "FloatTipo{" + " name=" + this.getName() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed
	@Override
	public boolean mismoTipo(Tipo a) {
		if(a == null || a.getClass() != this.getClass())
			return false;
		return true; 
	}
	@Override 
	public int getSize() {
		return 4; 
	}
	@Override
	public char sufijo() {
		// TODO Auto-generated method stub
		return 'f';
	}
	@Override
	public String tipoMapl() {
		return "real";
	}
    // %% --------------------------------------

}
