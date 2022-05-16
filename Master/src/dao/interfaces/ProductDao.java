package dao.interfaces;

import java.sql.SQLException; 

import java.util.List;
import java.util.Date;
import models.Product;



public interface ProductDao {
	Product insert(Product object) throws SQLException;
	List<Product> all() throws SQLException;
	int deleteall() throws SQLException;
	int delete (Product product) throws SQLException;
	Product findByTitle(String title) throws SQLException;
	Product findById(Long id) throws SQLException;
	Product findByDescription(String description) throws SQLException;
	List<Product> findByDate(Date created) throws SQLException;
	List<Product> findByIsActive(boolean isActive) throws SQLException;
	
}

