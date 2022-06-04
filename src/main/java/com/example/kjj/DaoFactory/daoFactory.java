package com.example.kjj.DaoFactory;

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
  
  	public static MySql getDatabase() {
	  return new MySql();
	}
}