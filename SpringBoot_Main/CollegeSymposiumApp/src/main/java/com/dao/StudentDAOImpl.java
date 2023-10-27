package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.College;
import com.entities.Student;
import com.exception.InvalidCollegeException;
import com.exception.InvalidStudentException;
import com.repository.CollegeRepository;
import com.repository.StudentRepository;

@Component
public class StudentDAOImpl implements IStudentDAO  {
	
	//Provide necessary Annotation
	@Autowired
	private StudentRepository studentRepository;
	
	//Provide necessary Annotation
	@Autowired
	private CollegeRepository collegeRepository;

	public Student addStudent(Student student, String collegeId) throws InvalidCollegeException {
		//fill code 
		College c = collegeRepository.findById(collegeId).
				orElseThrow(()-> new InvalidCollegeException("Invalid Id"));
		student.setCollegeObj(c);
		return studentRepository.save(student);
	}

	public Student viewStudentByRollNumber(String rollNumber) throws InvalidStudentException {

		//fill code 
		Student s = studentRepository.findById(rollNumber).
				orElseThrow(()-> new InvalidStudentException("Invalid rollNumber"));
		
		return s;
	}


	public List<Student> viewStudentByCollegeName(String collegeName) {

		//fill code 
		return studentRepository.findByCollegeObj_CollegeName(collegeName);
	}

	public List<Student> viewStudentByContestWon(int contestWon) {

		//fill code 
		return studentRepository.findByContestWon(contestWon);
	}
	
	public Student deleteByStudentRollNumber(String rollNumber) throws InvalidStudentException {
	    //fill code 
		Student s = studentRepository.findById(rollNumber).
				orElseThrow(()-> new InvalidStudentException("Invalid rollNumber"));
		College c = s.getCollegeObj();
		studentRepository.delete(s);
		collegeRepository.save(c);
		return s;
	}
	

}
