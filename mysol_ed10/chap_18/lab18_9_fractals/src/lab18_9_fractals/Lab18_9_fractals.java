/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_9_fractals;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author james.wang
 */

// SierpinskiTriangle
public class Lab18_9_fractals extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {       
      SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane(); 
      TextField tfOrder = new TextField(); 
      tfOrder.setOnAction(
        e -> trianglePane.setOrder(Integer.parseInt(tfOrder.getText())));
      tfOrder.setPrefColumnCount(4);
      tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

      // Pane to hold label, text field, and a button
      HBox hBox = new HBox(10);
      hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
      hBox.setAlignment(Pos.CENTER);

      BorderPane borderPane = new BorderPane();
      borderPane.setCenter(trianglePane);
      borderPane.setBottom(hBox);

      // Create a scene and place it in the stage
      Scene scene = new Scene(borderPane, 200, 210);
      primaryStage.setTitle("SierpinskiTriangle"); // Set the stage title
      primaryStage.setScene(scene); // Place the scene in the stage
      primaryStage.show(); // Display the stage

      scene.widthProperty().addListener(ov -> trianglePane.paint());
      scene.heightProperty().addListener(ov -> trianglePane.paint());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
