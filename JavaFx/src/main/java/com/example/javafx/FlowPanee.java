package com.example.javafx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPanee extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("FlowPane Example");
        FlowPane root = new FlowPane();
        root.setVgap(6);
        root.setHgap(12);
        root.setPrefWrapLength(250);
        root.getChildren().add(new Button("Start"));
        root.getChildren().add(new Button("Stop"));
        root.getChildren().add(new Button("Reset"));
        Scene scene = new Scene(root,300,200);
        root.setPadding(new Insets(20));

        stage.setScene(scene);
        stage.show();
        //genelde dosya düzenlerind ekullanıırlır ayarlar sekmesi vs
    }
    public static void main(String[] args)
    {
        launch();
    }
}
