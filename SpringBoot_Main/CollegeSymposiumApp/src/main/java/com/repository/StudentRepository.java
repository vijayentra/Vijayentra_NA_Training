package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Student;

//Provide necessary annotation
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

	//Provide necessary methods to view Student based on a given value for contest won,
	//view Students based on a given college name.
	List<Student> findByContestWon(int contestWon);
	List<Student> findByCollegeObj_CollegeName(String collegeName);

}
