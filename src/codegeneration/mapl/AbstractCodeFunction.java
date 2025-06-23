// Generated with VGen 2.0.0

/*

Esta es la clase base de todos los visitors correspondientes a las funciones de código. Contiene los
métodos que permiten invocar a las distintas funciones haciendo transparente el cambio entre
visitors.

Para su uso, sólo hay que copiarla a su ubicación deseada en el proyecto actualizando su 'package'.
NO ES NECESARIO añadir nada más para usarla.

NOTA: Si hay código que se use en varios visitor, esta clase puede ser un lugar candidato para
ubicarlo. Sin embargo, si se regenera esta clase, acordarse de no borrar dicho código.

*/


package codegeneration.mapl;


import java.util.stream.Stream;
import java.util.Optional;

import ast.AST;
import visitor.ExceptionThrowerVisitor;

/**
 * Common code for all Code Functions.
 */

public abstract class AbstractCodeFunction extends ExceptionThrowerVisitor {

    private MaplCodeSpecification specification;

    protected AbstractCodeFunction(MaplCodeSpecification specification) {
        this.specification = specification;
    }

    protected MaplCodeSpecification getSpecification() {
        return specification;
    }

    //# ------------------------------------------------------------------
    // Métodos auxiliares para la escritura de código

    protected void out(String line) {
        specification.getPrintWriter().println(line);
    }

    //# ------------------------------------------------------------------
    //# Método genérico para invocar cualquier función de código

    protected Object accept(MaplCodeSpecification.CodeFunction function, AST node, Object param) {
        return node.accept(specification.getVisitor(function), param);
    }

    //# ------------------------------------------------------------------
    //# Métodos específicos para cada función de código

    // Code Function: 'run'

    protected Object run(AST node, Object param) {
        return node.accept(specification.getVisitor(MaplCodeSpecification.CodeFunction.RUN), param);
    }

    protected Object run(AST node) {
        return run(node, null);
    }

    protected <T extends AST> void run(Stream<T> nodes, Object param) {
        nodes.forEach(node -> run(node, param));
    }

    protected <T extends AST> void run(Stream<T> nodes) {
        nodes.forEach(this::run);
    }

    protected <T extends AST> Object run(Optional<T> optionalNode, Object param) {
        return optionalNode.map(node -> run(node, param)).orElse(null);
    }

    protected <T extends AST> Object run(Optional<T> optionalNode) {
        return optionalNode.map(this::run).orElse(null);
    }


    // Code Function: 'define'

    protected Object define(AST node, Object param) {
        return node.accept(specification.getVisitor(MaplCodeSpecification.CodeFunction.DEFINE), param);
    }

    protected Object define(AST node) {
        return define(node, null);
    }

    protected <T extends AST> void define(Stream<T> nodes, Object param) {
        nodes.forEach(node -> define(node, param));
    }

    protected <T extends AST> void define(Stream<T> nodes) {
        nodes.forEach(this::define);
    }

    protected <T extends AST> Object define(Optional<T> optionalNode, Object param) {
        return optionalNode.map(node -> define(node, param)).orElse(null);
    }

    protected <T extends AST> Object define(Optional<T> optionalNode) {
        return optionalNode.map(this::define).orElse(null);
    }


    // Code Function: 'ejecuta'

    protected Object ejecuta(AST node, Object param) {
        return node.accept(specification.getVisitor(MaplCodeSpecification.CodeFunction.EJECUTA), param);
    }

    protected Object ejecuta(AST node) {
        return ejecuta(node, null);
    }

    protected <T extends AST> void ejecuta(Stream<T> nodes, Object param) {
        nodes.forEach(node -> ejecuta(node, param));
    }

    protected <T extends AST> void ejecuta(Stream<T> nodes) {
        nodes.forEach(this::ejecuta);
    }

    protected <T extends AST> Object ejecuta(Optional<T> optionalNode, Object param) {
        return optionalNode.map(node -> ejecuta(node, param)).orElse(null);
    }

    protected <T extends AST> Object ejecuta(Optional<T> optionalNode) {
        return optionalNode.map(this::ejecuta).orElse(null);
    }


    // Code Function: 'valor'

    protected Object valor(AST node, Object param) {
        return node.accept(specification.getVisitor(MaplCodeSpecification.CodeFunction.VALOR), param);
    }

    protected Object valor(AST node) {
        return valor(node, null);
    }

    protected <T extends AST> void valor(Stream<T> nodes, Object param) {
        nodes.forEach(node -> valor(node, param));
    }

    protected <T extends AST> void valor(Stream<T> nodes) {
        nodes.forEach(this::valor);
    }

    protected <T extends AST> Object valor(Optional<T> optionalNode, Object param) {
        return optionalNode.map(node -> valor(node, param)).orElse(null);
    }

    protected <T extends AST> Object valor(Optional<T> optionalNode) {
        return optionalNode.map(this::valor).orElse(null);
    }


    // Code Function: 'direccion'

    protected Object direccion(AST node, Object param) {
        return node.accept(specification.getVisitor(MaplCodeSpecification.CodeFunction.DIRECCION), param);
    }

    protected Object direccion(AST node) {
        return direccion(node, null);
    }

    protected <T extends AST> void direccion(Stream<T> nodes, Object param) {
        nodes.forEach(node -> direccion(node, param));
    }

    protected <T extends AST> void direccion(Stream<T> nodes) {
        nodes.forEach(this::direccion);
    }

    protected <T extends AST> Object direccion(Optional<T> optionalNode, Object param) {
        return optionalNode.map(node -> direccion(node, param)).orElse(null);
    }

    protected <T extends AST> Object direccion(Optional<T> optionalNode) {
        return optionalNode.map(this::direccion).orElse(null);
    }


}
