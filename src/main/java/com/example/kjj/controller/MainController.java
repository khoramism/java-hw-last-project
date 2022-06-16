/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.example.kjj.controller;
import com.example.kjj.models.Product;
import com.example.kjj.dao.concrete.ProductDaoMySQL;
import com.example.kjj.dao.concrete.VaredDaoMySQL;
import com.example.kjj.service.ScreenService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author aliajvand
 */
public class MainController implements Initializable {
    @FXML
    private Label id;

    @FXML
    private Label id1;

    @FXML
    private Label id2;

    @FXML
    private Label id3;

    @FXML
    private Label title;

    @FXML
    private Label title1;

    @FXML
    private Label title2;

    @FXML
    private Label title3;



    @FXML
    private Label price;

    @FXML
    private Label price1;

    @FXML
    private Label price2;

    @FXML
    private Label price3;


    @FXML
    private Circle green;

    @FXML
    private Circle red;

    @FXML
    private Circle yellow;

    @FXML
    private TextField query;


    @FXML
    void us(ActionEvent event) throws IOException {
        ScreenService.getInstance().setView("us");
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {

        id.setText("0");
        id1.setText("1");
        id2.setText("2");
        id3.setText("3");
        title.setText("Very COol Poruct here ");
        title1.setText("Aweosme Product");
        title2.setText("Great product BRO");
        title3.setText("Could i be any cooler of a product");
        price.setText("10000");
        price1.setText("122000");
        price2.setText("14354");
        price3.setText("544654");
    }

    public void search(ActionEvent actionEvent) throws SQLException, IOException {
        ProductDaoMySQL productDaoMySQL = new ProductDaoMySQL();
        Product product = new Product();
        product.setDescription(query.getText());
        product.setTitle(query.getText());
        // product.setPrice(query.getText());
        List<Product> searched_products = productDaoMySQL.find(product);

        ScreenService.getInstance().setView("detail");
    }
}
