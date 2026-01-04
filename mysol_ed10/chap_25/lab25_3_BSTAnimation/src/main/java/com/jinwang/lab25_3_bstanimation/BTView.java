
package com.jinwang.lab25_3_bstanimation;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 *
 * @author jinwang
 */
public class BTView extends Pane {
    private final BST<Integer> tree;
    private final double radius = 15;
    private final double vGap = 50;

    private Text statusText = new Text(20, 20, "");

    public BTView(BST<Integer> tree) {
      this.tree = tree;
      getChildren().add(statusText);

      widthProperty().addListener(e -> displayTree());
      heightProperty().addListener(e -> displayTree());
    }

    public void setStatus(String message) {
      statusText.setText(message);
    }

    public void displayTree() {
      getChildren().clear();
      getChildren().add(statusText);

      if (tree.getRoot() != null) {
        displayTree(
            tree.getRoot(),
            getWidth() / 2,
            vGap,
            getWidth() / 4
        );
      }
    }

    private void displayTree(
        BST.TreeNode<Integer> root,
        double x, double y,
        double hGap) {

      if (root.left != null) {
        getChildren().add(
            new Line(x, y, x - hGap, y + vGap)
        );
        displayTree(root.left, x - hGap, y + vGap, hGap / 2);
      }

      if (root.right != null) {
        getChildren().add(
            new Line(x, y, x + hGap, y + vGap)
        );
        displayTree(root.right, x + hGap, y + vGap, hGap / 2);
      }

      Circle circle = new Circle(x, y, radius);
      circle.setFill(Color.WHITE);
      circle.setStroke(Color.BLACK);

      Text label = new Text(
          x - 6,
          y + 4,
          root.element.toString()
      );

      getChildren().addAll(circle, label);
    }
}
