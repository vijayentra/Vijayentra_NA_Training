package com.corejava.a2;

public class Labour extends Employee{
	double overtime;
	public Labour(String emp_name, double salary, double overtime) {
		super(emp_name, salary);
		this.overtime=overtime;
	}
	
	public double Salary() {
		return super.Salary() + overtime;
	}
	
	public String toString() {
	        return super.toString() + ", Overtime: " + overtime;
	    }

}
