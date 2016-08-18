package com.bjcric.AOPAPI;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.aop.ThrowsAdvice;
public class ThrowAdvice implements ThrowsAdvice{
//删除的时候遇到空指针异常 acgi 事务处理 权限认证 日志记录 
	//throwadvice 会在目标对象的方法抛出异常时被调用
//需要实现的接口 是 ThrowsAdvice 该接口是一个标识接口 没有定义任何方法 可以定义一个方法名称为afterThrowing的方法
//只要符合如下格式
//afterThrowing([Method],[args],[target],subclassOfThrowable)
//[]中的参数可以省略  subclassOfThrowable必须是Throwable的子类
//列如afterThrowing(Method,args,target,subclassOfThrowable)；
//列如afterThrowing(subclassOfThrowable)；

	
	
	Logger logger = Logger.getLogger(this.getClass().getName());
	
	public void afterThrowing(Method m,Object[] args,Object targe,Throwable t)
	{
		
	}




}
