package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Rotate_dondurme extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rect1=new Rectangle(100,100,200,200);
        Rectangle rect2=new Rectangle(100,100,200,200);
        Rotate rotate=new Rotate();
        rotate.setAngle(30);//30 derce dondurur
        rotate.setPivotX(300);//öteleme yapar
        rotate.setPivotY(700);////x tarafında yapar
        rect2.getTransforms().add(rotate);
        Pane pane=new Pane(rect1,rect2);
        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
