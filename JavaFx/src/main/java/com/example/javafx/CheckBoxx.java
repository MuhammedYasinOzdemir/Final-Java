package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CheckBoxx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label l=new Label("Yapılacaklar Listesi :");
        CheckBox c1=new CheckBox("Java");
        CheckBox c2=new CheckBox("Python");
        CheckBox c3=new CheckBox("C++");
        CheckBox c4=new CheckBox("PHP");
        c4.fire();//işaretli geliyor
        HBox root=new HBox();//yatay seri olusturur
        root.setSpacing(12);
        root.setTranslateX(6);
        root.setTranslateY(8);
        root.getChildren().addAll(l,c1,c2,c3,c4);
        Pane pane=new Pane(root);
        pane.setBackground(Background.fill(Color.FUCHSIA));
        Scene scene=new Scene(pane,400,200);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
