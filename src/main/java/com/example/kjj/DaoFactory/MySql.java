package com.example.kjj.DaoFactory;
import com.example.kjj.dao.concrete.ProductDaoMySQL;
import com.example.kjj.dao.interfaces.ProductDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class MySql {
    private static String url = "jdbc:postgresql://localhost:5432/";
	private static String database = "minoofam";
	private static String driver = "src.postgresql.jdbc.Driver";
	private static String user = "root";
	private static String password = "";

	public Connection openConnection() {
		try {
            // v9 ---> Class.forName(driver).newInstance();
            
			Class.forName(driver).getDeclaredConstructor().newInstance();
			Connection connection = DriverManager.getConnection(url + database, user, password);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception ex){
			System.err.println(
				"bebakhshid nemitonim be databse vasl beshim dost aziz, doset daram mehrabon :)");
		}
		return null;
	}
//    @Override
//	public ProductDao getProductDao() {
//		return new ProductDaoMySQL();
//	}
	 public static void main(String[] args) {
	}
}
