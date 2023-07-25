package com.corejava.a1;
import java.util.*;
public class MarksResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int count=0;
		System.out.println("enter three marks : ");
		for(int a : arr) {
			a=sc.nextInt();
			if(a>60)
				count++;
		}
		if(count==0|count==1)
			System.out.println("failed");
		else if(count==3)
			System.out.println("passed");
		else
			System.out.println("promoted");
		
	}

}
