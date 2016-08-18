package com.bjcric.AOPAPI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Tester {

	public static void main (String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beansapi.xml");
		UserDaoImpl dao = (UserDaoImpl) context.getBean("factory");
		dao.delete("APIAOP");
		
		
	}
	
}
