package com.bjrcic.test2;

import java.sql.Connection;

public class UserDaoImpl implements UserDAO{
	private ConnectionUtil util;
	
	private String name;
	public  UserDaoImpl()
	{
		//类的默认的构造方法
	}
	public  UserDaoImpl(String name1)
	{
		this.name = name1;
	}
	public static  UserDaoImpl create()
	{
		//自定义工厂方法
		return new UserDaoImpl();
	}
	 public void register(User u)
	 {
		 Connection conn = util.getConnection();
		 System.out.println(conn);
		 System.out.println("register ok.....");
	 }

	public ConnectionUtil getUtil() {
		return util;
	}
		//加set方法依赖注入
	public void setUtil(ConnectionUtil util) {
		this.util = util;
	}
}
