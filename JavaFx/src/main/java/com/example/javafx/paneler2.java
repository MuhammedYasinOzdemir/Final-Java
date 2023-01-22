package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class paneler2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane=new BorderPane();
        borderPane.setTop(new Label("Ustteki label"));
        borderPane.setBottom(new Label("Alttaki Label"));
        borderPane.setCenter(new Label("Merkezdeki Label"));
        borderPane.setRight(new Label("Sağdaki Label"));
        borderPane.setLeft(new Label("Soldaki Label"));
        Scene scene=new Scene(borderPane,640,480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
