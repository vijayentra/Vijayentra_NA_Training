package com.corejava.a1;

import java.util.Scanner;

public class BubbleSort {
	public static void bsort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		bsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
