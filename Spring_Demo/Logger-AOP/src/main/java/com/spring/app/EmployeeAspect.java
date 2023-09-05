package com.spring.app;




import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspect {
	

final static Logger logger =Logger.getLogger("EmployeeAspect.class");

	
	
@After("execution(* com.spring.app.Company.registerEmployee(..))")
public void logRegistrationStatus(){
	String currentDate = java.time.LocalDateTime.now().toString();
    logger.info(currentDate);
    logger.info("Registration Successful");
	}
//@AfterReturning(
//        pointcut = "execution(* com.spring.app.Company.registerEmployee(..))",
//        returning = "result"
//)
//public void logRegistrationStatus(boolean result) {
//    if (result) {
//        String currentDate = java.time.LocalDateTime.now().toString();
//        log.info(currentDate);
//        log.info("Registration Successful");
//    }
//}
	
		
}