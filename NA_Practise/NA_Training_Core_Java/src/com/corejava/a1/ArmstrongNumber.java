package com.corejava.a1;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int sum,r,temp;
		for(int i=100;i<=999;i++){
		temp=i;
		sum=0;
		while(temp>0) {
			r=temp%10;
			sum+=(r*r*r);
			temp=temp/10;
		}
		if(sum==i)
			System.out.print(i+ " ");
		}
	}
}

