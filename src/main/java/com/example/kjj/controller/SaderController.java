package com.example.kjj.controller;

import com.example.kjj.dao.concrete.SaderDaoMySQL;
import com.example.kjj.enums.Pack;
import com.example.kjj.enums.Transport;
import com.example.kjj.models.Product;
import com.example.kjj.models.Sader;
import com.example.kjj.models.User;
import com.example.kjj.service.ScreenService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SaderController {

        public Text DescriptionProduct;
        public Text TitleProduct;
        public TextField packaging;
        public TextField amountProduct;
        public Text productPrice;
        public Text SaderedProductTitle1;
        public Text SaderedProductTitle2;
        public Text SaderedProductTitle3;
        public Text SaderedProductTitle4;


        @FXML
        void onHelloButtonClick(ActionEvent event) {

        }

        public void pressObjPardakhtBtn(ActionEvent actionEvent) {

        }

        public void Submit(ActionEvent actionEvent) throws IOException, SQLException {
                ScreenService.getInstance().setView("detail");
                ScreenService.getInstance().setView("Saderat");
                Product proudct = new Product();
                proudct.setPrice(Integer.parseInt(productPrice.getText()));
                proudct.setTitle(TitleProduct.getText());
                proudct.setDescription(DescriptionProduct.getText());
                Sader sader = new Sader();
                sader.setProduct(proudct);
                sader.setAmount(Integer.parseInt(amountProduct.getText()));
                User user = new User();
                user.setFirstName("GHoli");
                user.setLastName("Gholi bOlboi");
                user.setEmail("ghol@gholi.com");
                user.setAllowedToTrade(true);
                user.setPassword("asjcpsajcopj");
                user.setUsername("gholi23");
                sader.setUser(user);
                sader.setRavshErsal(Transport.LAND);
                sader.setPackaging(Pack.SPECIAL);
                SaderDaoMySQL saderDaoMySQL = new SaderDaoMySQL();
                saderDaoMySQL.insert(sader);
        }

        public void Payment(ActionEvent actionEvent) {

        }


        @Override
        public void initialize(URL url, ResourceBundle rb) {
        }
}