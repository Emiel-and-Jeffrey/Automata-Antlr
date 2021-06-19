package com.ap.automata.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private String initState;
    private String maxState;

    private final List<Connection> connectionList;
    private final List<String> endPoints;

    public Graph()
    {
        endPoints = new ArrayList<>();
        connectionList = new ArrayList<>();
    }

    public void addConnection(Connection connection)
    {
        if(!connectionList.contains(connection)){
            connectionList.add(connection);
        }
    }

    public List<Connection> getConnections()
    {
        return connectionList;
    }

    public String getInitState()
    {
        return initState;
    }

    public void setInitState(String value)
    {
        initState = value;
    }

    public String getMaxState()
    {
        return initState;
    }

    public void setMaxState(String value)
    {
        maxState = value;
    }

    public List<String> getAllNodes()
    {
        List<String> nodes = new ArrayList<>();
        int maxState = Integer.parseInt(this.maxState);
        int initState = Integer.parseInt(this.initState);

        for(int i = initState; i <= maxState; i++) {
            nodes.add(String.valueOf(i));
        }
        return nodes;
    }

    public void addEndNode(String endNode)
    {
        if(!endPoints.contains(endNode)) {
            endPoints.add(endNode);
        }
    }

    public boolean isEndNode(String endNode)
    {
        return endPoints.contains(endNode);
    }
}
