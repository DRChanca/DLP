package codegeneration;

import java.util.concurrent.atomic.AtomicInteger;

import ast.*;
import ast.declaraciones.Declaracionfuncion;
import ast.declaraciones.Declaracionglobales;
import ast.declaraciones.Declaracionstructs;
import visitor.DefaultVisitor;

// This class will be implemented in memory allocation phase

public class MemoryAllocation extends DefaultVisitor {

	
	private static int currentAdressGlobales = 0; 
	
    public void process(AST ast) {
        ast.accept(this, null);
    }
    
	@Override
	public Object visit(Declaracionglobales declaracionglobales, Object param) {
		declaracionglobales.getDefinicion().setAddress(currentAdressGlobales);
		currentAdressGlobales += declaracionglobales.getDefinicion().getTipo().getSize(); 
		declaracionglobales.getDefinicion().accept(this, param);
		return null;
	}
	
	@Override
	public Object visit(Declaracionstructs declaracionstructs, Object param) {
		AtomicInteger currentAdress = new AtomicInteger(0); 
		declaracionstructs.getDefinicions().forEach(p -> {
			p.setAddress(currentAdress.getAndAdd(p.getAddress() + p.getTipo().getSize())); 
		});
		declaracionstructs.getDefinicions().forEach(definicion -> definicion.accept(this, param));
		return null;
	}
	@Override
	public Object visit(Declaracionfuncion declaracionfuncion, Object param) {
		int BP = 4;
		int tamArgu = declaracionfuncion.getArgumento().size(); 
		for(int i = tamArgu - 1; i >= 0; i --) {
			declaracionfuncion.getArgumento().get(i).setAddress(BP);
			BP += declaracionfuncion.getArgumento().get(i).getTipo().getSize(); 
			declaracionfuncion.getArgumento().get(i).accept(this, param); 
		}

		declaracionfuncion.getTipo().ifPresent(tipo -> tipo.accept(this, param));
		AtomicInteger acumulador = new AtomicInteger(0); 
		declaracionfuncion.getVariablesLocales().forEach(definicion -> {
			definicion.setAddress(-acumulador.addAndGet(definicion.getAddress()+ definicion.getTipo().getSize())); 
			definicion.accept(this, param);
		});
		declaracionfuncion.getSentencias().forEach(sentencia -> sentencia.accept(this, param));
		return null;
	}
    


}
