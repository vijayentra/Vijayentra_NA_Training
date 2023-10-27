package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Student;
import com.exception.InvalidCollegeException;
import com.exception.InvalidStudentException;
import com.service.IStudentService;

//Provide necessary Annotation
@RestController
public class StudentController {
	
	
	//Provide necessary Annotation
	@Autowired
	private IStudentService iStudentService;

	//Provide necessary Annotation for the below methods and fill the code
	@PostMapping("/student/addStudent/{collegeId}")
	public Student addStudent(@RequestBody Student student,@PathVariable String collegeId) throws InvalidCollegeException {
		return iStudentService.addStudent(student, collegeId);
	}
	@GetMapping("/student/viewStudentByRollNumber/{rollNumber}")
	public Student viewStudentByRollNumber(@PathVariable String rollNumber) throws InvalidStudentException {
		return iStudentService.viewStudentByRollNumber(rollNumber);
	}
	
	@GetMapping("/student/viewStudentByCollegeName/{collegeName}")
	public List<Student> viewStudentByCollegeName(@PathVariable String collegeName) {
		return iStudentService.viewStudentByCollegeName(collegeName);
	}
	
	@GetMapping("/student/viewStudentByContestWon/{contestWon}")
	public List<Student> viewStudentByContestWon(@PathVariable int contestWon) {
		return iStudentService.viewStudentByContestWon(contestWon);
	}
	
	@DeleteMapping("/student/deleteByStudentRollNumber/{rollNumber}")
	public Student deleteByStudentRollNumber(@PathVariable String rollNumber) throws InvalidStudentException {
		return iStudentService.deleteByStudentRollNumber(rollNumber);
	}
}
