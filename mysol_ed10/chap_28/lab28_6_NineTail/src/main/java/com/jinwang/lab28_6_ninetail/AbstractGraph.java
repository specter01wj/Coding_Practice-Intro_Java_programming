
package com.jinwang.lab28_6_ninetail;

import java.util.*;

public abstract class AbstractGraph<V> implements Graph<V> {

  protected List<V> vertices = new ArrayList<>();
  protected List<List<Edge>> neighbors = new ArrayList<>();

  protected AbstractGraph() {}

  protected AbstractGraph(V[] vertices, int[][] edges) {
    for (V v : vertices) addVertex(v);
    for (int[] e : edges) addEdge(e[0], e[1]);
  }

  protected AbstractGraph(List<V> vertices, List<Edge> edges) {
    for (V v : vertices) addVertex(v);
    for (Edge e : edges) addEdge(e.u, e.v);
  }

  @Override
  public int getSize() {
    return vertices.size();
  }

  @Override
  public List<V> getVertices() {
    return vertices;
  }

  @Override
  public V getVertex(int index) {
    return vertices.get(index);
  }

  @Override
  public int getIndex(V v) {
    return vertices.indexOf(v);
  }

  @Override
  public List<Integer> getNeighbors(int index) {
    List<Integer> result = new ArrayList<>();
    for (Edge e : neighbors.get(index)) result.add(e.v);
    return result;
  }

  @Override
  public int getDegree(int v) {
    return neighbors.get(v).size();
  }

  @Override
  public void printEdges() {
    for (int u = 0; u < neighbors.size(); u++) {
      System.out.print(vertices.get(u) + " (" + u + "): ");
      for (Edge e : neighbors.get(u)) {
        System.out.print("(" + vertices.get(e.u) + ", " +
                         vertices.get(e.v) + ") ");
      }
      System.out.println();
    }
  }

  @Override
  public void clear() {
    vertices.clear();
    neighbors.clear();
  }

  @Override
  public boolean addVertex(V vertex) {
    if (vertices.contains(vertex)) return false;
    vertices.add(vertex);
    neighbors.add(new ArrayList<>());
    return true;
  }

  @Override
  public boolean addEdge(int u, int v) {
    if (u < 0 || u >= getSize() || v < 0 || v >= getSize())
      throw new IllegalArgumentException("Invalid vertex index");

    Edge e = new Edge(u, v);
    if (neighbors.get(u).contains(e)) return false;

    neighbors.get(u).add(e);
    return true;
  }

  /* ---------------- DFS ---------------- */

  @Override
  public Tree dfs(int v) {
    boolean[] visited = new boolean[getSize()];
    int[] parent = new int[getSize()];
    Arrays.fill(parent, -1);

    List<Integer> searchOrder = new ArrayList<>();
    dfs(v, parent, visited, searchOrder);

    return new Tree(v, parent, searchOrder);
  }

  private void dfs(int u, int[] parent, boolean[] visited,
                   List<Integer> searchOrder) {
    visited[u] = true;
    searchOrder.add(u);

    for (Edge e : neighbors.get(u)) {
      if (!visited[e.v]) {
        parent[e.v] = u;
        dfs(e.v, parent, visited, searchOrder);
      }
    }
  }

  /* ---------------- BFS ---------------- */

  @Override
  public Tree bfs(int v) {
    boolean[] visited = new boolean[getSize()];
    int[] parent = new int[getSize()];
    Arrays.fill(parent, -1);

    Queue<Integer> queue = new LinkedList<>();
    queue.offer(v);
    visited[v] = true;

    List<Integer> searchOrder = new ArrayList<>();

    while (!queue.isEmpty()) {
      int u = queue.poll();
      searchOrder.add(u);

      for (Edge e : neighbors.get(u)) {
        if (!visited[e.v]) {
          queue.offer(e.v);
          parent[e.v] = u;
          visited[e.v] = true;
        }
      }
    }

    return new Tree(v, parent, searchOrder);
  }

  /* ---------------- Edge ---------------- */

  public static class Edge {
    public int u;
    public int v;

    public Edge(int u, int v) {
      this.u = u;
      this.v = v;
    }

    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Edge)) return false;
      Edge e = (Edge) o;
      return u == e.u && v == e.v;
    }
  }

  /* ---------------- Tree ---------------- */

  public class Tree {
    private int root;
    private int[] parent;
    private List<Integer> searchOrder;

    public Tree(int root, int[] parent, List<Integer> searchOrder) {
      this.root = root;
      this.parent = parent;
      this.searchOrder = searchOrder;
    }

    public int getRoot() {
      return root;
    }

    public int getParent(int v) {
      return parent[v];
    }

    public List<Integer> getSearchOrder() {
      return searchOrder;
    }

    public int getNumberOfVerticesFound() {
      return searchOrder.size();
    }

    public List<V> getPath(int index) {
      List<V> path = new ArrayList<>();
      do {
        path.add(vertices.get(index));
        index = parent[index];
      } while (index != -1);
      return path;
    }

    public void printTree() {
      System.out.println("Root is: " + vertices.get(root));
      System.out.print("Edges: ");
      for (int i = 0; i < parent.length; i++) {
        if (parent[i] != -1) {
          System.out.print("(" + vertices.get(parent[i]) + ", "
              + vertices.get(i) + ") ");
        }
      }
      System.out.println();
    }
  }
}
