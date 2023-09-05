package q1.solution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("q1.xml");
		Customer c = context.getBean("cus",Customer.class);
		
		System.out.println("Customer Details:");
		System.out.println("id: "+c.getCustomerId());
		System.out.println("name: "+c.getCustomerName());
		System.out.println("contact: "+c.getCustomerContact());
		System.out.println("address : "+c.getCustomerAddress().getStreet()
				+", "+c.getCustomerAddress().getCity()
				+", "+c.getCustomerAddress().getState()
				+", "+c.getCustomerAddress().getZip()
				+", "+c.getCustomerAddress().getCountry());
		
	}

}
