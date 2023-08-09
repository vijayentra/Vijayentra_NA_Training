//Do not add or edit the code. Model class is provided as part of the code skeleton
package com.model;
import java.util.Date;
public class Faculty {
	private String facultyId;
	private String facultyName;
	private String jobTitle;
	private String department;
	private int age;
	private Date dateOfJoining;
	private long phoneNumber;
	private double salary;
	
	public Faculty()
	{
		super();
	}
	
	
	
	public Faculty(String facultyId, String facultyName, String jobTitle, String department, int age,
			Date dateOfJoining, long phoneNumber, double salary) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.jobTitle = jobTitle;
		this.department = department;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}







	public String getJobTitle() {	 	  	      	 	    	      	    	      	 	
		return jobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}



	public String getFacultyId() {
		return facultyId;
	}


	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}


	public String getFacultyName() {
		return facultyName;
	}


	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {	 	  	      	 	    	      	    	      	 	
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Date getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}	 	  	      	 	    	      	    	      	 	

	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", jobTitle=" + jobTitle
				+ ", department=" + department + ", age=" + age + ", dateOfJoining=" + dateOfJoining + ", phoneNumber="
				+ phoneNumber + ", salary=" + salary + "]";
	}





	
	
	
	}
	

	 	  	      	 	    	      	    	      	 	
