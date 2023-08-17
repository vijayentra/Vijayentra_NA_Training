package com.test;


import com.test.Main;
import com.model.FoodOrder;
import com.exception.InvalidFoodOrderException;
import com.util.FoodShop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;


public class FoodShopTest {
	
	private static FoodShop bObj;

	@BeforeAll
	public static void setUp() throws Exception {
		
		
		bObj = new FoodShop();
		//Create few  objects for FoodOrder class and add to a list.
		//Set that list to the foodOrderList using the setFoodOrderList method in FoodShop
		List<FoodOrder> list = new ArrayList<>();
		list.add(new FoodOrder(1,"surya","briyani","NonVeg",2,"FastDelivery",600));
		list.add(new FoodOrder(2,"ajith","dal rice","Veg",1,"NormalDelivery",100));
		list.add(new FoodOrder(3,"vijay","burger","NonVeg",3,"FastDelivery",400));
		bObj.setFoodOrderList(list);
		
	}
	//Test the validateFoodType method when the foodType is Veg
	@Test
	public void test11ValidateFoodTypeWhenVeg() throws InvalidFoodOrderException{
		
		//fill the code here
		assertTrue(bObj.validateFoodType("Veg"));

	}
	//Test the validateFoodType method when the foodType is NonVeg
	@Test
	public void test12ValidateFoodTypeWhenNonVeg() throws InvalidFoodOrderException{
		
		//fill the code here
		assertTrue(bObj.validateFoodType("NonVeg"));
	}
	//Test the validateDeliveryType method when the deliveryType is FastDelivery
	@Test
	public void test13ValidateDeliveryTypeWhenFastDelivery() throws InvalidFoodOrderException{
		
		//fill the code here
		assertTrue(bObj.validateDeliveryType("FastDelivery"));
	}
	
	//Test the validateDeliveryType method when the deliveryType is NormalDelivery
	@Test
	public void test14ValidateDeliveryTypeWhenNormalDelivery() throws InvalidFoodOrderException{
		
		//fill the code here
		assertTrue(bObj.validateDeliveryType("NormalDelivery"));
	}
	//Test the validateFoodType method when the foodType is Invalid
	@Test
	public void test15ValidateFoodTypeWhenInvalid() throws InvalidFoodOrderException{
		
		//fill the code here
		assertThrows(InvalidFoodOrderException.class,()->bObj.validateFoodType("onlyVeg"));
	}
	//Test the validateDeliveryType method when the deliveryType is Invalid
	@Test
	public void test16ValidateDeliveryTypeWhenInvalid() throws InvalidFoodOrderException{
		
		//fill the code here
		assertThrows(InvalidFoodOrderException.class,()->bObj.validateDeliveryType("SlowDelivery"));
	}
	
	//Test the viewFoodOrdersByOrderId method when the value is valid
	@Test
	public void test17ViewFoodOrdersByOrderIdWhenValid() throws InvalidFoodOrderException{
       		
		//fill the code here
		FoodOrder ob = bObj.viewFoodOrdersByOrderId(1);
		assertEquals(1,ob.getOrderId());
	}

	//Test the viewFoodOrdersByOrderId method when the value is Invalid
	@Test
	public void test18ViewFoodOrdersByOrderIdWhenInvalid() throws InvalidFoodOrderException{

		 //fill the code here
		assertThrows(InvalidFoodOrderException.class,()->bObj.viewFoodOrdersByOrderId(5));

		}

	//Test the viewFoodOrdersByFoodType method
	@Test
	public void test19ViewFoodOrdersByFoodType() throws InvalidFoodOrderException{
	        

		//fill the code here
		List<FoodOrder> l = bObj.viewFoodOrdersByFoodType("Veg");
		assertEquals(1,l.size());
		
}
	 
	//Test the viewFoodOrdersByFoodTypeWise method
	@Test
	public void test20ViewFoodOrdersByFoodTypeWise() throws InvalidFoodOrderException{

	        //fill the code here
			Map<String,List<FoodOrder>> m = bObj.viewFoodOrdersByFoodTypeWise();
			assertEquals(2,(m.get("NonVeg")).size());

		}
	 
	//Test the countTotalFoodOrdersforEachDeliveryType method
	@Test
	public void test21CountTotalFoodOrdersForEachDeliveryType() throws InvalidFoodOrderException{

			//fill the code here
			Map<String,Integer> m2 = bObj.countTotalFoodOrdersForEachDeliveryType();
			assertEquals(1,m2.get("NormalDelivery"));
		}
	 
	//Test the viewFoodOrdersByFoodType method when the list is empty
	@Test
	public void test22ViewFoodOrdersByFoodTypeForEmptyList() throws InvalidFoodOrderException{

			//fill the code here
			FoodShop ob = new FoodShop();
			assertThrows(InvalidFoodOrderException.class,()-> ob.viewFoodOrdersByFoodType("Veg"));

		}
	 
	//Test the viewFoodOrdersByFoodTypeWise method when the list is empty
	@Test
	public void test23ViewFoodOrdersByFoodTypeWiseForEmptyList() throws InvalidFoodOrderException{

	        //fill the code here
		FoodShop ob = new FoodShop();
		assertThrows(InvalidFoodOrderException.class,()-> ob.viewFoodOrdersByFoodTypeWise());

		}
	 
	//Test the countTotalFoodOrdersforEachDeliveryType method when the list is empty
	@Test
	public void test24CountTotalFoodOrdersForEachDeliveryTypeForEmptyList() throws InvalidFoodOrderException{
	        //fill the code here
		FoodShop ob = new FoodShop();
		assertThrows(InvalidFoodOrderException.class,()-> ob.countTotalFoodOrdersForEachDeliveryType());


		}
	 
}

