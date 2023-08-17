package com.test;

import com.model.ElectorDetails;
import com.exception.InvalidElectorException;
import com.util.ElectionCommission;
import java.util.Date;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;

public class ElectionCommissionTest {
	
	private static ElectionCommission bObj;
	
	@BeforeAll
	public static void setUp() throws Exception {
		
		bObj = new ElectionCommission();
		List<ElectorDetails> list = new ArrayList<>();
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = d.parse("10/06/2000");
		Date d2 = d.parse("23/09/1993");
		Date d3 = d.parse("19/11/2001");
		Date d4 = d.parse("09/09/2001");
		Date d5 = d.parse("08/06/2000");
		//Create few  objects for ElectorDetails class and add to a list.
		//Set that list to the electorDetailsList using the setElectorList method in ElectionCommission
		list.add(new ElectorDetails("VIJ/8989897","vijay",d1,"karthi",23,"Male","Karur"));
		list.add(new ElectorDetails("SUR/7659021","surya",d2,"senthil",27,"Male","Chennai"));
		list.add(new ElectorDetails("MAD/7689002","madhu",d3,"raj",22,"Female","Trichy"));
		list.add(new ElectorDetails("DIV/7689002","divya",d4,"raja",22,"Female","Salem"));
		list.add(new ElectorDetails("AJA/8989897","ajay",d5,"mohan",23,"Male","Karur"));
		bObj.setElectorList(list);
	}	 
	//Test the validateElectorId method when the ElectorId is Valid
	@Test
	public void test11ValidateElectorIdWhenValid() throws InvalidElectorException{
		
		//Fill the code
		assertTrue(bObj.validateElectorId("VIJ/8989897"));
	}
	
	//Test the validateElectorId method when the ElectorId is Invalid
	@Test
	public void test12ValidateElectorIdWhenInvalid() throws InvalidElectorException{
		
	    //Fill the code
		assertThrows(InvalidElectorException.class,()->bObj.validateElectorId("VI/1234567"));
	}
	
	//Test the viewElectorDetailsByElectorId method when the ElectorId is valid
	@Test
	public void test13ViewElectorDetailsByElectorIdWhenValid() throws InvalidElectorException{
        
        //Fill the code
		ElectorDetails d1 = bObj.viewElectorDetailsByElectorId("VIJ/8989897");
		assertEquals("VIJ/8989897",d1.getElectorId());
	}

	//Test the viewElectorDetailsByElectorId method when the ElectorId is Invalid
	@Test
	public void test14ViewElectorDetailsByElectorIdWhenInvalid() throws InvalidElectorException{
		 
		 //Fill the code
		assertThrows(InvalidElectorException.class,()->bObj.viewElectorDetailsByElectorId("VI/1234567"));
	}

	//Test the viewElectorsByGender method
	@Test
	public void test15ViewElectorsByGender() throws InvalidElectorException{
	    
	    //Fill the code
		List<ElectorDetails> l1 = bObj.viewElectorsByGender("Male");
		assertEquals(3,l1.size());
	}
	 
	//Test the viewElectorsByAddressWise method
	@Test
	public void test16ViewElectorsByAddressWise() throws InvalidElectorException{
	    
	    //Fill the code
		Map<String,List<ElectorDetails>> m = bObj.viewElectorsByAddressWise();
		assertEquals(2,m.get("Karur").size());
	}
	 
	//Test the countTotalElectorsForEachAgeGroup method
	@Test
	public void test17CountTotalElectorsForEachAgeGroup() throws InvalidElectorException{
		
		//Fill the code
		Map<Integer,Integer> m = bObj.countTotalElectorsForEachAgeGroup();
		assertEquals(2,m.get(23));
	}
	 
	//Test the countElectorsByDateOfBirth method
	@Test
	public void test18CountElectorsByDateOfBirth() throws InvalidElectorException,ParseException{
			
			//Fill the code
		assertEquals(1,bObj.countElectorsByDateOfBirth("19/11/2001"));
	}
	 
	//Test the viewElectorsByGender method for an Empty list
	@Test
	public void test19ViewElectorsByGenderForEmptyList() throws InvalidElectorException{
			
			//Fill the code
		ElectionCommission ob = new ElectionCommission();
		assertThrows(InvalidElectorException.class,()->ob.viewElectorsByGender("Male"));
		
	}	 	  	  	 		     	   	      	 	
	 
	//Test the viewElectorsByAddressWise method for an Empty list	
	@Test
	public void test20ViewElectorsByAddressWiseForEmptyList() throws InvalidElectorException{
	   
	    //Fill the code
		ElectionCommission ob = new ElectionCommission();
		assertThrows(InvalidElectorException.class,()->ob.viewElectorsByAddressWise());
	}
	 
	//Test the countTotalElectorsForEachAgeGroup method for an Empty list
	@Test
	public void test21CountTotalElectorsForEachAgeGroupForEmptyList() throws InvalidElectorException{
	        
	    //Fill the code
		ElectionCommission ob = new ElectionCommission();
		assertThrows(InvalidElectorException.class,()->ob.countTotalElectorsForEachAgeGroup());
	}
	 
	//Test the countElectorsByDateOfBirth method for an Empty list
	@Test
	public void test22CountElectorsByDateOfBirthForEmptyList() throws InvalidElectorException{
			
		//Fill the code
		ElectionCommission ob = new ElectionCommission();
		assertThrows(InvalidElectorException.class,()->ob.countElectorsByDateOfBirth("19/11/2001"));
	}	
	 
}
	 	  	  	 		     	   	      	 	
