
package com.jinwang.lab28_4_connectedcircles;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Lab28_4_ConnectedCircles {

    @Override
    public void start(Stage primaryStage) {
      Scene scene = new Scene(new CirclePane(), 450, 350);
      primaryStage.setTitle("Connected Circles");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    /** Pane that displays and manages circles */
    class CirclePane extends Pane {

      CirclePane() {
        setOnMouseClicked(e -> {
          Point2D clickPoint = new Point2D(e.getX(), e.getY());

          if (!isInsideACircle(clickPoint)) {
            Circle circle = new Circle(e.getX(), e.getY(), 20);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.WHITE);

            getChildren().add(circle);
            colorIfConnected();
          }
        });
      }

      /** Returns true if point is inside any existing circle */
      private boolean isInsideACircle(Point2D p) {
        for (Node node : getChildren()) {
          if (node.contains(p)) {
            return true;
          }
        }
        return false;
      }

      /** Colors circles red if all circles are connected */
      private void colorIfConnected() {
        int size = getChildren().size();
        if (size == 0) return;

        List<AbstractGraph.Edge> edges = new ArrayList<>();

        for (int i = 0; i < size; i++) {
          for (int j = i + 1; j < size; j++) {
            Circle c1 = (Circle) getChildren().get(i);
            Circle c2 = (Circle) getChildren().get(j);

            if (overlaps(c1, c2)) {
              edges.add(new AbstractGraph.Edge(i, j));
              edges.add(new AbstractGraph.Edge(j, i));
            }
          }
        }

        Graph<Node> graph =
            new UnweightedGraph<>((List<Node>) getChildren(), edges);

        AbstractGraph<Node>.Tree dfsTree = graph.dfs(0);

        boolean allConnected =
            dfsTree.getNumberOfVerticesFound() == size;

        for (Node node : getChildren()) {
          Circle circle = (Circle) node;
          if (allConnected) {
            circle.setFill(Color.RED);
          } else {
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
          }
        }
      }
    }

    /** Returns true if two circles overlap */
    public static boolean overlaps(Circle c1, Circle c2) {
      return new Point2D(c1.getCenterX(), c1.getCenterY())
          .distance(c2.getCenterX(), c2.getCenterY())
          <= c1.getRadius() + c2.getRadius();
    }

    public static void main(String[] args) {
      launch(args);
    }
}
