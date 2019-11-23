/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author james.wang
 */

// RadioButtonDemo
public class Lab16_4 extends Lab16_3 {

    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();
        
        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5)); 
        paneForRadioButtons.setStyle("-fx-border-color: green");
        paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");
        
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        
        paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue);
        pane.setLeft(paneForRadioButtons);
        
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        
        rbRed.setOnAction(e -> {
            if (rbRed.isSelected()) {
              text.setFill(Color.RED);
            }
        });

        rbGreen.setOnAction(e -> {
          if (rbGreen.isSelected()) {
            text.setFill(Color.GREEN);
          }
        });

        rbBlue.setOnAction(e -> {
          if (rbBlue.isSelected()) {
            text.setFill(Color.BLUE);
          }
        });
        
        return pane;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
    
}
