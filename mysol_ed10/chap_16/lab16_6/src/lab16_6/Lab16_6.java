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

// TextAreaDemo
public class Lab16_6 extends Application {

    @Override
    public void start(Stage primaryStage) {
      
      DescriptionPane descriptionPane = new DescriptionPane();
      
      descriptionPane.setTitle("Canada");
      String description = "The Canadian national flag ...";
      descriptionPane.setImageView(new ImageView("image/ca2.gif"));
      descriptionPane.setDescription(description);
      
      
      
      Scene scene = new Scene(descriptionPane, 450, 200);
      primaryStage.setTitle("TextAreaDemo");
      primaryStage.setScene(scene);
      primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
    
}
