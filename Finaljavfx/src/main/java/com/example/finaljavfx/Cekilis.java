package com.example.finaljavfx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cekilis extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ArrayList<String> kisiler=new ArrayList<>();
        TextField textField=new TextField();
        textField.setPrefSize(280,24);
        textField.setEditable(false);
        TextField textField2=new TextField();
        Label label=new Label("Kazananlar");
        label.setFont(new Font(20));
        Button gozat=new Button("Gozat");
        gozat.setPrefSize(90,24);
        Button cekilis=new Button("Çekiliş Yap");
        cekilis.setPrefSize(90,24);
        ListView<String> liste=new ListView<>();
        liste.setEditable(false);
        liste.setPrefSize(600,240);
        ScrollPane pane=new ScrollPane(liste);
        ObservableList<String> depoliset=FXCollections.observableArrayList();
        gozat.setOnAction(actionEvent -> {
            FileChooser fileChooser=new FileChooser();
            File file=fileChooser.showOpenDialog(stage);
            try(FileReader reader=new FileReader(file)){
                Scanner scn=new Scanner(reader);
                while (scn.hasNextLine()){
                    kisiler.add(scn.nextLine());
                }
                textField.setText(file.getPath());
            }
            catch (FileNotFoundException e){

            }
            catch (IOException e){

            }
        });
        cekilis.setOnAction(actionEvent -> {
            try{
                int kisi_s= Integer.parseInt(textField2.getText()),i=0;
                Random rnd=new Random();
                if(textField.getText().equals(""))
                    throw new Exception("Lütfen dosya seciniz");
                if(Integer.parseInt(textField2.getText())>0 &&Integer.parseInt(textField2.getText())<kisiler.size())
                    throw new Exception("Lütfen çekilis sayısısnı dogru giriniz");
                System.out.println(kisiler.size());
                while (i<Integer.parseInt(textField2.getText())){
                    String kisi=kisiler.get(rnd.nextInt(kisiler.size()));
                        depoliset.add(kisi);
                    i++;
                }
                liste.setItems(depoliset);
            }
            catch (ArithmeticException e){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Lütfen sayi giriniz...");
                alert.show();
            } catch (Exception e) {
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Lütfen dosya seciniz...");
                alert.show();
            }
        });
        GridPane gridPane=new GridPane();
        gridPane.addRow(0,textField,gozat);
        gridPane.add(textField2,0,1);
        gridPane.add(cekilis,1,1);
        gridPane.addRow(2,pane);
        gridPane.setHgap(12);
        gridPane.setVgap(8);
        gridPane.setPadding(new Insets(18));
        Scene scene=new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }


}
