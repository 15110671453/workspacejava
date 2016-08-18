package com.bjcric.AOPAPI;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class LoggingAdviceAfter  implements AfterReturningAdvice{

	  ProxyFactory factory;
		Logger logger = Logger.getLogger(this.getClass().getName());
		
		public void afterReturning(Object rv ,Method m,Object[] arg, Object target)throws Throwable
		{
			System.out.println(m.getName());
			if(arg.length>0)
			{
				System.out.println(arg[0]);
				System.out.println(target.getClass());
				logger.log(Level.INFO, "advice after");
			}
		}
}