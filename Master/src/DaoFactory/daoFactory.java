package src.DaoFactory;

import java.sql.Connection;

import src.dao.interfaces.ProductDao;


public abstract class daoFactory {

  /* 
   * There will be a method for each DAO that can be
   * created. The concrete factories will have to
   * implement these methods.
   */
  public abstract Connection openConnection();	
  public abstract ProductDao getProductDao();
  
  	public static daoFactory getDatabase() {
	  return new MySql();
	}
}