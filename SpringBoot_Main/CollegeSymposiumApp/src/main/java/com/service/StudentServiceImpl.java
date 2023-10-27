package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IStudentDAO;
import com.entities.Student;
import com.exception.InvalidCollegeException;
import com.exception.InvalidStudentException;

//Provide necessary annotation
@Service
public class StudentServiceImpl implements IStudentService{
	
	//Provide necessary annotation
	@Autowired
	private IStudentDAO iStudentDAO; 

	public Student addStudent(Student student, String collegeId) throws InvalidCollegeException {
		return iStudentDAO.addStudent(student, collegeId);
	}

	public Student viewStudentByRollNumber(String rollNumber) throws InvalidStudentException {
		return iStudentDAO.viewStudentByRollNumber(rollNumber);
	}

	public List<Student> viewStudentByCollegeName(String collegeName) {
		return iStudentDAO.viewStudentByCollegeName(collegeName);
	}

	public List<Student> viewStudentByContestWon(int contestWon) {
		return iStudentDAO.viewStudentByContestWon(contestWon);
	}
	
	public Student deleteByStudentRollNumber(String rollNumber) throws InvalidStudentException {
	    //fill code 
		return iStudentDAO.deleteByStudentRollNumber(rollNumber);
	}


}
