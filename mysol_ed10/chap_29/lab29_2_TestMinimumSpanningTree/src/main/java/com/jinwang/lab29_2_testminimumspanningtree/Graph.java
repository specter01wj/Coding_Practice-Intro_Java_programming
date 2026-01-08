
package com.jinwang.lab29_2_testminimumspanningtree;

import java.util.List;

public interface Graph<V> {

  int getSize();

  List<V> getVertices();

  V getVertex(int index);

  int getIndex(V v);

  List<Integer> getNeighbors(int index);

  int getDegree(int v);

  void printEdges();

  void clear();

  boolean addVertex(V vertex);

  boolean addEdge(int u, int v);

  AbstractGraph<V>.Tree dfs(int v);

  AbstractGraph<V>.Tree bfs(int v);
}
