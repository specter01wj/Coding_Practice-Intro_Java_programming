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
        HBox pane = new HBox();
        Text text = new Text(20, 20, "A");
        
        pane.getChildren().add(text);
        
        text.setOnKeyPressed(e -> {
            switch(e.getCode()) {
                case DOWN: text.setY(text.getY() + 10); break;
                case UP: text.setY(text.getY() - 10); break;
                case LEFT: text.setX(text.getX() - 10); break;
                case RIGHT: text.setX(text.getX() + 10); break;
                default:
                    if(Character.isLetterOrDigit(e.getText().charAt(0))) {
                        text.setText(e.getText());
                    }
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
