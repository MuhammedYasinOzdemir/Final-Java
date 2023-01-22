package com.example.odev;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BilgiEkrani extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label=new Label("Gecen süre:");
        Label label1=new Label("Konum Değiştir:");
        Label label2=new Label("Boya sayısı:");
        Button btn=new Button("Animasyon Başlat X");
        Button btn2=new Button("Animasyon Başlat Y");
        Text text=new Text("Bilgi Ekranı");
        TextField textField=new TextField();
        TextField textField1=new TextField();
        TextField textField2=new TextField();
        GridPane gridPane=new GridPane();
        gridPane.addRow(0,text);
        gridPane.addRow(1,label,textField);
        gridPane.addRow(2,label1,textField1);
        gridPane.addRow(3,label2,textField2);
        gridPane.addRow(4,btn,btn2);
        gridPane.setHgap(8);
        gridPane.setVgap(6);
        Insets insets=new Insets(6);
        gridPane.setPadding(insets);
        Scene scene=new Scene(gridPane,300,180);
        stage.setResizable(false);
        stage.setTitle("Kontrol Ekranı");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
