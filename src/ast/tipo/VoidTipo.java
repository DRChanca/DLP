// Generated with VGen 2.0.0

package ast.tipo;

import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	voidTipo: tipo -> 
	tipo -> 
*/
public class VoidTipo extends AbstractTipo  {



    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "VoidTipo{" + "}";
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
		return 0; 
	}
	@Override
	public char sufijo() {
		// TODO Auto-generated method stub
		return 0;
	}
    // %% --------------------------------------

}
