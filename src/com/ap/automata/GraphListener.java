package com.ap.automata;

import com.ap.antlr.base.Z3Parser;
import com.ap.antlr.base.Z3ParserBaseListener;
import com.ap.automata.graph.Connection;
import com.ap.automata.graph.Graph;

import java.util.Stack;


public class GraphListener extends Z3ParserBaseListener {

    private final Stack<String> indexStack = new Stack<>();
    private final Stack<String> nameStack = new Stack<>();

    private Graph graph = new Graph();

    public Graph getGraph()
    {
        return graph;
    }

    @Override()
    public void exitValueString(Z3Parser.ValueStringContext ctx) {
        String value = ctx.STRING_LITERAL().getText().replace("\"", "");
        if(value.contains(":"))
        {
            String[] values = ctx.STRING_LITERAL().getText().split(":");

            for (var string: values) {
                graph.addEndNode(string.replace("\"", ""));
            }
        }
        else if(value.length() == 1)
        {
            nameStack.push(value);
        }
    }

    @Override()
    public void enterValueBasicNumber(Z3Parser.ValueBasicNumberContext ctx) {
        indexStack.push(ctx.NUMBER().getText());
    }

    @Override()
    public void exitLogicalExpressionAnd(Z3Parser.LogicalExpressionAndContext ctx) {
        var values = ctx.value().toArray();
        if (values.length != 3) {
            return;
        }

        //Create Connection
        var endIndex = indexStack.pop();
        var startIndex = indexStack.pop();
        String name = nameStack.pop();
        Connection connection = new Connection(startIndex, endIndex, name);
        graph.addConnection(connection);
    }

    @Override
    public void exitResult(Z3Parser.ResultContext ctx) {
        indexStack.clear();
        nameStack.clear();
    }

    @Override
    public void exitStatementFunction(Z3Parser.StatementFunctionContext ctx) {
        String name = ctx.function().IDENTIFIER().getText();
        if (name.equals("InitState"))
        {
            graph.setInitState(indexStack.pop());
        }
        else if (name.equals("MaxState"))
        {
            graph.setMaxState(indexStack.pop());
        }
    }
}
