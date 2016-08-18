package com.bjcric.AOPAPI;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDaoImpl  implements UserDao{
	//得到当前类的日志
   Logger logger= Logger.getLogger(this.getClass().getName());
   public void delete(String name)
   {
//	   String str = null;
//		str.length();
//		空指针异常
	   logger.log(Level.INFO ,"before delete");
	   System.out.println("删除成功!");
	   logger.log(Level.INFO ,"after delete");
	   
	   
   }
}
