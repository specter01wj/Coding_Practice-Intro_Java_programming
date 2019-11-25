/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_10;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 *
 * @author james.wang
 */

// SliderDemo
public class Lab16_10 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(20, 20, "JavaFX Programming");
        
        Slider slHorizontal = new Slider();
        slHorizontal.setShowTickLabels(true);
        slHorizontal.setShowTickMarks(true); 
        
        Slider slVertical = new Slider();
        slVertical.setOrientation(Orientation.VERTICAL);
        slVertical.setShowTickLabels(true);
        slVertical.setShowTickMarks(true);
        slVertical.setValue(100);
        
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        
        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(slHorizontal);
        pane.setRight(slVertical);
        
        slHorizontal.valueProperty().addListener(ov -> 
            text.setX(slHorizontal.getValue() * paneForText.getWidth() /
              slHorizontal.getMax()));

        slVertical.valueProperty().addListener(ov -> 
            text.setY((slVertical.getMax() - slVertical.getValue()) 
              * paneForText.getHeight() / slVertical.getMax()));
        
        Scene scene = new Scene(pane, 650, 250);
        primaryStage.setTitle("SliderDemo");
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
