// Generated with VGen 2.0.0

package ast.tipo;

import org.antlr.v4.runtime.Token;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	intTipo: tipo -> name:string
	tipo -> 
*/
public class IntTipo extends AbstractTipo  {

    // ----------------------------------
    // Instance Variables

	// intTipo: tipo -> string
	private String name;

    // ----------------------------------
    // Constructors

	public IntTipo(String name) {
		super();

		if (name == null)
			throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = name;

		updatePositions(name);
	}

	public IntTipo(Object name) {
		super();

        if (name == null)
            throw new IllegalArgumentException("Parameter 'name' can't be null. Pass a non-null value or use 'string?' in the abstract grammar");
		this.name = (name instanceof Token) ? ((Token) name).getText() : (String) name;

		updatePositions(name);
	}


    // ----------------------------------
    // intTipo: tipo -> string

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
        return "IntTipo{" + " name=" + this.getName() + "}";
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
		return 2; 
	}
	@Override
	public char sufijo() {
		// TODO Auto-generated method stub
		return 'i';
	}
    // %% --------------------------------------

}
