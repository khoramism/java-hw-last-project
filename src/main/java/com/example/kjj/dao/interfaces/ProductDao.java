package com.example.kjj.dao.interfaces;

import com.example.kjj.models.Product;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;



public interface ProductDao {
	Product insert(Product object) throws SQLException;
	List<Product> all() throws SQLException;
	int deleteAll() throws SQLException;
	int delete (Product product) throws SQLException;
	Product findByTitle(String title) throws SQLException;
	Product findById(Long id) throws SQLException;
	Product findByDescription(String description) throws SQLException;
	List<Product> findByDate(Date created) throws SQLException;
	List<Product> findByIsActive(boolean isActive) throws SQLException;
	// List<Product> findByIsActive(boolean isDel) throws SQLException;

}

