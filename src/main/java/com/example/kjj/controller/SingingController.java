/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.kjj.controller;

import com.example.kjj.dao.concrete.UserDaoMySQL;
import com.example.kjj.models.User;
import com.example.kjj.service.ScreenService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author aliajvand
 */
public class SingingController implements Initializable {

    public TextField userName;
    @FXML
     TextField email;

    @FXML
     TextField familyname;

    @FXML
     Circle green;

    @FXML
     TextField name;

    @FXML
    private TextField password;

    @FXML
     Circle red;

    @FXML
     Circle yellow;

    @FXML
    void login(ActionEvent event) throws SQLException, IOException {
        UserDaoMySQL userDaoMySQL = new UserDaoMySQL();
        userDaoMySQL.insert(new User(
                name.getText(),
                familyname.getText(),
                email.getText(),
                userName.getText(),
                password.getText()
        ));
        ScreenService.getInstance().setView("main");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO
    }

}
