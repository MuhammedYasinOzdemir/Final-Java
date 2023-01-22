package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class paneler extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Text text=new Text("Pane");
        Pane pane=new Pane(text);
        Scene scene=new Scene(pane,400,400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
