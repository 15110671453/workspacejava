package com.bjrcic.servlettest;

public class Computer {
  private USBInterface usbjiekou;
 
  public USBInterface getUsbjiekou()
  {
	  return usbjiekou;
  }
  public void setUsbjiekou(USBInterface usb2)
  {
	  this.usbjiekou=usb2;
  }
  public void testjiekou()
  {
	  usbjiekou.read();
	  usbjiekou.write();
  }
  
}
