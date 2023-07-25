package com.corejava.a2;

public class Singleton {
	private static Singleton instance;
	String data;
	private Singleton() {
		System.out.println("singleton class");
		data = "hi";
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	 public String getData() {
	        return data;
	    }
	
	public static void main(String[] args) {
		    Singleton singleton1 = Singleton.getInstance();
	        Singleton singleton2 = Singleton.getInstance();

	        // Both singleton1 and singleton2 point to the same instance
	        System.out.println(singleton1 == singleton2); // Output: true

	        // Access and modify data from the singleton instance
	        System.out.println(singleton1.getData()); // Output: Hello, I am the SingletonClass!
	        System.out.println(singleton2.getData()); // Output: Hello, I am the SingletonClass!
//
//	        // Modify the data in one instance, and it reflects in the other instance
//	        singleton1.data = "Modified data!";
//	        System.out.println(singleton1.getData()); // Output: Modified data!
//	        System.out.println(singleton2.getData()); // Output: Modified data!
	    }
}
 