package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RadioButtonn extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ToggleGroup group=new ToggleGroup();//buton grouopu olusturur
        RadioButton button1=new RadioButton("Buton 1");
        RadioButton button2=new RadioButton("Buton 2");
        RadioButton button3=new RadioButton("Buton 3");
        RadioButton button4=new RadioButton("Buton 4");
        button1.setToggleGroup(group);
        button2.setToggleGroup(group);
        button3.setToggleGroup(group);
        button4.setToggleGroup(group);
        button1.setTranslateX(6);
        button1.setTranslateY(8);
        button2.setTranslateX(6);
        button2.setTranslateY(8);
        button3.setTranslateX(6);
        button3.setTranslateY(8);
        button4.setTranslateX(6);
        button4.setTranslateY(8);
        VBox root=new VBox();
        root.setSpacing(12);
        root.setBackground(Background.fill(Color.ALICEBLUE));
        root.getChildren().addAll(button1,button2,button3,button4);
        Scene scene=new Scene(root,400,240);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
