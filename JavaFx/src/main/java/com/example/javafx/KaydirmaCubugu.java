package com.example.javafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class KaydirmaCubugu extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ScrollBar s = new ScrollBar();
        s.setMin(0);
        s.setMax(200);
        s.setValue(110);
        s.setOrientation(Orientation.VERTICAL);
        s.setUnitIncrement(12);
        s.setBlockIncrement(10);
        StackPane root = new StackPane();
        root.getChildren().add(s);
        Scene scene = new Scene(root,300,200);
        stage.setScene(scene);
        stage.setTitle("ScrollBar Example");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
