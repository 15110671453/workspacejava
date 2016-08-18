package com.bjrcic.test2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MyTest {
	
	public static void main(String[] args){
		  Resource r = new ClassPathResource("beans.xml");
		  BeanFactory factory = new XmlBeanFactory(r);
		  
		  //gebean 调用java类的实例 会默认调用该类的默认的构造方法
		  UserDaoImpl dao = (UserDaoImpl)factory.getBean("userDao");
		  dao.register(new User());
		  
		  
//		  ConnectionUtil conn = (ConnectionUtil)factory.getBean("conn");
		   
		  
//		  Computer c = (Computer) factory.getBean("computer");
//		 
//		  c.testjiekou();
		 
		  
//		  HelloBean h =(HelloBean) factory.getBean("HelloBean");
//		  System.out.println(h.helloBean());
		  
		  
		
	    }	
}

