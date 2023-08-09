package com.corejava.a1;
import java.util.*;
public class TaxCalc {

	public static void main(String[] args) {
		double LPA;
		Scanner sc =new Scanner(System.in);
		System.out.print("enter your LPA : ");
		LPA = sc.nextDouble();
		if(LPA>0&&LPA<=180000) 
			System.out.println("NO TAX");
		else if(LPA>180000&&LPA<=300000) 
			System.out.println(LPA*.1);
		else if(LPA>300000&&LPA<=500000) 
			System.out.println(LPA*.2);
		else if(LPA>500000&&LPA<=100000) 
			System.out.println(LPA*.3);

	}

}
