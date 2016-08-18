package com.bjrcic.servlettest;

public class UsbEntity implements USBInterface {
  
	public void read()
	{
		System.out.println("usbread");
	}
	public void write()
	{
		System.out.println("usbwrite");
	}
}
