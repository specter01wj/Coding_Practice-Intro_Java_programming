/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_2;

import javafx.application.Application;

/**
 *
 * @author jinwang
 */
public class Lab16_2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ImageView us = new ImageView(new Image("image/usa.gif"));
        
        Label lb1 = new Label("US\n50 States", us);
        lb1.setStyle("-fx-border-color:green; -fx-border-width:2");
        lb1.setContentDisplay(ContentDisplay.BOTTOM);
        lb1.setTextFill(Color.PURPLE);
        
        Circle circle1 = new Circle(50, 50, 25);
        circle1.setStroke(Color.BLUE);
        circle1.setFill(Color.YELLOW);
        StackPane stackPane1 = new StackPane();
        stackPane1.getChildren().addAll(circle1, new Label("James"));
        Label lb2 = new Label("Circle", stackPane1);
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
