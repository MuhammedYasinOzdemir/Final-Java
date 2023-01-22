package com.example.finaljavfx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class MouseEventler extends Application implements EventHandler<MouseEvent> {
    @Override
    public void start(Stage stage) throws Exception {
        Button btn1=new Button("Buton1"),btn2=new Button("Buton 2"),btn3=new Button("Button3"),btn4=new Button("Button 4");
        HBox hBox=new HBox(btn1,btn2,btn3,btn4);
        Random rnd=new Random();
        hBox.setSpacing(18);
        hBox.setPadding(new Insets(12));
        btn1.setOnMouseClicked(e->{//tıklama
            btn1.setTextFill(Color.rgb(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255) ));

        });
        btn2.setOnMouseEntered(event -> {//giris yapma
            btn2.setBackground(Background.fill(Color.YELLOW));
        });
        btn2.setOnMouseExited(e->{//çıkıs yapma buttından yani ustunden
            btn2.setBackground(Background.fill(Color.CYAN));
        });
        btn3.setOnMouseMoved(e->{
            btn3.setBackground(Background.fill(Color.rgb(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255) )));
        });
        btn4.setOnMouseClicked(this);
        btn4.setOnMouseEntered(this);
        btn4.setOnMouseDragEntered(this);
        btn4.setOnMouseDragExited(this);
        btn4.setOnMouseMoved(this);
        
        //Ek olarak Drag çekilme hareketş algılanmazo
        Scene scene=new Scene(hBox);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }

    @Override
    public void handle(MouseEvent event) {
        System.out.println(event.getEventType());
        System.out.println(event.getSource());
    }
}
