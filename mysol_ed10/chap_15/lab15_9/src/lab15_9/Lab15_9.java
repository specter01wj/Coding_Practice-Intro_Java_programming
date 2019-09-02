/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author james.wang
 */
public class Lab15_9 extends Application {

    private CirclePane circlePane = new CirclePane();
    
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);
        
        btEnlarge.setOnAction(e -> circlePane.enlarge());
        btShrink.setOnAction(e -> circlePane.shrink());
        
        circlePane.setOnMouseClicked(e -> {
            if(e.getButton() == MouseButton.PRIMARY) {
                circlePane.enlarge();
            } else if(e.getButton() == MouseButton.SECONDARY) {
                circlePane.shrink();
            }
        });
        
        circlePane.setOnMouseClicked(e -> {
            if(e.getButton() == MouseButton.PRIMARY) {
                circlePane.enlarge();
            } else if(e.getButton() == MouseButton.SECONDARY) {
                circlePane.shrink();
            }
        });
        
        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setTitle("KeyEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        text.requestFocus();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}

class CirclePane extends StackPane {
    private Circle circle = new Circle(50);
    
    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.PURPLE);
    }
    
    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }
    
    public void shrink() {
        circle.setRadius(circle.getRadius() > 2 ? 
                circle.getRadius() - 2 : circle.getRadius());
    }
    
}
