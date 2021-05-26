package com.ap.automata;

/**
 * A variable type.
 * This is used to indicate what type of variable a symbol is.
 */
public enum VariableType {
    NUMBER("number");

    private final String text;

    /**
     * Parse the string to a variable type
     *
     * @param text The string representation of the enum
     */
    VariableType(final String text) {
        this.text = text;
    }

    /**
     * Get the name of the enum
     *
     * @return the actual name of the enum
     */
    @Override
    public String toString() {
        return text;
    }
}
