package com.bjcric.AOP;

public class Tester {
		
	public static void main(String[] args)
	{
		
//		UserDaoImpl dao = new UserDaoImpl();
//		dao.delete("amaker");
	   UserDao dao= (UserDao)new DynamicLogProxy().bind(new UserDaoImpl());
	   dao.delete("sss");
	}
}
