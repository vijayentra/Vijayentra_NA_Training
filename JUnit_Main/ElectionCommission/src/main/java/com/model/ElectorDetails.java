package com.model;

import java.util.Date;

public class ElectorDetails {
	
	private String electorId;
	private String electorName;
	private Date dateOfBirth;
	private String fatherName;
	private int age;
	private String gender;
	private String address;
	
	public ElectorDetails(String electorId, String electorName, Date dateOfBirth, String fatherName, int age,
			String gender, String address) {
		super();
		this.electorId = electorId;
		this.electorName = electorName;
		this.dateOfBirth = dateOfBirth;
		this.fatherName = fatherName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getElectorId() {
		return electorId;
	}

	public void setElectorId(String electorId) {
		this.electorId = electorId;
	}

	public String getElectorName() {
		return electorName;
	}

	public void setElectorName(String electorName) {
		this.electorName = electorName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
