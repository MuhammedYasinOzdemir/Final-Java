package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HBox_And_Vbox extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button btn=new Button("Buton 1");
        Button btn1=new Button("Buton 2");
        HBox root=new HBox();

        root.getChildren().addAll(btn1,btn);
        root.setSpacing(50);//butonlar arası bosluk olusturur
        //hosrizontol şekilde hizalar
        root.setBackground(Background.fill(Color.RED));
        Button button1=new Button("Buton 3");
        Button button2=new Button("Button 4");
        button1.setTranslateX(300);
        button2.setTranslateX(300);
        VBox root2=new VBox(root);
        root2.getChildren().addAll(button1,button2);
        HBox root3=new HBox(root2);//hem horizantal hem vertical hizalr
        Scene scene=new Scene(root3,400,400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
