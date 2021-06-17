package com.ap.automata.graph;

public class Connection
{
    private String start;
    private String end;

    private String name;

    public Connection(String start, String end, String name)
    {
        this.start = start;
        this.end = end;
        this.name = name;
    }

    public String getStartIndex()
    {
        return start;
    }

    public String getEndIndex()
    {
        return end;
    }

    public String getName()
    {
        return name;
    }
}