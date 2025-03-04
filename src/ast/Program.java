// Generated with VGen 2.0.0

package ast;

import ast.declaraciones.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	program -> declaracioneses:declaraciones*
*/
public class Program extends AbstractAST  {

    // ----------------------------------
    // Instance Variables

	// program -> declaraciones*
	private List<Declaraciones> declaracioneses;

    // ----------------------------------
    // Constructors

	public Program(List<Declaraciones> declaracioneses) {
		super();

		if (declaracioneses == null)
			declaracioneses = new ArrayList<>();
		this.declaracioneses = declaracioneses;

		updatePositions(declaracioneses);
	}

	public Program(Object declaracioneses) {
		super();

        this.declaracioneses = castList(declaracioneses, unwrapIfContext.andThen(Declaraciones.class::cast));
		updatePositions(declaracioneses);
	}


    // ----------------------------------
    // program -> declaraciones*

	// Child 'declaraciones*' 

	public void setDeclaracioneses(List<Declaraciones> declaracioneses) {
		if (declaracioneses == null)
			declaracioneses = new ArrayList<>();
		this.declaracioneses = declaracioneses;

	}

    public List<Declaraciones> getDeclaracioneses() {
        return declaracioneses;
    }

    public Stream<Declaraciones> declaracioneses() {
        return declaracioneses.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "Program{" + " declaracioneses=" + this.getDeclaracioneses() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
