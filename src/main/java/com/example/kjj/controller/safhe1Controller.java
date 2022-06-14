/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package com.example.kjj.controller;

import com.example.kjj.dao.concrete.ProductDaoMySQL;
import com.example.kjj.dao.concrete.SaderDaoMySQL;
import com.example.kjj.dao.concrete.UserDaoMySQL;
import com.example.kjj.models.Product;
import com.example.kjj.models.Sader;
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
import java.util.Collection;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

/**
 *
 * @author aliajvand
 */

public class safhe1Controller implements Initializable {
    @FXML
     Circle green;

    @FXML
     TextField pass;

    @FXML
     Circle red;

    @FXML
     TextField username;

    @FXML
     Circle yellow;

    @FXML
    void login(ActionEvent event) throws SQLException {

        User user = new User();
        user.setUsername(username.getText());
        user.setPassword(pass.getText());

        UserDaoMySQL userDaoMySQL = new UserDaoMySQL();

        user = userDaoMySQL.find(user).stream().findFirst().orElse(null);

        if (user != null){
            try {
                ScreenService.getInstance().setView("main");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            username.clear();
            pass.clear();
        }
    }

    @FXML
    void register(ActionEvent event) throws IOException {
        ScreenService.getInstance().setView("singing");
    }

    @FXML
    void restore(ActionEvent event) {

    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
