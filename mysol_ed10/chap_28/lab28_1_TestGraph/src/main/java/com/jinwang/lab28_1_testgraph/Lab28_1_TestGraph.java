
package com.jinwang.lab28_1_testgraph;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab28_1_TestGraph {

    public static void main(String[] args) {
        String[] cities = {
            "Seattle", "San Francisco", "Los Angeles", "Denver",
            "Kansas City", "Chicago", "Boston", "New York",
            "Atlanta", "Miami", "Dallas", "Houston"
        };

        int[][] edges = {
            {0,1},{0,3},{0,5},
            {1,0},{1,2},{1,3},
            {2,1},{2,3},{2,4},{2,10},
            {3,0},{3,1},{3,2},{3,4},{3,5},
            {4,2},{4,3},{4,5},{4,7},{4,8},{4,10},
            {5,0},{5,3},{5,4},{5,6},{5,7},
            {6,5},{6,7},
            {7,4},{7,5},{7,6},{7,8},
            {8,4},{8,7},{8,9},{8,10},{8,11},
            {9,8},{9,11},
            {10,2},{10,4},{10,8},{10,11},
            {11,8},{11,9},{11,10}
        };

        Graph<String> graph1 = new UnweightedGraph<>(cities, edges);

        System.out.println("Vertices count: " + graph1.getSize());
        System.out.println("Vertex at index 1: " + graph1.getVertex(1));
        System.out.println("Index of Miami: " + graph1.getIndex("Miami"));
        System.out.println("\nEdges of graph1:");
        graph1.printEdges();

        String[] names = {"Peter", "Jane", "Mark", "Cindy", "Wendy"};
        ArrayList<AbstractGraph.Edge> edgeList = new ArrayList<>();
        edgeList.add(new AbstractGraph.Edge(0, 2));
        edgeList.add(new AbstractGraph.Edge(1, 2));
        edgeList.add(new AbstractGraph.Edge(2, 4));
        edgeList.add(new AbstractGraph.Edge(3, 4));

        Graph<String> graph2 =
            new UnweightedGraph<>(Arrays.asList(names), edgeList);

        System.out.println("\nVertices count (graph2): " + graph2.getSize());
        System.out.println("Edges of graph2:");
        graph2.printEdges();
    }
}
