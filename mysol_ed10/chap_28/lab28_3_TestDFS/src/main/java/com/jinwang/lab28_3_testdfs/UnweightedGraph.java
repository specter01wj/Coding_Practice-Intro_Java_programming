
package com.jinwang.lab28_3_testdfs;

import java.util.List;

public class UnweightedGraph<V> extends AbstractGraph<V> {

  /** Construct an empty graph */
  public UnweightedGraph() {
    super();
  }

  /** Construct a graph from vertex array and edge array */
  public UnweightedGraph(V[] vertices, int[][] edges) {
    super(vertices, edges);
  }

  /** Construct a graph from vertex list and edge list */
  public UnweightedGraph(List<V> vertices, List<Edge> edges) {
    super(vertices, edges);
  }

}
