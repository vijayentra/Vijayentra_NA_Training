package com.corejava.a2;
 
public class Manager extends Employee{
	double incentive;
	public Manager(String emp_name, double salary, double incentive) {
		super(emp_name, salary);
		this.incentive=incentive;
	}	
	
	public double Salary() {
		return super.Salary() +incentive;
	}
	
	public String toString() {
	        return super.toString() + ", Incentive: " + incentive;
	    }
}
