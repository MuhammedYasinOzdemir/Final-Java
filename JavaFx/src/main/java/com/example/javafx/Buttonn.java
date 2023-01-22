package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Buttonn extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button button=new Button("Button");
        button.setBackground(Background.fill(Color.YELLOW));
        button.setBorder(Border.stroke(Color.RED));
        StackPane root=new StackPane();
        root.getChildren().add(button);
        Scene scene=new Scene(root,640,480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
