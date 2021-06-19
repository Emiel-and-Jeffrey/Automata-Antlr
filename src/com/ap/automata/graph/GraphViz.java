package com.ap.automata.graph;

import org.stringtemplate.v4.ST;

public class GraphViz {

    public String drawGraph(Graph graph) {
        StringBuilder dotFile = new StringBuilder("digraph myAutomaton \n { \n rankdir=LR; \n \"\" [shape=none] \n");
        var nodes = graph.getAllNodes();

        for (var node: graph.getAllNodes()){
            dotFile.append(getValue(node, graph.isEndNode(node)));
        }

        Connection connection = new Connection("", graph.getInitState(), "");
        dotFile.append(getConnection(connection));

        for (var value: graph.getConnections()){
            dotFile.append(getConnection(value));
        }
        dotFile.append("}");
        return dotFile.toString();
    }

    private String getValue(String name, boolean endPoint) {
        String shape = endPoint ? "doublecircle" : "circle";
        return String.format("\"%s\" [shape=%s]\n", name, shape);
    }

    private String getConnection(Connection connection)
    {
        return String.format("\"%s\" -> \"%s\" [label=\"%s\"]\n", connection.getStartIndex(), connection.getEndIndex(), connection.getName());
    }
}

