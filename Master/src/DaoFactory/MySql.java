package src.DaoFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import src.dao.concrete.ProductDaoMySQL;
import src.dao.interfaces.ProductDao;



public class MySql extends daoFactory {
    private static String url = "jdbc:mysql://127.0.0.1:3306/";
	private static String database = "minoofam";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String user = "root";
	private static String password = "mysql";

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
    @Override
	public ProductDao getProductDao() {
		return new ProductDaoMySQL();
	}
}
