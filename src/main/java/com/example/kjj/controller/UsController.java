/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.kjj.controller;

import com.example.kjj.service.ScreenService;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author aliajvand
 */
public class UsController implements Initializable {

    public Label name;
    public Label email;
    public Label phone;
    public Label job;
    public Label alireza;
    public Label milad;
    public Label ali;
    public Label dara;
    public Label daraE;
    public Label miladE;
    public Label alirezaE;
    public Label aliE;
    public Label daraP;
    public Label miladP;
    public Label alirezaP;
    public Label aliP;
    public Label daraJ;
    public Label miladJ;
    public Label alirezaJ;
    public Label aliJ;
    public Circle red;
    public Circle yellow;
    public Circle green;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void mainPage() throws IOException {
        ScreenService.getInstance().setView("main");
    }
}
