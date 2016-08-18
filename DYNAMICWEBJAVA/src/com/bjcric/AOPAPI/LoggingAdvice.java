package com.bjcric.AOPAPI;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class LoggingAdvice  implements MethodBeforeAdvice{

	     ProxyFactory factory;
		Logger logger = Logger.getLogger(this.getClass().getName());
		public void before(Method m,Object[] arg,Object obj)throws Throwable
		{
			System.out.println(m.getName());
			if(arg.length>0)
			{
				System.out.println(arg[0]);
				System.out.println(obj.getClass());
				logger.log(Level.INFO, "advice delete");
			}
		}
}
