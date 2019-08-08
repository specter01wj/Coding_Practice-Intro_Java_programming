/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_13;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author james.wang
 */
public class Lab14_13 extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        
        pane.setTop(getHBox());
        pane.setLeft(getVBox());
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowHBoxVBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color:gold");
        hBox.getChildren().add(new Button("EE"));
        hBox.getChildren().add(new Button("CE"));
        ImageView imageView = new ImageView(new Image("image/usa.gif"));
        hBox.getChildren().add(imageView);
        
        return hBox;
    }
    
    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("Courses"));
        
        Label[] courses = {new Label("ECE 1301"), new Label("ECE 1302"), 
            new Label("ECE 1303"), new Label("ECE 1304")};
        
        for(Label course : courses) {
            VBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }
        
        return vBox;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
