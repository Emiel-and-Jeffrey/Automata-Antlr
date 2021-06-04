package com.ap.automata.SymbolTable.exceptions;

/**
 * Class used to be able to throw UnknownVariableException in runtime
 */
public class UnknownVariableException extends RuntimeException {

    /**
     * An exception thrown when the symbol table does not know the variable
     *
     * @param errorMessage The error message that this exception will have
     */
    public UnknownVariableException(String errorMessage) {
        super(errorMessage);
    }
}
