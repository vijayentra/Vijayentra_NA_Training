package com.corejava.a2;

public class Employee {
	String emp_name;
	double base_salary;
	
	public Employee(String emp_name,double base_salary) {
		this.emp_name=emp_name;
		this.base_salary=base_salary;
		}
	public double Salary() {
		return base_salary;
	}
	
	
	public String toString() {
        return emp_name + " (Employee)";
    }
	
	public static void main(String[] args) {
		Employee[] employee=new Employee[2];
		employee[0]= new Manager("Amit",1000000,200000);
		employee[1]= new Labour("Khan",500000,50000);
		double total_salary=0;
		for(Employee e : employee) {
			System.out.println(e.toString());
			total_salary += e.Salary();
		}
		System.out.println("total salary : "+ total_salary);
	}
	
}
