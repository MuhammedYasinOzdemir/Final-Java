package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Kaydirici extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Slider slider=new Slider(1,100,20);
        System.out.println(slider.getValue());
        StackPane pane=new StackPane();
        pane.getChildren().add(slider);
        Scene scene=new Scene(pane,400,400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
