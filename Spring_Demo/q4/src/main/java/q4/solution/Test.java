package q4.solution;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		BankAccountController bank = context.getBean(BankAccountController.class);
		
		bank.setUp();
		System.out.println("new balance:"+bank.deposit(101L, 1000));
		System.out.println("balance:"+bank.getBalance(101L));
		if(bank.fundTransfer(101L, 102L, 1000)) {
			System.out.println("successfully transfered");
		}
		else System.out.println("transfer failed");
	}

}
