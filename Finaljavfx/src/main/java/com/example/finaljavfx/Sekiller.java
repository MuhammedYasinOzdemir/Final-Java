package com.example.finaljavfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class Sekiller extends Application {
    int c;
    @Override
    public void start(Stage stage) throws IOException {
        Rectangle rct=new Rectangle(100,200, Color.RED);//uzunluga gore olusturur
        Rectangle rct2=new Rectangle(10,20,20,10);//koordinat gore olsutururu
        rct2.setStroke(Color.YELLOWGREEN);//border renk değiştirir
        rct2.setFill(Color.DARKRED);
        rct.setLayoutX(100);
        rct2.setLayoutY(50);
        c=0;
        Line line=new Line(0,0,250,300);
        line.setFill(Color.YELLOW);
        rct.setOnMouseClicked(event ->{
            System.out.println("merhaba");
            if(c==1) {
                line.setStartX(400);
                c=0;
            }
            else {
                line.setStartX(20);
                c=1;
            }

        });
        Circle circle=new Circle(50,Color.BLACK);
        circle.setLayoutX(100);
        circle.setLayoutY(250);

        circle.setOnMouseClicked(event->{
            Random rnd=new Random();
            circle.setFill(Color.rgb(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
        });
        Ellipse ellipse=new Ellipse(30,20);
        ellipse.setLayoutX(300);
        ellipse.setLayoutY(400);
        ellipse.setFill(Color.CYAN);
        ellipse.setOnMouseClicked(event -> {
            ellipse.setLayoutX(ellipse.getLayoutX()+20);
        });
        ellipse.setOnMouseMoved(event -> {
            Random rnd=new Random();
            ellipse.setFill(Color.rgb(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
        });
        Pane pane=new Pane();
        pane.getChildren().addAll(rct,rct2,line,circle,ellipse);
        Scene scene=new Scene(pane,640,480);
        scene.setFill(Color.GOLD);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
