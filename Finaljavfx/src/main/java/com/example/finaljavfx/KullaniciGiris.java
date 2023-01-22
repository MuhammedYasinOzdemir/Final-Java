package com.example.finaljavfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class KullaniciGiris extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label=new Label("Kullanici Giris Ekrani");
        label.setFont(new Font(22));
        Label ad_label=new Label("Kullanıcı Adı:");
        Label sifre_label=new Label("Şifre :");
        TextField k=new TextField();
        PasswordField  p=new PasswordField();
        Button giris=new Button("Giris");
        Button iptal=new Button("İptal");
        giris.setPrefSize(90,24);
        iptal.setPrefSize(90,24);
        GridPane gridPane=new GridPane();
        gridPane.setPadding(new Insets(18));
        gridPane.setHgap(6);
        gridPane.setVgap(8);
        gridPane.addRow(0,label);
        gridPane.addRow(1,ad_label,k);
        gridPane.addRow(2,sifre_label,p);
        gridPane.add(giris,3,1);
        gridPane.add(iptal,3,2);
        giris.setOnAction(event->{
            Alert alert = null;
            if(k.getText().equals("Yasin") && p.getText().equals("12345")){
                 alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setHeaderText("Hoşgeldiniz");
                alert.setContentText("Şifre Doğru");
            }
            else{
                alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Tekrar Deneyiniz...");
                alert.setContentText("Şifre Yanlış");
            }
            alert.showAndWait();
        });
        iptal.setOnAction(actionEvent -> {
            System.exit(1);
        });
        Scene scene=new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
