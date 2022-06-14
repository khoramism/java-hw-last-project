package com.example.kjj.dao.interfaces;

import com.example.kjj.models.Sader;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public interface SaderDao {
    Sader update(Sader object) throws SQLException;
    Sader insert(Sader object) throws SQLException;
    List<Sader> all() throws SQLException;
    int deleteAll() throws SQLException;
    int delete (Sader sader) throws SQLException;
    // Sader findByTitle(String title) throws SQLException;
    List<Sader> find(Sader sader) throws SQLException;
    // List<Sader> findByDate(Date created) throws SQLException;
    // List<Sader> findByIsActive(boolean isActive) throws SQLException;
    // List<Product> findByIsActive(boolean isDel) throws SQLException;

}


