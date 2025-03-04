// Generated with VGen 2.0.0

package ast.sentencia;

import ast.expression.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import visitor.Visitor;

// %% User Declarations -------------

    // Declarations (e.g. imports) in this section will be preserved. Delete if not needed

// %% -------------------------------

/*
	whileSentencia: sentencia -> condicion:expression entonces:sentencia*
	sentencia -> 
*/
public class WhileSentencia extends AbstractSentencia  {

    // ----------------------------------
    // Instance Variables

	// whileSentencia: sentencia -> condicion:expression entonces:sentencia*
	private Expression condicion;
	private List<Sentencia> entonces;

    // ----------------------------------
    // Constructors

	public WhileSentencia(Expression condicion, List<Sentencia> entonces) {
		super();

		if (condicion == null)
			throw new IllegalArgumentException("Parameter 'condicion' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condicion = condicion;

		if (entonces == null)
			entonces = new ArrayList<>();
		this.entonces = entonces;

		updatePositions(condicion, entonces);
	}

	public WhileSentencia(Object condicion, Object entonces) {
		super();

        if (condicion == null)
            throw new IllegalArgumentException("Parameter 'condicion' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condicion = (Expression) condicion;

        this.entonces = castList(entonces, unwrapIfContext.andThen(Sentencia.class::cast));
		updatePositions(condicion, entonces);
	}


    // ----------------------------------
    // whileSentencia: sentencia -> condicion:expression entonces:sentencia*

	// Child 'condicion:expression' 

	public void setCondicion(Expression condicion) {
		if (condicion == null)
			throw new IllegalArgumentException("Parameter 'condicion' can't be null. Pass a non-null value or use 'expression?' in the abstract grammar");
		this.condicion = condicion;

	}

    public Expression getCondicion() {
        return condicion;
    }


	// Child 'entonces:sentencia*' 

	public void setEntonces(List<Sentencia> entonces) {
		if (entonces == null)
			entonces = new ArrayList<>();
		this.entonces = entonces;

	}

    public List<Sentencia> getEntonces() {
        return entonces;
    }

    public Stream<Sentencia> entonces() {
        return entonces.stream();
    }


    // ----------------------------------
    // Helper methods

    @Override
    public Object accept(Visitor v, Object param) {
        return v.visit(this, param);
    }

    @Override
    public String toString() {
        return "WhileSentencia{" + " condicion=" + this.getCondicion() + " entonces=" + this.getEntonces() + "}";
    }


    // %% User Members -------------------------

        // Methods/attributes in this section will be preserved. Delete if not needed

    // %% --------------------------------------
}
