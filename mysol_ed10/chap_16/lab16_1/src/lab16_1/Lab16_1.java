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
        ImageView us = new ImageView(new Image("image/usa.gif"));
        
        Label lb1 = new Label("US\n50 States", us);
        lb1.setStyle("-fx-border-color:green; -fx-border-width:2");
        lb1.setContentDisplay(ContentDisplay.BOTTOM);
        lb1.setTextFill(Color.PURPLE);
        
        Circle circle1 = new Circle(50, 50, 25);
        Label lb2 = new Label("Circle", circle1);
        circle1.setStroke(Color.BLUE);
        circle1.setFill(Color.YELLOW);
        lb2.setContentDisplay(ContentDisplay.TOP);
        lb2.setTextFill(Color.GREEN);
        
        Rectangle rectangle1 = new Rectangle(10, 10, 50, 25);
        rectangle1.setStroke(Color.BLUE);
        rectangle1.setFill(Color.GREEN);
        Label lb3 = new Label("Retangle", rectangle1);
        lb3.setContentDisplay(ContentDisplay.RIGHT);
        
        Label lb4 = new Label("Ellipse", new Ellipse(50, 50, 50, 25));
        lb4.setContentDisplay(ContentDisplay.LEFT);
        
        Ellipse ellipse = new Ellipse(50, 50, 50, 25);
        ellipse.setStroke(Color.BLUE);
        ellipse.setFill(Color.ORANGE);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
        Label lb5 = new Label("Pane inside Label", stackPane);
        lb5.setContentDisplay(ContentDisplay.BOTTOM);
        
        HBox pane = new HBox(20);
        pane.getChildren().addAll(lb1, lb2, lb3, lb4, lb5);
        
        Scene scene = new Scene(pane, 800, 350);
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
