package com.corejava.a1;
import java.util.*;
public class CUI_Application {

	public static void main(String[] args) {
		final String username = "vijayentra";
		final String password = "password";
		int a=0,max=3;
		Scanner sc = new Scanner(System.in);

		while(a<max) {
			System.out.print("enter user-id : ");
			String name = sc.next();
			System.out.print("enter password : ");
			String pass = sc.next();
			if(username.equals(name) && password.equals(pass)) {
				System.out.println("WELCOME "+ username);
				break;
			}
			else {
				System.out.println("Invalid credentials");
				a++;
			}
		}
		if(a==max) {
			System.out.println("Contact admin");
		}
		
		
		
	}

}
