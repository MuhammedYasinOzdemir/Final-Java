package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class IlerlemeCucugu extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane=new GridPane();
        ProgressBar progressBar=new ProgressBar();
        progressBar.setProgress(0.25);//baslangıç değer atanır
        ProgressIndicator progressIndicator=new ProgressIndicator(0.75);
        pane.addColumn(0,progressBar);
        pane.addColumn(1,progressIndicator);
        Scene scene=new Scene(pane,400,400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
