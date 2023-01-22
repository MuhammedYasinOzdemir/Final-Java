package com.example.finaljavfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KeyEventler extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        TextField t1=new TextField(), t2=new TextField();
        t2.setEditable(false);
        VBox vBox=new VBox(t1,t2);
        vBox.setSpacing(12);
        vBox.setPadding(new Insets(18));
        t1.setOnKeyPressed(e->{
            t2.setText(e.getEventType().toString());
            t1.setBackground(Background.fill(Color.CYAN));
        });
        t1.setOnKeyReleased(e->{
            t2.setText(e.getEventType().toString());
            System.out.println(e.getEventType());
            t1.setBackground(Background.fill(Color.YELLOW));
        });
        Scene scene=new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
