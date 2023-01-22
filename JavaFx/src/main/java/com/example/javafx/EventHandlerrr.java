package com.example.javafx;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EventHandlerrr extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //OLay ekleme
        Circle c = new Circle(100, 100, 50);
        c.setFill(Color.GREEN);
        c.setStroke(Color.BLACK);

        Button btn = new Button("Play");
        btn.setTranslateX(125);
        btn.setTranslateY(200);

        Button btn1 = new Button("Pause");
        btn1.setTranslateX(175);
        btn1.setTranslateY(200);

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setAutoReverse(false);
        translateTransition.setByX(50);
        translateTransition.setCycleCount(300);
        translateTransition.setDuration(Duration.millis(1000));
        translateTransition.setNode(c);



        EventHandler<MouseEvent> handler=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getSource()==btn){
                    translateTransition.play();
                }
                if(event.getSource()==btn1)//kaynaga bakar
                    translateTransition.pause();
                event.consume();//sonlandırır eventi
            }
        };
        btn.setOnMouseClicked(handler);//özellikler atanır kaynnağa gore haraket eder
        btn1.setOnMouseClicked(handler);
        Pane pane=new Pane(c,btn,btn1);
        Scene scene=new Scene(pane,640,480,Color.CYAN);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }

}
