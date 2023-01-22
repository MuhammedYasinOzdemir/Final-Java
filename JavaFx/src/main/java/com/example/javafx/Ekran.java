package com.example.javafx;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.security.Key;

public class Ekran extends Application  {
    private static int topx=200;
    private static int topy=200;
    private static int top_hiz=20;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws Exception {
        Pane panel=new Pane();
        scene=new Scene(panel,640,480, Color.CYAN);
        Circle circle=new Circle(topx,topy,20, Color.RED);

        new AnimationTimer() {
            @Override
            public void handle(long l) {
                klavye();
                circle.setCenterX(topx);
                circle.setCenterY(topy);
            }
        }.start();



        panel.getChildren().add(circle);
        stage.setTitle("Ekran");

        panel.setFocusTraversable(true);

        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
    public static void klavye(){
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode()==KeyCode.UP) {
                    topy+=top_hiz;
                }
                if(keyEvent.getCode()==KeyCode.DOWN)
                    topy-=top_hiz;
                if (keyEvent.getCode()==KeyCode.LEFT)
                    topx-=top_hiz;
                if(keyEvent.getCode()==KeyCode.RIGHT)
                    topx+=top_hiz;
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println(keyEvent.getCode()+" releades");
            }
        });
    }

}
