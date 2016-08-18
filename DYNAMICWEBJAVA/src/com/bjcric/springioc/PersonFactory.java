package com.bjcric.springioc;

public class PersonFactory {
  
	//这里不能用static修饰符 
	public Person create()
	{
	  return new Person();	
	}
}
