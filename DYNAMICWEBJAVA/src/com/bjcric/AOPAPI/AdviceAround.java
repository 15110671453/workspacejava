package com.bjcric.AOPAPI;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;

public class AdviceAround implements MethodInterceptor {
	
	 ProxyFactory factory;
	Logger logger = Logger.getLogger(this.getClass().getName());
    public Object invoke(MethodInvocation mi) throws Throwable {  
        // TODO Auto-generated method stub 
    	  
    	Method m = mi.getMethod();
    	System.out.println(m.getName());
    	System.out.println(	mi.getArguments()[0].toString());
    	  logger.log(Level.INFO, "around before---");
    	  logger.log(Level.INFO, "around after-----");
         return null;
    }  
}
