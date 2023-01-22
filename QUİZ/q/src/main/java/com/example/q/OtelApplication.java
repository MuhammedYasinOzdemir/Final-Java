package com.example.q;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.util.ArrayList;

public class OtelApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(OtelApplication.class.getResource("otel.fxml"));

        Scene scene=new Scene(fxmlLoader.load(),640,480);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Otel Rezervasyon");
        stage.show();
    }
    public static void main(String[] args){
        launch();

    }
}
