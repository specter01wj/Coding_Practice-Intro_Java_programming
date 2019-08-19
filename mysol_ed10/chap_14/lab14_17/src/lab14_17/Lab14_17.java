/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author james.wang
 */
public class Lab14_17 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        for(int i = 0; i < 16; i++) {
            Ellipse e1 = new Ellipse(150, 100, 100, 50);
            e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
//            e1.setFill(Color.WHITE);
            e1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            e1.setRotate(i * 180 / 16);
            pane.getChildren().add(e1);
        }
        
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("ShowEllipse");
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
