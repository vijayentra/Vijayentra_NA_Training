package q1.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import q1.solution.Address;
public class AddressTest {
	private Address d = new Address();
	
	@Before
	public void setUp() {
		d.setStreet("new street");
		d.setCity("mumbai");
		d.setState("Maharastra");
		d.setZip(400001);
		d.setCountry("India");
	}
	
	@Test
	public void StreetTest() {
		assertEquals("new street",d.getStreet());
	}
	
	@Test
	public void CityTest() {
		assertEquals("mumbai",d.getCity());
	}
	@Test
	public void StateTest() {
		assertEquals("Maharastra",d.getState());
	}
	
	@Test
	public void ZipTest() {
		assertEquals(400001,d.getZip());
	}
	
	@Test
	public void CountryTest() {
		assertEquals("India",d.getCountry());
	}
}
