package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class sekiller3d extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Sphere sphere=new Sphere();
        sphere.setRadius(20);
        sphere.setTranslateX(50);
        sphere.setTranslateY(100);
        sphere.setCullFace(CullFace.BACK);//arkadan gorunus
        Sphere sphere2=new Sphere();
        sphere2.setRadius(20);
        sphere2.setTranslateX(150);//otelenme x de
        sphere2.setTranslateY(100);//otelenme y
        sphere.setCullFace(CullFace.FRONT);//ön
        Sphere sphere3=new Sphere();
        sphere3.setRadius(20);
        sphere3.setTranslateX(400);
        sphere3.setTranslateY(200);
        sphere3.setCullFace(CullFace.NONE);//düz bakıs
        Pane pane=new Pane(sphere2,sphere3,sphere);
        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
