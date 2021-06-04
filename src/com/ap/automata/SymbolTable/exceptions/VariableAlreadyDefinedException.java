package com.ap.automata.SymbolTable.exceptions;

/**
 * Class used to be able to throw VariableAlreadyDefinedException in runtime
 */
public class VariableAlreadyDefinedException extends RuntimeException {

    /**
     * An exception thrown when the symbol table already has a different variable definition
     *
     * @param errorMessage The error message that this exception will have
     */
    public VariableAlreadyDefinedException(String errorMessage) {
        super(errorMessage);
    }
}
