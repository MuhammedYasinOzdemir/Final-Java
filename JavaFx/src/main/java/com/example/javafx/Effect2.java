package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Effect2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Rectangle rectangle=new Rectangle();
        ColorInput color=new ColorInput();
        color.setPaint(Color.RED);
        color.setWidth(100);
        color.setHeight(100);
        color.setX(100);
        color.setY(100);
        rectangle.setEffect(color);
        Rectangle rectangle1=new Rectangle(400,400);
        ColorInput color2=new ColorInput();
        color2.setPaint(Color.YELLOW);
        color2.setWidth(100);
        color2.setHeight(100);
        color2.setX(100);
        color2.setY(100);
        Blend blend=new Blend();
        blend.setBottomInput(color2);
        blend.setMode(BlendMode.ADD);//arkasında görünür
        blend.setOpacity(0.6);
        rectangle1.setEffect(blend);//Renge efect uygular
        Pane pane=new Pane(rectangle,rectangle1);


        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }

    public static class Ekran extends Application {
        @Override
        public void start(Stage stage) throws Exception {

            Panel pane=new Panel();
            Scene scene=new Scene(pane,640,480, Color.CYAN);
            stage.setResizable(false);
            stage.setTitle("Ekran");
            stage.setScene(scene);
            stage.show();
        }
        public static void main(String[] args){
            launch();
        }
    }

    public static class Panel extends Pane {

    }
}
