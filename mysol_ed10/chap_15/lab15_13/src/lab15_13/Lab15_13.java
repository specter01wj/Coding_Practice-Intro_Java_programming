/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_13;

import javafx.application.Application;
import javafx.animation.PathTransition;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author james.wang
 */
public class Lab15_13 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        ImageView imageView = new ImageView("image/usa.gif");
        pane.getChildren().add(imageView);
        
        PathTransition pt = new PathTransition(
            Duration.millis(10000), new Line(100, 200, 100, 0), imageView);
        pt.setCycleCount(5);
        pt.play();
        
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("FlagRisingAnimation");
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
