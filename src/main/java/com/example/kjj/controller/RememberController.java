/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.kjj.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author aliajvand
 */
public class RememberController implements Initializable {


    public Circle green;
    public Circle yellow;
    public Circle red;
    public TextField number;
    @FXML
    TextField email;


    @FXML
    Label box;;

    @FXML
    TextField numberInBox;

    @FXML
    public void login(ActionEvent event) {

    }
    @FXML
    public void forward(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
