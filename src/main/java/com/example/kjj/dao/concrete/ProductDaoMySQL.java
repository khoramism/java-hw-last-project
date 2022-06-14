package com.example.kjj.dao.concrete;

import com.example.kjj.DaoFactory.daoFactory;
import com.example.kjj.dao.interfaces.ProductDao;
import com.example.kjj.models.Product;
import com.example.kjj.models.Sader;
import com.example.kjj.models.User;
import com.example.kjj.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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

public class ProductDaoMySQL {
	Session ss = null;
	Transaction tx = null;
	/**
	 * Method to insert a product in the database
	 * @param product the product that will be inserted
	 * @return product the inserted
	 * @throws SQLException
	 */
	public Product insert(Product product) throws SQLException {
		ss = HibernateUtil.getSessionFactory().openSession();
		tx = ss.beginTransaction();
		ss.save(product);
		tx.commit();
		return product;
	}


	public Product update(Product object) throws SQLException {
		ss = HibernateUtil.getSessionFactory().openSession();
		tx = ss.beginTransaction();
		ss.update(object);
		tx.commit();
		return object;
	}


	/**
	 * Method to retrieve all products from the database
	 * @return products all products in the database
	 */
	public List<Product> all() throws SQLException {
		ss = HibernateUtil.getSessionFactory().openSession();
		tx = ss.beginTransaction();
		Query q = ss.createQuery("From Product");
		List<Product> sl = q.list();
		ss.getTransaction().commit();
		return sl;
	}

//	/**
//	 * Method to delete all products in the database
//	 * @return rowsAffected the numbers of rows Affected
//	 * @throws SQLException
//	 */
//	public int deleteAll() throws SQLException {
//		Connection c = daoFactory.getDatabase().openConnection();
//		PreparedStatement pstmt = c.prepareStatement(DELETE_ALL);
//
//		int rowsAffected = pstmt.executeUpdate();
//
//		pstmt.close();
//		c.close();
//
//		return rowsAffected;
//	}
	/**
	 * Method to delete all products in the database
	 * @return rowsAffected the numbers of rows Affected
	 * @throws SQLException
	 */
	public void delete(Product product) throws SQLException {
		ss = HibernateUtil.getSessionFactory().openSession();
		tx = ss.beginTransaction();
		ss.delete(product);
		tx.commit();
	}

//	/**
//	 * Method to find a prodcut by title
//	 * @return product Product find by the title, otherwise null
//	 * @throws SQLException
//	 */
//	public Product findByTitle(String title) throws SQLException {
//		Connection c = daoFactory.getDatabase().openConnection();
//
//		PreparedStatement pstmt = c.prepareStatement(FIND_BY_TITLE);
//		pstmt.setString(1, title);
//
//		Product product = null;
//		ResultSet rset = pstmt.executeQuery();
//
//		while (rset.next()){
//			product = createProduct(rset);
//		}
//
//		pstmt.close();
//		c.close();
//
//		return product;
//	}
//
//	/**
//	 * Method to find a prodcut by id
//	 * @return product Product find by the id, otherwise null
//	 * @throws SQLException
//	 */
//	public Product findById(Long id) throws SQLException {
//		Connection c = daoFactory.getDatabase().openConnection();
//
//		PreparedStatement pstmt = c.prepareStatement(FIND_BY_ID);
//		pstmt.setLong(1, id);
//
//		Product product = null;
//		ResultSet rset = pstmt.executeQuery();
//
//		while (rset.next()){
//			product = createProduct(rset);
//		}
//
//		pstmt.close();
//		c.close();
//
//		return product;
//	}
//	public Product findByDescription(String description) throws SQLException {
//		Connection c = daoFactory.getDatabase().openConnection();
//
//		PreparedStatement pstmt = c.prepareStatement(FIND_BY_DESCRIPTION);
//		pstmt.setString(1, description);
//
//		Product product = null;
//		ResultSet rset = pstmt.executeQuery();
//
//		while (rset.next()){
//			product = createProduct(rset);
//		}
//
//		pstmt.close();
//		c.close();
//
//		return product;
//	}
//	public List<Product> findByDate(java.util.Date created) throws SQLException {
//		ArrayList<Product> products = new ArrayList<Product>();
//		Connection c = daoFactory.getDatabase().openConnection();
//
//		PreparedStatement pstmt = c.prepareStatement(FIND_BY_DATE);
//		pstmt.setDate(1, (Date) created);
//
//		Product product = null;
//		ResultSet rset = pstmt.executeQuery();
//
//		while (rset.next()){
//			products.add(createProduct(rset));
//		}
//
//		pstmt.close();
//		c.close();
//
//		return products;
//	}
//	public List<Product> findByIsActive(boolean isActive) throws SQLException {
//		ArrayList<Product> products = new ArrayList<Product>();
//		Connection c = daoFactory.getDatabase().openConnection();
//
//		PreparedStatement pstmt = c.prepareStatement(FIND_BY_ISACTIVE);
//		pstmt.setBoolean(1,isActive );
//
//		Product product = null;
//		ResultSet rset = pstmt.executeQuery();
//
//		while (rset.next()){
//			products.add(createProduct(rset));
//		}
//
//		pstmt.close();
//		c.close();
//
//		return products;
//	}
//
//
//	/* method to create products **/
//	private Product createProduct(ResultSet rset) throws SQLException{
//		Product product = new Product(
//				rset.getString("title")
//				,rset.getString("description")
//				,rset.getInt("price")
//				,rset.getBoolean("isActive")
//				,rset.getString("createdBy")
//				,rset.getString("updatedBy")
//				,rset.getString("deletedBy")
//				,rset.getBoolean("isAllowed"));
//
//		product.setId(rset.getLong("id"));
//
//		return product;
//	}

	public List<Product> find(Product product) throws SQLException {
		ss = HibernateUtil.getSessionFactory().openSession();
		tx = ss.beginTransaction();
		Query q = ss.createQuery("From User");
		List<Product> all = q.list();
		all = all.stream().filter(s->
				(( product.getId() == null || product.getId().equals(s.getId()))
					&& (product.getTitle() == null || product.getTitle().equals(s.getTitle()))
					&& ( product.getDescription() == null || product.getDescription().equals(s.getDescription()))
					&& (product.getIsAllowed() == null || product.getIsAllowed().equals(s.getIsAllowed()))
					&& ( product.getPrice() == null || product.getPrice().equals(s.getPrice()))
					&& ( product.getStatus() == null || product.getStatus().equals(s.getStatus())))
		).collect(Collectors.toList());
		tx.commit();
		return all;
	}
}
