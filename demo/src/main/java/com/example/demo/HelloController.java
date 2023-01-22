package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField text;

    @FXML
    protected void onHelloButtonClick() {
        text.setText("kcsoo");
    }
}