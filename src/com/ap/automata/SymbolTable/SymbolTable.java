package com.ap.automata.SymbolTable;

import com.ap.automata.SymbolTable.exceptions.UnknownVariableException;
import com.ap.automata.SymbolTable.exceptions.VariableAlreadyDefinedException;
import com.ap.automata.SymbolTable.symbol.ISymbol;
import com.ap.automata.SymbolTable.value.Value;
import com.ap.automata.SymbolTable.value.VariableType;

import java.util.HashMap;

/**
 * The symbol table class is used to keep track of variables
 */
public class SymbolTable {
    private HashMap<String, ISymbol> table;

    public SymbolTable() {
        table = new HashMap<>();
    }

    /**
     * Add a symbol to the symbol table
     *
     * @param symbol the symbol you want to add
     */
    public void AddSymbol(ISymbol symbol) throws VariableAlreadyDefinedException {
        if (table.containsKey(symbol.getName())) {
            throw new VariableAlreadyDefinedException(String.format("%s has already been defined", symbol.getName()));
        }
        table.put(symbol.getName(), symbol);
    }

    /**
     * Get a symbol from the symbol table
     *
     * @param name the name you want the symbol for
     */
    public <T extends ISymbol> T GetSymbol(String name) throws UnknownVariableException {
        if (!table.containsKey(name)) {
            throw new UnknownVariableException(String.format("%s has not been defined", name));
        }
        return (T) table.get(name);
    }

    /**
     * Class that represents a symbol inside of the Symbol Table
     */
    public static class Symbol implements ISymbol {
        private String name;
        private Value value;


        /**
         * Initialize a symbol with the variable type as an enum
         *
         * @param name  The name this symbol has
         * @param value The current value this symbol has
         */
        public Symbol(String name, Value value) {
            this.name = name;
            this.value = value;
        }

        /**
         * A method that gets the symbol's name
         *
         * @return the symbols name
         */
        public String getName() {
            return name;
        }

        /**
         * A method that gets the symbol's type
         *
         * @return the symbols type
         */
        public VariableType getType() {
            return VariableType.STRING;
        }

        /**
         * A method that gets the symbol's value
         *
         * @return the symbols value
         */
        public Value getValue() {
            return value;
        }

        /**
         * A method that sets the symbol's value
         */
        public void setValue(Value value) {
            this.value = value;
        }
    }
}
