package src.dao.concrete;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Locals
import src.models.Product;
import src.DaoFactory.daoFactory;
import src.dao.interfaces.ProductDao;


/*
        String title,
        String description ,
        Integer price,
        Boolean isActive,
        Date created,
        Date updated,
        Date deleted,
        String createdBy,
        String updatedBy,
        String deletedBy,
*/

public class ProductDaoMySQL implements ProductDao {
	private static final String 
	INSERT = "INSERT INTO products (title, description, price, isActive, created, updated, deleted, createdBy, updatedBy, deletedBy) VALUES (?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?)";
	private static final String
	ALL = "SELECT * FROM products";

	private static final String 
	FIND_BY_TITLE = "SELECT * FROM products WHERE title = ?";
	
	private static final String
	FIND_BY_ID = "SELECT * FROM products WHERE id = ?";

	private static final String
	FIND_BY_DESCRIPTION = "SELECT * FROM products WHERE description = ?";
	
	
	private static final String 
	DELETE = "DELETE FROM products where id = ?";
	
	private static final String 
	DELETE_ALL = "DELETE FROM products";
	
	
	public Product insert(Product product) throws SQLException {
		Connection c = daoFactory.getDatabase().openConnection();
		
		PreparedStatement pstmt = c.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

		pstmt.setString(1, 	product.getTitle());
		pstmt.setString(2, product.getDescription());

		pstmt.setString(1, 	product.getPrice());
		pstmt.setString(2, product.getIsActive());
		
		pstmt.setString(1, 	product.getTitle());
		pstmt.setString(2, product.getDescription());
		
		pstmt.setString(1, 	product.getTitle());
		pstmt.setString(2, product.getDescription());




		pstmt.executeUpdate();

		ResultSet rset = pstmt.getGeneratedKeys();

		rset.next();
		Long idGenerated = rset.getLong(1);
		user.setId(idGenerated);

		pstmt.close();
		c.close();
		
		return user;
	}
}
