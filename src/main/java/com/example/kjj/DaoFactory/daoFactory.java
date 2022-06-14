package com.example.kjj.DaoFactory;

import com.example.kjj.dao.interfaces.ProductDao;

import java.sql.Connection;


public abstract class daoFactory {

  /* 
   * There will be a method for each DAO that can be
   * created. The concrete factories will have to
   * implement these methods.
   */
  public abstract Connection openConnection();	
  public abstract ProductDao getProductDao();
  
  	public static MySql getDatabase() {
	  return new MySql();
	}
}