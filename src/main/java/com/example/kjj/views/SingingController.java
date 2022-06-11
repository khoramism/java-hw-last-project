/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.kjj.views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author aliajvand
 */
public class SingingController implements Initializable {

     @FXML
     TextField email;

    @FXML
     TextField familyname;

    @FXML
     Circle green;

    @FXML
     TextField name;

    @FXML
     TextField numberInBox;

    @FXML
    private TextField phone;

    @FXML
     Circle red;

    @FXML
     Circle yellow;

    @FXML
    void login(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
