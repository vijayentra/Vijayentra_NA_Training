package com.spring.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {

	public static void main(String[] args) {

//Fill the code
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		List<Shipment> list = new ArrayList<>();
		
//		for(int j=1;j<=2;j++) {
		Shipment s = context.getBean("ShipmentObj",Shipment.class);
		Item i = context.getBean("ItemObj",Item.class);
		
		System.out.println("Shipment Details1");
		System.out.println("Enter the Item Name");
		String name = sc.next();
		i.setItemName(name);
		System.out.println("Enter the Item Price");
		double price = sc.nextDouble();
		i.setPrice(price);
		s.setItem(i);
		System.out.println("Enter the ShipmentId");
		String id = sc.next();
		s.setShipmentId(id);
		System.out.println("Enter the Delivery Status");
		String status = sc.next();
		s.setDeliveryStatus(status);
//		list.add(s);
//		}
//		
//		for(Shipment l: list) {
//			System.out.println("Delivery Status of shipment ID: "+l.getShipmentId()+" is "+ l.getDeliveryStatus());
//			System.out.println("Delivery Status of shipment ID: "+l.getShipmentId()+" is "+ l.getDeliveryStatus());
//		}
		
		Shipment s2 = context.getBean("ShipmentObj",Shipment.class);
		Item i2 = context.getBean("ItemObj",Item.class);
		
		System.out.println("Shipment Details2");
		System.out.println("Enter the Item Name");
		String name2 = sc.next();
		i2.setItemName(name2);
		System.out.println("Enter the Item Price");
		double price2 = sc.nextDouble();
		i2.setPrice(price2);
		s2.setItem(i2);
		System.out.println("Enter the ShipmentId");
		String id2 = sc.next();
		s2.setShipmentId(id2);
		System.out.println("Enter the Delivery Status");
		String status2 = sc.next();
		s2.setDeliveryStatus(status2);
		
		
		System.out.println("Delivery Status of shipment ID: "+s.getShipmentId()+" is "+ s.getDeliveryStatus());
		System.out.println("Delivery Status of shipment ID: "+s2.getShipmentId()+" is "+ s2.getDeliveryStatus());
	}	 

	
}
