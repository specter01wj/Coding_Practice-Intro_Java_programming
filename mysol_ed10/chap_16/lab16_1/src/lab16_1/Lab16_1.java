/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author jinwang
 */
public class Lab16_1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ImageView clock = new ImageView(new Image("image/usa.gif"));
        
        EventHandler<ActionEvent> eventHandler = e -> {
            clock.setCurrentTime();
        };
        
        Timeline animation = new Timeline(
            new KeyFrame(Duration.millis(1500), eventHandler)
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        
        Scene scene = new Scene(clock, 200, 200);
        primaryStage.setTitle("ClockAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
