/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_11;

import javafx.application.Application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author james.wang
 */

// BounceBallSlider
public class Lab16_11 extends Application {

    @Override
    public void start(Stage primaryStage) {
      BallPane ballPane = new BallPane();
      Slider slSpeed = new Slider();
      slSpeed.setMax(100);
      ballPane.rateProperty().bind(slSpeed.valueProperty());

      BorderPane pane = new BorderPane();
      pane.setCenter(ballPane);
      pane.setBottom(slSpeed);
      
      Scene scene = new Scene(pane, 250, 250);
      primaryStage.setTitle("BounceBallSlider");
      primaryStage.setScene(scene);
      primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
    
}
