package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class DosyaSecici extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        Label label = new Label("File:");
        TextField tf= new TextField();
        Button btn = new Button("Browse");
        btn.setOnAction(e->
        {
            FileChooser file = new FileChooser();
            file.setTitle("Open File");
            file.showOpenDialog(stage);
        });
        HBox root = new HBox();
        //root.getChildren().add(file);

        root.setSpacing(20);
        root.getChildren().addAll(label,tf,btn);
        Scene scene = new Scene(root,350,100);
        stage.setScene(scene);
        stage.setTitle("FileChooser Example");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
