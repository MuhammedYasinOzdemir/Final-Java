package com.example.finaljavfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.HashMap;

public class YemekListesi extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label label=new Label("Yemek Listesi");
        Label fis=new Label();
        label.setFont(new Font("Times New Roman",18));
        CheckBox Kebap=new CheckBox("Kebap");
        CheckBox Lahmacun=new CheckBox("Lahmacun");
        RadioButton ayran=new RadioButton("Ayran");
        RadioButton cay=new RadioButton("Cay");
        ToggleGroup group=new ToggleGroup();
        ayran.setToggleGroup(group);
        cay.setToggleGroup(group);
        VBox vBox=new VBox(Kebap,Lahmacun,ayran,cay);
        vBox.setSpacing(8);
        Button odeme=new Button("Odeme");
        Button çıkıs=new Button("Cikis");
        HashMap<String ,Double> fiyatlistesi=new HashMap<>();
        fiyatlistesi.put("Kebap",60.);
        fiyatlistesi.put("Lahmacun",24.5);
        fiyatlistesi.put("Ayran",12.5);
        fiyatlistesi.put("Cay",9.);
        çıkıs.setOnAction(event ->{
            System.exit(1);
        });
        odeme.setOnAction(event ->{
            double fiyat=0;
            String message="************ Muhammed Yasin ************\n\n";


           if(Kebap.isSelected()){
               fiyat+=fiyatlistesi.get(Kebap.getText());
               message+=Kebap.getText()+" :"+fiyatlistesi.get(Kebap.getText())+"\n";
           }
            if(Lahmacun.isSelected()){
                fiyat+=fiyatlistesi.get(Lahmacun.getText());
                message+=Lahmacun.getText()+" :"+fiyatlistesi.get(Lahmacun.getText())+"\n";
            }
            if(cay.isSelected()){
                fiyat+=fiyatlistesi.get(cay.getText());
                message+=cay.getText()+" :"+fiyatlistesi.get(cay.getText())+"\n";
            }
            if(ayran.isSelected())
            {
                fiyat+=fiyatlistesi.get(ayran.getText());
                message+=ayran.getText()+" :"+fiyatlistesi.get(ayran.getText())+"\n";
            }
            message+="Toplam Fiyat :"+fiyat;

            fis.setText(message);

        });
        GridPane pane=new GridPane();
        pane.setPadding(new Insets(12));
        pane.addRow(0,label);
        pane.add(vBox,1,1);
        pane.addRow(3,odeme,çıkıs);
        pane.addRow(4,fis);
        pane.setHgap(6);
        pane.setVgap(8);
        Scene scene=new Scene(pane,640,480);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
