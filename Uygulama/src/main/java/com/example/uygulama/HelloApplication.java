package com.example.uygulama;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Grafik root=new Grafik();
        root.setFocusTraversable(true);

        Scene scene = new Scene(root);
        stage.setTitle("Uygulama");
        stage.setResizable(false);

        stage.setWidth(800);
        stage.setHeight(600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static class ders1 extends Application {

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            Pane pane=new Pane();

            primaryStage.setTitle("Merhaba Yazdırma");//stage pencereyi temsil eder
            Label label=new Label("Merhaba");//Label oluşturur
            pane.getChildren().add(label);//labeli ekleriz
            Button btn=new Button("OK");
            pane.getChildren().add(btn);//buton eklenir
            Scene scene=new Scene(pane);//ekran panele aktarılır
            primaryStage.setScene(scene);//ekran değiştitlir
            primaryStage.setTitle("Merhaba Yazdırma");//Başlık belirlenir
            primaryStage.show();//ekran gösterilir

        }
    }
}