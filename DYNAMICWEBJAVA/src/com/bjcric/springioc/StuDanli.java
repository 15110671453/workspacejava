package com.bjcric.springioc;

public class StuDanli {
  //单例的特征 构造方法必须是私有的
	private String name;
	private static StuDanli instance = new StuDanli();
	//静态属性是为所有类的实例对象所共享的
	public static StuDanli getInstance()
	{
		return instance;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public static void main(String[] args)
	{
		StuDanli s = StuDanli.getInstance();
		StuDanli s2 = StuDanli.getInstance();
		System.out.print( s == s2);
	}
	
	
}
