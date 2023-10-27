package com.service;

import java.util.List;

import com.entities.Student;
import com.exception.InvalidCollegeException;
import com.exception.InvalidStudentException;

public interface IStudentService {
    
	public Student addStudent(Student student, String collegeId) throws InvalidCollegeException;
	public Student viewStudentByRollNumber(String rollNumber) throws InvalidStudentException;
	public List<Student> viewStudentByCollegeName(String collegeName);
	public List<Student> viewStudentByContestWon(int contestWon);
	public Student deleteByStudentRollNumber(String rollNumber) throws InvalidStudentException;
	
}
