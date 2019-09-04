/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_16;

import javafx.application.Application;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author james.wang
 */
public class Lab15_16 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane();
        
        EventHandler<ActionEvent> eventHandler = e -> {
            clock.setCurrentTime();
        };
        
        Timeline animation = new Timeline(
            new KeyFrame(Duration.millis(1500), eventHandler)
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        
        Scene scene = new Scene(clock, 250, 50);
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
