
package com.jinwang.lab29_4_weightedninetail;

import java.util.*;

public class WeightedNineTailModel extends NineTailModel {

  /** Construct a model */
  public WeightedNineTailModel() {
    List<WeightedEdge> edges = getEdges();

    WeightedGraph<Integer> graph =
        new WeightedGraph<>(edges, NUMBER_OF_NODES);

    // Shortest-path tree rooted at the goal state (all T's = 511)
    tree = graph.getShortestPath(511);
  }

  /** Create all weighted edges */
  private List<WeightedEdge> getEdges() {
    List<WeightedEdge> edges = new ArrayList<>();

    for (int u = 0; u < NUMBER_OF_NODES; u++) {
      for (int k = 0; k < 9; k++) {
        char[] node = getNode(u);
        if (node[k] == 'H') {
          int v = getFlippedNode(node, k);
          int flips = getNumberOfFlips(u, v);
          edges.add(new WeightedEdge(v, u, flips));
        }
      }
    }
    return edges;
  }

  private static int getNumberOfFlips(int u, int v) {
    char[] n1 = getNode(u);
    char[] n2 = getNode(v);
    int count = 0;
    for (int i = 0; i < 9; i++) {
      if (n1[i] != n2[i]) count++;
    }
    return count;
  }

  public int getNumberOfFlips(int u) {
    return (int) ((WeightedGraph<Integer>.ShortestPathTree) tree)
        .getCost(u);
  }
}
