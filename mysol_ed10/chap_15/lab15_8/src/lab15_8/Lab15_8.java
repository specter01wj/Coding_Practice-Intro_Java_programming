/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author james.wang
 */
public class Lab15_8 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
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
