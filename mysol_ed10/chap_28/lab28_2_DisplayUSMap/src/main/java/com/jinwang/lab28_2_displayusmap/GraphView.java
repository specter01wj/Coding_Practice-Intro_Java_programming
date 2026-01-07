
package com.jinwang.lab28_2_displayusmap;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.List;

public class GraphView extends Pane {

  private final Graph<? extends Displayable> graph;

  public GraphView(Graph<? extends Displayable> graph) {
    this.graph = graph;

    drawEdges();
    drawVertices();
  }

  private void drawVertices() {
    List<? extends Displayable> vertices = graph.getVertices();

    for (int i = 0; i < graph.getSize(); i++) {
      Displayable v = vertices.get(i);

      int x = v.getX();
      int y = v.getY();

      getChildren().add(new Circle(x, y, 16));
      getChildren().add(new Text(x - 8, y - 18, v.getName()));
    }
  }

  private void drawEdges() {
    for (int i = 0; i < graph.getSize(); i++) {
      int x1 = graph.getVertex(i).getX();
      int y1 = graph.getVertex(i).getY();

      for (int neighbor : graph.getNeighbors(i)) {
        int x2 = graph.getVertex(neighbor).getX();
        int y2 = graph.getVertex(neighbor).getY();

        getChildren().add(new Line(x1, y1, x2, y2));
      }
    }
  }
}
