package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Labell extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Metin yerleştirmek için kullanılır
        Label my_label=new Label("This is an example of Label");
        StackPane root = new StackPane();

        root.getChildren().add(my_label);
        Scene scene=new Scene(root,300,300);
        stage.setScene(scene);
        stage.setTitle("Label Class Example");
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
