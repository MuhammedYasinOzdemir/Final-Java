package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Sekiller extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane =new Pane();
        pane.setBackground(Background.fill(Color.GOLD));
        Rectangle rct=new Rectangle(50,50);
        //setWidth ve setHeigtte olculeri verebilir
        Paint paint=Color.RED;
        Paint yellow=Color.YELLOW;
        rct.setStroke(paint);//border kırımızı olur
        rct.setFill(yellow);
        rct.setX(100);//konumu belirlenir
        rct.setY(50);
        pane.getChildren().add(rct);
        Line line=new Line(10,10,300,250);
        line.setFill(Color.AQUA);
        pane.getChildren().add(line);
        Ellipse ellipse=new Ellipse(20,20);
        ellipse.setFill(Color.ALICEBLUE);
        ellipse.setLayoutX(300);
        ellipse.setLayoutY(50);
        pane.getChildren().add(ellipse);
        Polygon polygon=new Polygon(4,5,5,4,7);
        polygon.setLayoutX(300);
        polygon.setFill(Color.GOLD);
        polygon.setLayoutX(400);
        polygon.setLayoutY(200);
        pane.getChildren().add(polygon);
        CubicCurve cubicCurve=new CubicCurve();
        cubicCurve.setFill(Color.FUCHSIA);
        cubicCurve.setLayoutY(40);
        pane.getChildren().add(cubicCurve);
        Scene scene=new Scene(pane,800,600);//v x v1 y
        stage.setScene(scene);
        stage.setTitle("Sekiller");
        stage.show();

    }
    public static void main(String[] args){

        launch();

    }
}
