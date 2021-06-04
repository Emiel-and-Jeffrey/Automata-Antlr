package com.ap.automata.SymbolTable.exceptions;

/**
 * Class used to be able to throw TypeMismatchException in runtime
 */
public class TypeMismatchException extends RuntimeException {

    /**
     * An exception thrown when the symbol table already has a different variable definition
     *
     * @param errorMessage The error message that this exception will have
     */
    public TypeMismatchException(String errorMessage) {
        super(errorMessage);
    }
}
