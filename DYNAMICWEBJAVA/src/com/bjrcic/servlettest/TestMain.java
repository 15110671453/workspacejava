package com.bjrcic.servlettest;

import java.io.IOException;
import java.util.Properties;
public class TestMain {
	
    public static void main(String[] args)
    {
    	//http://repo.spring.io/release/org/springframework/spring/4.3.1.RELEASE/
    	//容器是装载对象 实例化对象 配置对象之间的依赖关系
    	//IOC与DI IOC指的是程序之间的依赖关系由依赖具体实现
    	//USB类与USB接口 计算机 computer 依赖抽象非具体
    	//DI指程序之间的依赖关系由容器动态注入非硬编码实现
    	//（spring中的javabean之间的依赖就是依赖 配置文件beans 建立依赖关系）
    	//spring IOC容器 控制反转容器 容器是装载对象 实例化对象 配置对象之间的依赖关系
    	//spring最出色在AOP上 对AOP编程技术的实现 提供了三种方式
    	//Spring提供对持久层的支持 有对JDBC的封装支持 有Hibernate的封装
    	//Spring对web层的支持 spring本身有自己的MVC  流行的是SSH spring structs hibernate
    	//RMI远程方法调用 webservice EJB JMS java消息服务 javamail 定时任务和调度
    	//这里在同一个包下的class都可以直接引用到文件  无需import
    	
    				HelloBean bean = new HelloBean();
    				String name="";
    				//从配置文件中读取变量
    				Properties prop = new Properties();
    				try
    				{
    				prop.load(TestMain.class.getClassLoader().getResourceAsStream("name.properties"));
    				name = prop.getProperty("name");//对应key传入
    				}catch(IOException ex)
    				{
    					ex.printStackTrace();
    				}
    				bean.setNameTest(name);
    				System.out.println(bean.helloBean());
    }
}
//beans.xml要放在src同级目录
/*
 * 
 *
 *       Test t=new Test();  
        //文件名前不加“/”，则表示从当前类所在的包下查找该资源。如下则表示的是从包myspider下查找22.properties文件资源。  
        System.out.println("1："+t.getClass().getResourceAsStream("22.properties"));//输出java.io.BufferedInputStream@61de33  
  
        //文件名前加了“/”，则表示从类路径下也就是从classes文件夹下查找资源，如下表示从classes文件夹下查找22.properties文件资源。  
        System.out.println("2："+t.getClass().getResourceAsStream("/22.properties"));//输出null  
  
        //文件名前加了“/”，则表示从类路径下也就是从classes文件夹下查找资源，如下表示从classes文件夹下查找11.properties文件资源。  
        System.out.println("3："+t.getClass().getResourceAsStream("/11.properties"));//输出java.io.BufferedInputStream@14318bb  
        System.out.println();  
  
        //当前包路径4：file:/E:/myobject/myspider/build/classes/myspider/  
        System.out.println("4："+t.getClass().getResource(""));  
  
        //输出当前类路径5：file:/E:/myobject/myspider/build/classes/  
        System.out.println("5："+t.getClass().getResource("/"));  
  
        /* 
         * 如果类路径下的当前包有22.properties文件，则输出6：file:/E:/myobject/myspider/build/classes/myspider/22.properties 
         * 否者输出源文件下的22.properties文件的路径，则输出：6：file:/E:/myobject/myspider/src/myspider/22.properties 
         */  
       // System.out.println("6："+t.getClass().getResource("22.properties"));  
        /* 
         * 如果类路径下有11.properties文件，则输出7：file:/E:/myobject/myspider/build/classes/11.properties 
         * 否者输出源文件下的11.properties文件的路径，则输出：6：7：file:/E:/myobject/myspider/src/11.properties 
         */  
       // System.out.println("7："+t.getClass().getResource("/11.properties"));  
 
 




