package q1.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import q1.solution.Address;
import q1.solution.Customer;

public class CustomerTest {
	
	private Customer c = new Customer();
	private Address d = new Address();
	
	@Before
	public void setUp() {
		d.setStreet("new street");
		d.setCity("mumbai");
		d.setState("Maharastra");
		d.setZip(400001);
		d.setCountry("India");
		c.setCustomerId("111");
		c.setCustomerName("vijay");
		c.setCustomerContact(8989865361L);
		c.setCustomerAddress(d);
	}
	
	@Test
	public void Idtest() {
		assertEquals("111",c.getCustomerId());
	}
	@Test
	public void Nametest() {
		assertEquals("vijay",c.getCustomerName());
	}
	@Test
	public void Contacttest() {
		assertEquals(8989865361L,c.getCustomerContact());
	}
	@Test
	public void AddressStreettest() {
		Address add = c.getCustomerAddress();
		assertEquals("new street",add.getStreet());
	}
}
