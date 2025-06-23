// Generated with VGen 2.0.0

package codegeneration.mapl.codefunctions;

import ast.*;
import codegeneration.mapl.*;


public class Run extends AbstractCodeFunction {

    public Run(MaplCodeSpecification specification) {
        super(specification);
    }


	// class Program(List<Declaraciones> declaracioneses)
	@Override
	public Object visit(Program program, Object param) {
		out("\n#SOURCE\t" + "\"" + getSpecification().getSourceFile() + "\"\n");
		define(program.declaracioneses());
		out("halt"); 
		
		//out("<instruction>");
		
		return null;
	}

}









