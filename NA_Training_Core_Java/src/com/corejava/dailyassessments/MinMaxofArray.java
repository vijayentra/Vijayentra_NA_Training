package com.corejava.dailyassessments;
import java.util.*;
import java.util.*;
public class MinMaxofArray {
	static void MinMax(int[] arr) {
		int min=arr[0],max=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("the minimum number in the array is "+min);
		System.out.println("the maximum number in the array is "+max);
	}
	public static void main(String[] args) {
		System.out.print("enter the size of the array :");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		System.out.print("enter the elements of the array :");
		for(int i=0;i<n;i++) {
			int a =sc.nextInt();
			arr[i]=a;
		}
		MinMax(arr);
	}
}
