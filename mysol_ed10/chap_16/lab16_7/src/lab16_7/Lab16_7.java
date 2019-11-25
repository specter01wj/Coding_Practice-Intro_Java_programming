/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author james.wang
 */
public class Lab16_7 extends Application {

    private String[] flagTitles = {"Canada", "China", "Denmark", 
      "France", "Germany", "India", "Norway", "United Kingdom",
      "United States of America"};
    
    private ImageView[] flagImage = {new ImageView("image/ca.gif"),
      new ImageView("image/china.gif"), 
      new ImageView("image/denmark.gif"), 
      new ImageView("image/fr.gif"), 
      new ImageView("image/germany.gif"),
      new ImageView("image/india.gif"), 
      new ImageView("image/norway.gif"),
      new ImageView("image/uk.gif"), new ImageView("image/us.gif")};
    
    private String[] flagDescription = new String[9];
    private DescriptionPane descriptionPane = new DescriptionPane();
    private ComboBox<String> cbo = new ComboBox<>();
    
    @Override
    public void start(Stage primaryStage) {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
    
}
