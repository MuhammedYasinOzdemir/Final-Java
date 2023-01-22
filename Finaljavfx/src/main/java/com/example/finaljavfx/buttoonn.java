package com.example.finaljavfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class buttoonn extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button button=new Button("Buton 1");
        Button button1=new Button("Button 2");
        button.setBackground(Background.fill(Color.RED));
        TextField textField=new TextField();
        Label label=new Label("Write Ypur Name");
        GridPane pane=new GridPane();
        pane.addRow(0,textField,button,label);
        pane.setHgap(20);
        pane.setVgap(50);
        pane.setPadding(new Insets(20,20,0,50));
        button.setOnAction(actionEvent -> {
            label.setText(textField.getText());
        });
        button.setOnMouseEntered(event ->{
            button.setBackground(Background.fill(Color.BLUE));
        });

        Scene scene=new Scene(pane,480,320);
        scene.setFill(Color.GREENYELLOW);
        button.setOnMouseExited(event ->
        {
            button.setBackground(Background.fill(Color.RED));
        });
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
