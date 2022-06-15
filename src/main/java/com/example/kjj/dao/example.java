package com.example.kjj.dao;

import com.example.kjj.dao.concrete.ProductDaoMySQL;
import com.example.kjj.dao.concrete.SaderDaoMySQL;
import com.example.kjj.dao.concrete.UserDaoMySQL;
import com.example.kjj.models.Product;
import com.example.kjj.models.Sader;
import com.example.kjj.models.User;

import java.sql.SQLException;
import java.util.List;

public class example {
    public static void main(String[] args) throws SQLException {
        // SaderDaoMySQL saderDaoMySQL = new SaderDaoMySQL();
        // UserDaoMySQL userDaoMySQL = new UserDaoMySQL();
        ProductDaoMySQL productDaoMySQL = new ProductDaoMySQL();

//        User user  = new User("mahdi","mahdi","mahdi","mahdi","mahdi");
//        Product product = new Product("test","test",10000,true,"mahdi","mahdi","mahdi",true);
//        Set<Product> productSet = new HashSet<>();
//        productSet.add(product);
//        Sader sader = new Sader(productSet ,user,true,"mahdi","mahdi","mahdi");
//        userDaoMySQL.insert(user);
//        productDaoMySQL.insert(product);
//        saderDaoMySQL.insert(sader);
//        user.getSaders().add(sader);
//        userDaoMySQL.update(user);
        Product product = new Product("Very COol Poruct here ", "THis is a very BadASs description", 10000, true,true);
        Product product1 = new Product("Aweosme Product", "THis is a very Awesome descript", 122000, true,true);
        Product product2 = new Product("Great product BRO", "THis is a very Great des", 14354, true,true);
        Product product3 = new Product("Very COol Pruct here ", "Could i be any cooler of a product", 544654, true,true);
        productDaoMySQL.insert(product);
        productDaoMySQL.insert(product1);
        productDaoMySQL.insert(product2);
        productDaoMySQL.insert(product3);
        List<Product> reza =  productDaoMySQL.all();
        for (int i = 0; i < reza.size(); i++) {

            // Print all elements of List
            System.out.println(reza.get(i));
        }

        /*
        User user  = new User();
        user.setUsername("mahdi");
        user.setEmail("mahdi@gmal.com");
        user.setFirstName("mahdi");
        user.setLastName("Roz");
        user.setPassword("gholi");
        userDaoMySQL.insert(user);
        */

        //    u.getSaders().forEach(s->{


            //        System.out.println(s.getProduct().getDescription());
            //    System.out.println(s.getId());
            //});
            //System.out.println(u.getEmail());
            //});

        // Sader sader = new Sader();
        // sader.setId(3L);
        // saderDaoMySQL.find(sader).forEach(s->{
        //     System.out.println(s.getUser().getEmail());
        // });

    }
}
