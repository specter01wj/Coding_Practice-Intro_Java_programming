/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16_8;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

/**
 *
 * @author james.wang
 */

// ListViewDemo
public class Lab16_8 extends Application {

    private String[] flagTitles = {"Canada", "China", "Denmark",
    "France", "Germany", "India", "Norway", "United Kingdom",
    "United States of America"};
    
    private ImageView[] ImageViews = {
        new ImageView("image/ca.gif"),
        new ImageView("image/china.gif"),
        new ImageView("image/denmark.gif"),
        new ImageView("image/fr.gif"),
        new ImageView("image/germany.gif"),
        new ImageView("image/india.gif"),
        new ImageView("image/norway.gif"),
        new ImageView("image/uk.gif"),
        new ImageView("image/us.gif")
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch(args);
    }
    
}
