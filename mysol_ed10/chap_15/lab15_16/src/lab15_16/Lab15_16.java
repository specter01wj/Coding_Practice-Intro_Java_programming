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
            if(text.getText().length() != 0) {
                text.setText("");
            } else {
                text.setText("Jin Wang!!!");
            }
        };
        
        Timeline animation = new Timeline(
            new KeyFrame(Duration.millis(1500), eventHandler)
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        
        Scene scene = new Scene(pane, 200, 150);
        primaryStage.setTitle("FadeTransitionDemo");
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
