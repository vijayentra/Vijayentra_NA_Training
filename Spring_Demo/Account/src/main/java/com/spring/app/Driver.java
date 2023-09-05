package com.spring.app;


 import com.spring.app.Account;
 import org.springframework.context.ApplicationContext;
 import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	
	public static Account loadAccount()
	{
		//fill the code
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		return context.getBean("acc",Account.class);
	}

	public static void main(String[] args) 
	{
		//fill the code
		Account a = loadAccount();
		System.out.println("Account number:"+a.getAccNumber());
		System.out.println("Account holder name:"+a.getAccHolderName());
		System.out.println("Balance:"+a.getAccBalance());
		System.out.println("Loan type:"+a.getLoanInfo().getLoanType());
		System.out.println("Loan amount:"+a.getLoanInfo().getLoanAmount());
	}	 	  	    	    		        	 	

}
