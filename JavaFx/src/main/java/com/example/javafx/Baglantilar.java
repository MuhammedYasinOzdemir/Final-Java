package com.example.javafx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Baglantilar extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //HyperLink mesela web sayfalarına erişmek için kullanılır
        Hyperlink hp=new Hyperlink("https://www.google.com.tr/");
        GridPane root=new GridPane();
        hp.setOnAction(actionEvent -> System.out.println("Link tıklandı..."));
        root.addColumn(0,hp);
        FileInputStream inputStream=new FileInputStream("C:\\Users\\User\\Desktop\\uzaygemisi.png");
        Image image=new Image(inputStream);
        ImageView imageView=new ImageView(image);
        Hyperlink hp2=new Hyperlink();
        hp2.setGraphic(imageView);
        hp2.setOnAction(actionEvent -> System.out.println("Resme Tıklandı..."));
        root.addColumn(1,hp2);
        Scene scene=new Scene(root,1000,800);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
