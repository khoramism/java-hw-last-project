package com.example.kjj.dao;

import com.example.kjj.dao.concrete.ProductDaoMySQL;
import com.example.kjj.dao.concrete.SaderDaoMySQL;
import com.example.kjj.dao.concrete.UserDaoMySQL;
import com.example.kjj.models.Product;
import com.example.kjj.models.Sader;
import com.example.kjj.models.User;

import java.sql.SQLException;

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
        Product product = new Product("csc Product", "this was a Desciptions", 1000, true,true);
        productDaoMySQL.update(product);

//

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
