package com.example.javafx;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.EventListener;
import java.util.Timer;

public class Panel extends Pane implements EventHandler<KeyEvent>, EventListener {
    private Circle circle;
    private TranslateTransition right=new TranslateTransition();


    public Panel() {
        setFocused(true);



        getChildren().add(circle);
        circle.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getEventType()==KeyEvent.KEY_PRESSED)
                    circle.setFill(Color.YELLOW);
            }
        });
    }


    @Override
    public void handle(KeyEvent keyEvent)  {
        if(keyEvent.getEventType()==KeyEvent.KEY_PRESSED){

        }
    }

}
