/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author james.wang
 */
public class Lab14_2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"), 100, 100));
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
