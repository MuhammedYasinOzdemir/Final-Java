package com.example.javafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SetOnKeyEvent extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        TextField textField=new TextField();
        TextField textField1=new TextField();
        TextField textField2=new TextField();
        textField1.setTranslateX(60);
        textField1.setLayoutY(100);
        textField.setTranslateX(220);
        textField.setLayoutY(100);
        textField2.setTranslateX(400);
        textField2.setTranslateY(100);
        textField1.setOnKeyPressed(new EventHandler<KeyEvent>() {//bırakıldıgında
            @Override
            public void handle(KeyEvent keyEvent) {
                textField.setText(keyEvent.getText());
            }
        });
        textField1.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                textField2.setText(textField1.getText());
            }
        });
        Pane pane=new Pane(textField1,textField,textField2);

        pane.setBackground(Background.fill(Color.GOLD));
        Scene scene=new Scene(pane,540,300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}
