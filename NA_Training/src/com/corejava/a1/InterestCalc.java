package com.corejava.a1;

import java.util.*;
public class InterestCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float p,r,t,si,ci;
		System.out.println("Enter principal, rate of interest(in %) and time period(in years) : ");
		p=sc.nextFloat();
		r=sc.nextFloat();
		t=sc.nextFloat();
		int n = sc.nextInt();
		si=(p*r*t)/100;
		ci=(float)(p*Math.pow(1+(r/(100*n)),n*t)) - p;
		System.out.println(si + " "+  ci);
		
	}

}
