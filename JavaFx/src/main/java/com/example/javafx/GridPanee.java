package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GridPanee extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //satır satır eklemeye yarar gridpane
        //genelde kullanıcı girişlerinde uygundur
        Label first_name=new Label("First Name");
        Label last_name=new Label("Last Name");
        TextField textField=new TextField();
        TextField textField1=new TextField();
        textField1.setLayoutY(20);
        first_name.setTranslateX(20);//sağa kaydırıyor
        last_name.setTranslateX(20);
        Button button=new Button("Submit");
        button.setTranslateX(140);
        GridPane root=new GridPane();
        Scene scene=new Scene(root,250,100);
        root.addRow(0,first_name,textField1);//satır satır ayırmaya yarar
        root.addRow(1,last_name,textField);
        root.addRow(2,button);
        root.setHgap(30);
        root.setVgap(10);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
