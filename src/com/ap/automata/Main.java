package com.ap.automata;

import com.ap.antlr.base.AutomataLexer;
import com.ap.antlr.base.AutomataParser;
import com.ap.antlr.listeners.NumericListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main
{

    public static void main(String[] args)
    {
        CharStream input = CharStreams.fromString("10 + 199 * 2");
        AutomataLexer lexer = new AutomataLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        for (var token : tokens.getTokens())
        {
            System.out.println(token.toString());
        }

        AutomataParser parser = new AutomataParser(tokens);

        ParseTree tree = parser.program();

        NumericListener m = new NumericListener();
        ParseTreeWalker.DEFAULT.walk(m, tree);
    }
}
