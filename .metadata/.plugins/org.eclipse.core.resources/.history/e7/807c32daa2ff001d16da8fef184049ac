package com.psl.training.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;



@Aspect
public class LoggingAspect{  //External service class
	
	//Pointcut is an expression which tells which business method require this advice
	
	@Before("execution(* com.psl.training.service.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) { //advice-methods of external service class
		System.out.println("This method is invoked before calling or invoking the multiply method");
	}
	
	@After("execution(* com.psl.training.service.ProductServiceImpl.add(..))")
	public void logAftet(JoinPoint joinPoint) {
		System.out.println("This advice invokes after the multiply method invoked");
	}
	
}