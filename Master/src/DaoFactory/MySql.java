package src.DaoFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import src.dao.concrete.ProductDaoMySQL;
import src.dao.interfaces.ProductDao;



public class MySql extends daoFactory {
    private static String url = "jdbc:postgresql://localhost:5432/";
	private static String database = "postgres";
	private static String driver = "src.postgresql.jdbc.Driver";
	private static String user = "postgres";
	private static String password = "postgres";

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
	 public static void main(String[] args) {
	}
}
