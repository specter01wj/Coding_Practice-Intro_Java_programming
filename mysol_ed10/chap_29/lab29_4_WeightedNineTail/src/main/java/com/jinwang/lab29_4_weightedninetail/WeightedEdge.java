
package com.jinwang.lab29_3_testshortestpath;


public class WeightedEdge extends AbstractGraph.Edge
    implements Comparable<WeightedEdge> {

  public double weight;

  public WeightedEdge(int u, int v, double weight) {
    super(u, v);
    this.weight = weight;
  }

  @Override
  public int compareTo(WeightedEdge edge) {
    return Double.compare(this.weight, edge.weight);
  }
}
