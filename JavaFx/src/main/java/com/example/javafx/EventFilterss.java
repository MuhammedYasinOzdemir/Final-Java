package com.example.javafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EventFilterss extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Adding Labels and TextFileds to the scene
        Label l1 = new Label("Press Any Key ");
        Label l2 = new Label("Filtering Event ");

        l1.setTranslateX(100);
        l1.setTranslateY(100);

        l2.setTranslateX(100);
        l2.setTranslateY(150);

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        tf1.setTranslateX(250);
        tf1.setTranslateY(100);
        tf2.setTranslateX(250);
        tf2.setTranslateY(150);

        EventHandler<KeyEvent> filter=new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                tf2.setText(keyEvent.getEventType().toString());
                 tf1.setText(keyEvent.getText());
            }
        };
        tf1.addEventFilter(KeyEvent.ANY,filter );//fitre eklenir
        //Ozelliği kullanmak istdeğinde bir çok filtre eklenebilir
        Group root = new Group();
        root.getChildren().addAll(l1,l2,tf1,tf2);
        Scene scene = new Scene(root,500,300, Color.WHEAT);
        stage.setScene(scene);
        stage.setTitle("Adding Event Filter");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
