package com.example.springdoc.aop;

//import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	@Pointcut("execution(public String com.example.model.*.bikeColor())")
	private void getLogs() {
		
	}
	
	@Before("getLogs()")
	private void printLogs(JoinPoint jp)
	{
		System.out.println("Printed in AOP--");
		System.out.println("Printing MethodName-> "+jp.getSignature().toShortString());
		System.out.println("Printing args-> "+jp.getArgs());
	}
	
	@After("getLogs()")
	private void printLogsAfter(JoinPoint jp)
	{
		System.out.println("Printed in AOP--");
		System.out.println("Printing MethodName-> "+jp.getSignature().toShortString());
		System.out.println("Printing args-> "+jp.getArgs());
	}

}
