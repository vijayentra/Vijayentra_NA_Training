package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Provide necessary Annotation 
@Entity
public class Student {

	//Provide necessary Annotation
	@Id
	private String rollNumber;
	private String department;
	private String activityType;//can be a coding contest , presentation, a project
	private int contestWon = 0;//zero when added and can be 1 by update

	//Provide necessary Annotation 
	@ManyToOne()
	@JoinColumn(name = "college_id")
	private College collegeObj;

	public Student() {
		super();
	}

	public Student(String rollNumber, String department, String activityType, int contestWon, College collegeObj) {
		super();
		this.rollNumber = rollNumber;
		this.department = department;
		this.activityType = activityType;
		this.contestWon = contestWon;
		this.collegeObj = collegeObj;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public int getContestWon() {
		return contestWon;
	}

	public void setContestWon(int contestWon) {
		this.contestWon = contestWon;
	}

	public College getCollegeObj() {
		return collegeObj;
	}

	public void setCollegeObj(College collegeObj) {
		this.collegeObj = collegeObj;
	}	
}
