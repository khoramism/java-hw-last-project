/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.kjj.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import com.example.kjj.enums.Transport;
import com.example.kjj.models.Product;
import com.example.kjj.service.ScreenService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.example.kjj.dao.concrete.*;
import com.example.kjj.models.Sader;
/**
 * FXML Controller class
 *
 * @author aliajvand
 */
public class DetailController implements Initializable {
      @FXML
    private Label Ability;

    @FXML
    private Label Explanation;

    @FXML
    private Label ID;

    @FXML
    private Label price;

    @FXML
    private Label state;

    @FXML
    private Label title;

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void main(ActionEvent event) throws IOException {
        ScreenService.getInstance().setView("main");
    }

    @FXML
    void saderat(ActionEvent event) throws IOException, SQLException {
        ScreenService.getInstance().setView("Saderat");


    }

    @FXML
    void update(ActionEvent event) throws SQLException, IOException {
        ScreenService.getInstance().setView("Update");
    }

    @FXML
    void varedat(ActionEvent event) throws IOException {
        ScreenService.getInstance().setView("Varedat");
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Product product = new Product();
        //product.setPrice(Integer.parseInt(price.getText()));
        product.setId(4L);
        ProductDaoMySQL productDaoMySQL = new ProductDaoMySQL();
        List<Product> allProducts = null;
        try {
            allProducts = productDaoMySQL.find(product);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (Product i : allProducts) {

            // Print all elements of ArrayList
            Explanation.setText(i.getDescription());
            title.setText(i.getTitle());
            price.setText(String.valueOf(i.getPrice()));
            ID.setText(String.valueOf(i.getId()));
            state.setText(String.valueOf(i.getStatus()));
            Ability.setText(String.valueOf(i.getIsAllowed()));
        }

    }
    
}
