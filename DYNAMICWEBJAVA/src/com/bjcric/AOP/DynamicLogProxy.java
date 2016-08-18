package com.bjcric.AOP;

import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DynamicLogProxy implements InvocationHandler {
	Object delegate;
	Logger logger = Logger.getLogger(this.getClass().getName());
	public Object bind(Object delegate)
	{
	 this.delegate = delegate;
//	 类加载器
	 Class cls = delegate.getClass();
	 //第一个参数 累加载器 ；第二个参数 所有实现的接口 ；最后一个参数：动态代理自己
	 return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces() , this);
	}
	public Object invoke(Object proxy,Method method,Object[] args)throws Throwable
	{
		logger.log(Level.INFO, "before2 delete");
		//被代理对象 方法参数
		System.out.println(args[0]);
		Object retValue = method.invoke(delegate, args);
		logger.log(Level.INFO, "after2 delete");
		return retValue;
	}
	
}
