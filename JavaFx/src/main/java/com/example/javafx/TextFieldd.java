package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextFieldd extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Label k_adi=new Label("Kullanıcı Adı :");
        Label paralo=new Label("Paralo");
        Text text=new Text("Kullanıcı girişi");
        text.setFont(Font.font("Times New Roman",18));
        TextField k_adii=new TextField();
        PasswordField passwordField=new PasswordField();
        GridPane gridPane=new GridPane();
        gridPane.addRow(0,text);
        gridPane.addRow(1,k_adi,k_adii);
        gridPane.addRow(2,paralo,passwordField);
        gridPane.setHgap(6);
        gridPane.setVgap(8);
        gridPane.setTranslateX(8);

        Pane pane=new Pane(gridPane);
        Insets insets=new Insets(8,8,4,4);
        pane.setPadding(insets);
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
