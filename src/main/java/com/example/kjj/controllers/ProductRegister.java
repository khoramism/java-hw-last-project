package com.example.kjj.controllers;
import com.example.kjj.models.Product;
import java.sql.Date;
import java.time.LocalDateTime;
public class ProductRegister {
    Product product = new Product("alighaza",
            "alighaza goes to school",
            100,
            true,
            "ali,",
            "reza",
            "khorami",
            true);
    product.insert();
}
