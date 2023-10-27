package com.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


//Provide necessary Annotation 
@Entity
public class College {

	//Provide necessary Annotation 
	@Id
	@Column(name = "college_id")
	private String collegeId;
	private String collegeName;
	private String city;
	private String collegeType;
	private int rewardPoints = 0;// zero when added initially
	
	//Provide necessary Annotations
	@OneToMany(mappedBy = "collegeObj")
	private List<Student> studentList;
	
	
	public College() {
		super();
	}
	public College(String collegeId, String collegeName, String city, String collegeType, int rewardPoints,
			List<Student> studentList) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.city = city;
		this.collegeType = collegeType;
		this.rewardPoints = rewardPoints;
		this.studentList = studentList;
	}
	
	public String getCollegeId() {
		return collegeId;
	}
	
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCollegeType() {
		return collegeType;
	}
	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
}
