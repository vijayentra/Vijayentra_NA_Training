package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.College;

//Provide necessary annotation
@Repository
public interface CollegeRepository extends JpaRepository<College, String>{

	//Provide necessary methods to view College by reward points greater than or equal to a given value and
	List<College> findByRewardPointsGreaterThanEqual(int rewardPoints);
	
	List<College> findByStudentList_ActivityType(String activity_Type);
	//view college based on a given activity type

}
