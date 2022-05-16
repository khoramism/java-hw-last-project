package dao.concrete;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

// Locals
import dao.interfaces.ProductDao;
import models.Product;
import src.DaoFactory.daoFactory;
import dao.interfaces.ProductDao;


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
	FIND_BY_DATE = "SELECT * FROM products WHERE created = ?";
	private static final String
	FIND_BY_ISACTIVE = "SELECT * FROM products WHERE isActive = ?";
	private static final String
	DELETE = "DELETE FROM products where id = ?";
	
	private static final String 
	DELETE_ALL = "DELETE FROM products";

	/**
	 * Method to insert a product in the database
	 * @param product the product that will be inserted
	 * @return product the inserted
	 * @throws SQLException
	 */
	public Product insert(Product product) throws SQLException {
		Connection c = daoFactory.getDatabase().openConnection();
		
		PreparedStatement pstmt = c.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

		pstmt.setString(1, 	product.getTitle());
		pstmt.setString(2, product.getDescription());
		pstmt.setInt(3, product.getPrice());
		pstmt.setBoolean(4, product.getIsActive());
		pstmt.setDate(5, (Date) product.getCreated());
		pstmt.setDate(6, (Date) product.getUpdated());
		pstmt.setDate(7, (Date) product.getDeleted());
		pstmt.setString(8, 	product.getCreatedBy());
		pstmt.setString(9, product.getUpdatedBy());
		pstmt.setString(8, 	product.getDeletedBy());




		pstmt.executeUpdate();

		ResultSet rset = pstmt.getGeneratedKeys();

		rset.next();
		Long idGenerated = rset.getLong(1);
		product.setId(idGenerated);

		pstmt.close();
		c.close();
		
		return product;
	}

	/**
	 * Method to retrieve all products from the database
	 * @return products all products in the database
	 * @throws SQLException
	 */
	public List<Product> all() throws SQLException {
		ArrayList<Product> products = new ArrayList<Product>();

		Connection c = daoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(ALL);

		ResultSet rset = pstmt.executeQuery();
		while (rset.next()){
			products.add(createProduct(rset));
		}

		pstmt.close();
		c.close();

		return products;
	}

	/**
	 * Method to delete all products in the database
	 * @return rowsAffected the numbers of rows Affected
	 * @throws SQLException
	 */
	public int deleteAll() throws SQLException {
		Connection c = daoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(DELETE_ALL);

		int rowsAffected = pstmt.executeUpdate();

		pstmt.close();
		c.close();

		return rowsAffected;
	}
	/**
	 * Method to delete all products in the database
	 * @return rowsAffected the numbers of rows Affected
	 * @throws SQLException
	 */
	public int delete(Product product) throws SQLException {
		Connection c = daoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(DELETE);
		pstmt.setLong(1, product.getId());

		int rowsAffected = pstmt.executeUpdate();

		pstmt.close();
		c.close();

		return rowsAffected;
	}

	/**
	 * Method to find a prodcut by title
	 * @return product Product find by the title, otherwise null
	 * @throws SQLException
	 */
	public Product findByTitle(String title) throws SQLException {
		Connection c = daoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_TITLE);
		pstmt.setString(1, title);

		Product product = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			product = createProduct(rset);
		}

		pstmt.close();
		c.close();

		return product;
	}

	/**
	 * Method to find a prodcut by id
	 * @return product Product find by the id, otherwise null
	 * @throws SQLException
	 */
	public Product findById(Long id) throws SQLException {
		Connection c = daoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_ID);
		pstmt.setLong(1, id);

		Product product = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			product = createProduct(rset);
		}

		pstmt.close();
		c.close();

		return product;
	}
	public Product findByDescription(String description) throws SQLException {
		Connection c = daoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_DESCRIPTION);
		pstmt.setString(1, description);

		Product product = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			product = createProduct(rset);
		}

		pstmt.close();
		c.close();

		return product;
	}
	public List<Product> findByDate(java.util.Date created) throws SQLException {
		ArrayList<Product> products = new ArrayList<Product>();
		Connection c = daoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_DATE);
		pstmt.setDate(1, (Date) created);

		Product product = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			products.add(createProduct(rset));
		}

		pstmt.close();
		c.close();

		return products;
	}
	public List<Product> findByIsActive(boolean isActive) throws SQLException {
		ArrayList<Product> products = new ArrayList<Product>();
		Connection c = daoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_ISACTIVE);
		pstmt.setBoolean(1,isActive );

		Product product = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			products.add(createProduct(rset));
		}

		pstmt.close();
		c.close();

		return products;
	}


	/* method to create products **/
	private Product createProduct(ResultSet rset) throws SQLException{
		Product product = new Product(
				rset.getString("title")
				,rset.getString("description")
				,rset.getInt("price")
				,rset.getBoolean("isActive")
				,rset.getDate("created")
				,rset.getDate("updated")
				,rset.getDate("deleted")
				,rset.getString("createdBy")
				,rset.getString("updatedBy")
				,rset.getString("deletedBy"));

		product.setId(rset.getLong("id"));

		return product;
	}
}
