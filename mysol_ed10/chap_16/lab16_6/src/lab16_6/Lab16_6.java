/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_6;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

/**
 *
 * @author james.wang
 */

// DescriptionPane
public class Lab16_6 extends Application {

    @Override
    public void start(Stage primaryStage) {
      // Declare and create a description pane
      DescriptionPane descriptionPane = new DescriptionPane();

      // Set title, text and image in the description pane
      descriptionPane.setTitle("Canada");
      String description = "The Canadian national flag ...";
      descriptionPane.setImageView(new ImageView("image/ca.gif"));
      descriptionPane.setDescription(description);

      // Create a scene and place it in the stage
      Scene scene = new Scene(descriptionPane, 450, 200);
      primaryStage.setTitle("TextAreaDemo"); // Set the stage title
      primaryStage.setScene(scene); // Place the scene in the stage
      primaryStage.show(); // Display the stage
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
    
}
