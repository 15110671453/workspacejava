package com.bjcric.AOP;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDaoImpl  implements UserDao{
	//得到当前类的日志
   Logger logger= Logger.getLogger(this.getClass().getName());
   public void delete(String name)
   {
	   logger.log(Level.INFO ,"before delete");
	   System.out.println("删除成功!");
	   logger.log(Level.INFO ,"after delete");
	   
   }
}
