package com.ap.automata;

import com.ap.antlr.base.AutomataLexer;
import com.ap.antlr.base.AutomataParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args)
    {
        String input = "5 + 6 - 3 ";

        AutomataLexer lexer = new AutomataLexer(CharStreams.fromString(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AutomataParser parser = new AutomataParser(tokens);
        ParseTree tree = parser.program();

        //Trees.inspect(tree, parser);

        ParseTreeWalker walker = new ParseTreeWalker();
        AutomataParserListener listener = new AutomataParserListener();
        walker.walk(listener, tree);

        System.out.println(listener.getResult());
    }
}
