package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane pane = new Pane();
        primaryStage.setTitle("Merhaba Yazdırma");
        Label label = new Label("Merhaba");
        pane.getChildren().add(label);
        Button btn = new Button("OK");
        btn.setCenterShape(true);
        btn.setLayoutX(200);//200 birim sağa
        btn.setLayoutY(150);//150 birim asağı kaydırır
        btn.setOnAction(new EventHandler<ActionEvent>() {//Butona basıldımı ne gerçekleşiceği belirlenir
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Merhaba");
            }
        });
        pane.getChildren().add(btn);
        Scene scene = new Scene(pane,400,400);//Ölçüleri belirlernir
        primaryStage.setScene(scene);
        primaryStage.setTitle("Merhaba Yazdırma");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}