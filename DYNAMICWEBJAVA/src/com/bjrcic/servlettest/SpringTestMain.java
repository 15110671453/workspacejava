package com.bjrcic.servlettest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringTestMain {
	//出了导入spring的jar包 还需要导入common－logging包
	public static void main(String[] args){
		  Resource r = new ClassPathResource("beans.xml");
		  BeanFactory factory = new XmlBeanFactory(r);
		  
		 
		  
//		  Computer c = (Computer) factory.getBean("computer");
//		 
//		  c.testjiekou();
		 
		  
//		  HelloBean h =(HelloBean) factory.getBean("HelloBean");
//		  System.out.println(h.helloBean());
		  
		  
		
	    }	
}
