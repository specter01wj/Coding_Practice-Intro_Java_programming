
package com.jinwang.lab30_2_flashtext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Lab30_2_FlashText extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      Label lblText = new Label("Programming is fun");
      StackPane pane = new StackPane(lblText);

      Thread thread = new Thread(() -> {
        try {
          while (true) {
            Platform.runLater(() -> {
              if (lblText.getText().isEmpty()) {
                lblText.setText("Welcome");
              } else {
                lblText.setText("");
              }
            });
            Thread.sleep(200);
          }
        } catch (InterruptedException ignored) {
        }
      });

      thread.setDaemon(true);
      thread.start();

      Scene scene = new Scene(pane, 200, 50);
      primaryStage.setTitle("FlashText");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
