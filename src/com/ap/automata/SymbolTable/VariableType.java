package com.ap.automata.SymbolTable;

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



    /**
     * Check if the input string is a valid enum
     *
     * @param value The string you want to check a value for.
     * @return True if the enum is valid. False if it is not
     */
    public static boolean isValidEnum(String value) {

        value = value.toUpperCase();
        for (VariableType type : VariableType.values()) {
            if (type.name().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
