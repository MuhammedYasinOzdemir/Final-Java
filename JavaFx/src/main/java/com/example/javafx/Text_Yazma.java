package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Text_Yazma extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane=new Pane();
        Text text=new Text();
        text.setText("Merhaba");
        text.setFont(Font.font("Times New Roman",32));
        text.setX(200);
        text.setY(100);
        text.setUnderline(true);//altını çizer
        pane.getChildren().add(text);
        Text text2=new Text();
        text2.setText("Yasin");
        text2.setFont(Font.font( "Abyssinica SIL" , FontWeight.BOLD, FontPosture.REGULAR, 48 ));
        //Tür ağırlık,durus italik vs,boyut
        text2.setY(300);
        text2.setStrikethrough(true);//üstunu cizer
        text2.setFill(Color.RED);//rengi değiştirir
        text2.setStroke(Color.GOLD);//dışını bordur gibi
        text2.setStrokeWidth(4);//kalınlık
        pane.getChildren().add(text2);
        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.setTitle("Text Yazöa");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }


}
