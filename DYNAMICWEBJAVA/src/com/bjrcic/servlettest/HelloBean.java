

package com.bjrcic.servlettest;

public class HelloBean {
	
   private String nameTest ;
   public String getNameTest()
   {
	   return nameTest;
   }
//   public void setName(String name)
//   {
//	   this.name = name;
//   }
    public String helloBean()
    {
    	   return "hello"+nameTest;
    }
    
	public void setNameTest(String name2) {
		// TODO Auto-generated method stub
		this.nameTest = name2;
	}
	
}
