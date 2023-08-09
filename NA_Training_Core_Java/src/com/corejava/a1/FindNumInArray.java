package com.corejava.a1;
import java.util.*;
public class FindNumInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("enter the elements of the array : ");
		for(int i=0;i<arr.length;i++) {
			int e = sc.nextInt();
			arr[i]=e;
		}
		System.out.print("enter the element to search : ");
		int f = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==f) {
				System.out.println("number found");
				break;
			}
			else if(i==arr.length-1)
				System.out.println("not found");
		}
	}

}
