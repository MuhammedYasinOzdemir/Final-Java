package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class Transformation_Donusum extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rect1 = new Rectangle(20,20,200,150);
        Rectangle rect2 = new Rectangle(20,20,200,150);
        rect1.setFill(Color.RED);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(5);
        rect2.setFill(Color.GREEN);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(5);
        //Translate ters çevirri
        Translate translate=new Translate();
        translate.setX(200);
        translate.setY(200);
        translate.setZ(200);//çapraz gider sağ alta doğru
        rect2.getTransforms().add(translate);

        Pane pane=new Pane();
        pane.getChildren().addAll(rect1,rect2);
        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
