package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Effect extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //JavaFX ColorAdjust Efekti
        Text text=new Text("EFfecksiz");
        Text text1=new Text("Effectli");
        text1.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, FontPosture.REGULAR,16));
        text.setFont(Font.font("Courier 10 Pitch",FontWeight.BOLD,FontPosture.REGULAR,16));
        text1.setFill(Color.RED);
        text.setFill(Color.RED);
        text1.setStroke(Color.BLACK);
        text.setStroke(Color.BLACK);
        text1.setStrokeWidth(0.2);
        text.setStrokeWidth(0.2);
        text.setX(20);
        text1.setX(100);
        text.setY(60);
        text1.setY(60);
        ColorAdjust c=new ColorAdjust();
        c.setBrightness(0.2);//parlaklık
        c.setContrast(0.3);//kontsarat
        c.setHue( 0.3 ); // rengin tonunu ayarlıyoruz
        c.setSaturation( 0.45 ); // rengin tonunu ayarlıyoruz.
        text1.setEffect(c);//effect uygulanır
        Pane pane=new Pane();
        pane.getChildren().add(text);
        pane.getChildren().add(text1);
        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.setTitle("Effect");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
