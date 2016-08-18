package com.bjrcic.servlettest;

public class MoveDisk  implements USBInterface{

	public void read()
	{
		System.out.println("移动硬盘read");
	}
	public void write()
	{
		System.out.println("移动硬盘write");
	}
	
}
