package q3.solution;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("q3.xml");
		BankAccountController bank = context.getBean("bank",BankAccountController.class);
		
		
		System.out.println("new balance:"+bank.deposit(101, 1000));
		System.out.println("balance:"+bank.getBalance(101));
		if(bank.fundTransfer(101, 102, 1000)) {
			System.out.println("successfully transfered");
		}
		else System.out.println("transfer failed");
	}

}
