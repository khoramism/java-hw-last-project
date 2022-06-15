package com.example.kjj.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login {

    public TextField pass;
    @FXML
    private Button btnSabt;

    @FXML
    private Label txtLable1;

    @FXML
    private Label txtLable2;

    @FXML
    private TextField password;

    @FXML
    private TextField username;

    @FXML
    void pressBtnSabt(ActionEvent event) {
        System.out.println(password);
        System.out.println(username);
    }

}
