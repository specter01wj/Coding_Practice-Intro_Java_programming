/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_15;

import javafx.application.Application;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author james.wang
 */
public class Lab15_15 extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        
        Text text = new Text(20, 50, "James Wang");
        text.setFill(Color.RED);
        pane.getChildren().add(text);
        
        EventHandler<ActionEvent> eventHandler = e -> {
            if(text.getText().length() != 0) {
                text.setText("");
            } else {
                text.setText("Jin Wang!!!");
            }
        };
        
        Timeline animation = new Timeline(
            new KeyFrame(Duration.millis(500), eventHandler)
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
