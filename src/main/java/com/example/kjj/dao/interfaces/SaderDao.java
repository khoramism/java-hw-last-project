package com.example.kjj.dao.interfaces;

import java.sql.SQLException;

import java.util.ArrayList;

import com.example.kjj.models.Product;
import com.example.kjj.models.Sader;



public interface SaderDao {
    Sader save(Sader object) throws SQLException;
    Sader insert(Sader object) throws SQLException;
    ArrayList<Sader> all() throws SQLException;
    int deleteAll() throws SQLException;
    int delete (Sader sader) throws SQLException;
    // Sader findByTitle(String title) throws SQLException;
    Sader findById(Long id) throws SQLException;
    // List<Sader> findByDate(Date created) throws SQLException;
    // List<Sader> findByIsActive(boolean isActive) throws SQLException;
    // List<Product> findByIsActive(boolean isDel) throws SQLException;

}


