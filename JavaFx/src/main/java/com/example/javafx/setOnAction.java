package com.example.javafx;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class setOnAction extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rectangle=new Rectangle(100,100,120,120);//bas ,ve son koordinatlar girirlir
        rectangle.setFill(Color.YELLOW);//boyanır dikdorgen
        rectangle.setStroke(Color.RED);//border boyar
        Circle circle=new Circle(300,100,50,Color.BLACK);
        circle.setStroke(Color.YELLOW);
        RotateTransition  rotateTransition=new RotateTransition();//Animasyon sınıfından döndürme animasyonu eklendi
        rotateTransition.setAutoReverse(false);//otamatik donme kapanaır
        rotateTransition.setByAngle(360);//donme ekseni açııs belirleni
        rotateTransition.setCycleCount(500);//dögü sayısı belirlenir
        rotateTransition.setDuration(Duration.millis(500));//kaç ms de döceği belirlenir
        rotateTransition.setNode(rectangle);//dikdörtgen eklennir
        RotateTransition rotateTransition1=new RotateTransition();
        rotateTransition1.setAutoReverse(false);
        rotateTransition1.setByAngle(180);
        rotateTransition1.setCycleCount(200);
        rotateTransition1.setDuration(Duration.millis(1500));
        rotateTransition1.setNode(circle);
        Button btn=new Button("Play");
        btn.setTranslateX(120);
        btn.setTranslateY(300);

        //Önemli butona basıldığında metod aktif edilir
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                rotateTransition.play();//başlatılır
                rotateTransition1.play();
            }
        });
        Button btn2=new Button("Pause");
        btn2.setTranslateX(200);
        btn2.setTranslateY(300);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                rotateTransition.pause();
                rotateTransition1.pause();//durdurulur
            }
        });
        Group pane=new Group(btn,rectangle,btn2,circle);
        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}
