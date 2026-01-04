
package com.jinwang.lab25_3_bstanimation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author jinwang
 */
public class Lab25_3_BSTAnimation extends Application {

    @Override
    public void start(Stage primaryStage) {
      BST<Integer> tree = new BST<>();

      BorderPane pane = new BorderPane();
      BTView view = new BTView(tree);
      pane.setCenter(view);

      TextField tfKey = new TextField();
      tfKey.setPrefColumnCount(4);
      tfKey.setAlignment(Pos.BASELINE_RIGHT);

      Button btInsert = new Button("Insert");
      Button btDelete = new Button("Delete");

      HBox controls = new HBox(8,
          new Label("Enter a key:"), tfKey, btInsert, btDelete);
      controls.setAlignment(Pos.CENTER);
      pane.setBottom(controls);

      btInsert.setOnAction(e -> handleInsert(tree, view, tfKey));
      btDelete.setOnAction(e -> handleDelete(tree, view, tfKey));

      Scene scene = new Scene(pane, 500, 300);
      primaryStage.setTitle("BST Visualization");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    private void handleInsert(BST<Integer> tree, BTView view, TextField tfKey) {
      try {
        int key = Integer.parseInt(tfKey.getText());

        if (tree.contains(key)) {
          view.setStatus(key + " is already in the tree");
        } else {
          tree.add(key);
          view.setStatus(key + " inserted");
        }
        view.displayTree();
        tfKey.clear();
      } catch (NumberFormatException ex) {
        view.setStatus("Please enter an integer");
      }
    }

    private void handleDelete(BST<Integer> tree, BTView view, TextField tfKey) {
      try {
        int key = Integer.parseInt(tfKey.getText());

        if (!tree.contains(key)) {
          view.setStatus(key + " not found");
        } else {
          tree.remove(key);
          view.setStatus(key + " deleted");
        }
        view.displayTree();
        tfKey.clear();
      } catch (NumberFormatException ex) {
        view.setStatus("Please enter an integer");
      }
    }

    public static void main(String[] args) {
      launch(args);
    }
}
