
package com.jinwang.lab29_4_weightedninetail;

import java.util.ArrayList;
import java.util.List;

public class NineTailModel {

  public static final int NUMBER_OF_NODES = 512;
  protected AbstractGraph<Integer>.Tree tree;

  /** Construct the model and build BFS tree */
  public NineTailModel() {
    List<AbstractGraph.Edge> edges = getEdges();
    UnweightedGraph<Integer> graph =
        new UnweightedGraph<Integer>(edges, NUMBER_OF_NODES);
    tree = graph.bfs(511); // Goal state: all T
  }

  /** Create all legal edges in the state graph */
  private List<AbstractGraph.Edge> getEdges() {
    List<AbstractGraph.Edge> edges = new ArrayList<>();

    for (int u = 0; u < NUMBER_OF_NODES; u++) {
      for (int k = 0; k < 9; k++) {
        char[] node = getNode(u);
        if (node[k] == 'H') {
          int v = getFlippedNode(node, k);
          edges.add(new AbstractGraph.Edge(v, u));
        }
      }
    }
    return edges;
  }

  /** Flip coin at position and its neighbors */
  public static int getFlippedNode(char[] node, int position) {
    int row = position / 3;
    int col = position % 3;

    flipACell(node, row, col);
    flipACell(node, row - 1, col);
    flipACell(node, row + 1, col);
    flipACell(node, row, col - 1);
    flipACell(node, row, col + 1);

    return getIndex(node);
  }

  private static void flipACell(char[] node, int row, int col) {
    if (row >= 0 && row < 3 && col >= 0 && col < 3) {
      node[row * 3 + col] =
          (node[row * 3 + col] == 'H') ? 'T' : 'H';
    }
  }

  /** Convert node to index */
  public static int getIndex(char[] node) {
    int result = 0;
    for (int i = 0; i < 9; i++) {
      result = result * 2 + (node[i] == 'T' ? 1 : 0);
    }
    return result;
  }

  /** Convert index to node */
  public static char[] getNode(int index) {
    char[] node = new char[9];
    for (int i = 8; i >= 0; i--) {
      node[i] = (index % 2 == 0) ? 'H' : 'T';
      index /= 2;
    }
    return node;
  }

  /** Return shortest path from a node to goal */
  public List<Integer> getShortestPath(int nodeIndex) {
    return tree.getPath(nodeIndex);
  }

  /** Print a node in 3×3 format */
  public static void printNode(char[] node) {
    for (int i = 0; i < 9; i++) {
      System.out.print(node[i]);
      if (i % 3 == 2) System.out.println();
    }
    System.out.println();
  }
}
