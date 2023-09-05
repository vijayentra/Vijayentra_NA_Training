package com.spring.app;


import org.apache.log4j.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankAspect {
	final static Logger logger = Logger.getLogger("BankAspect.class");
	
	@Around("execution(* com.spring.app.Bank.withDraw(..))")
	public Object logTransactionStatus(ProceedingJoinPoint pjp) throws Throwable {
		
		//implement the required cross cutting concern
		 String currentDate = java.time.LocalDate.now().toString();
	        logger.info(currentDate);
	        logger.info("Before Method Called");
	        Object result=null;
	        try {
	            result = pjp.proceed(); // Proceed with the original method execution
	        } catch (Throwable throwable) {
	            logger.info("status false");
	        }

	        logger.info("status true");
	        return result;
	     	
}

	
}