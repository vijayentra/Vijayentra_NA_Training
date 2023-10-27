package com.corejava.assessment15_9_2023;

import java.util.Scanner;

public class findLetter {
	
	public static boolean isLetter(char a) {
		if(Character.isLetter(a) && a!= 'a'&&a!='A'&& a!= 'e'&&a!='E' && a!= 'i'&&a!='I' 
				&& a!= 'o'&&a!='O' && a!= 'u'&&a!='U') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String : ");
		String s = sc.next();
		System.out.print("Number: ");
		int n = sc.nextInt();
		char[] ls = s.toCharArray();
		int count = 0;
		int n1=0;
		for(int i = ls.length-1; i>=0; i--) {
			if(isLetter(ls[i])) {
				count+=1;
			}
			if(count==n) {
				System.out.println(ls[i]);
				n1=1;
				break;
			}
		}
		if(n1==0) System.out.println("not there.");
	}

}
