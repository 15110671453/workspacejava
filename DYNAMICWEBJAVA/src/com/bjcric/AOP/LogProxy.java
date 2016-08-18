package com.bjcric.AOP;

import java.util.logging.Level;
import java.util.logging.Logger;
 
public class LogProxy implements UserDao{
  private UserDaoImpl dao;
  Logger logger = Logger.getLogger(this.getClass().getName());
  
   LogProxy(UserDaoImpl dao)
   {
	   this.dao = dao;
   }
   
   public void delete(String name)
   {
	   logger.log(Level.INFO,"before delete");
	   dao.delete("test2");
	   logger.log(Level.INFO,"after delete");
   }
  
}
