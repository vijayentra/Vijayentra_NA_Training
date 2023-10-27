package com.dao;

import java.util.List;

import com.entities.College;
import com.exception.InvalidCollegeException;

public interface ICollegeDAO {

	public College addCollege(College college);
	public College viewByCollegeId(String collegeId) throws InvalidCollegeException;
	public College updateRewardPointsByCollegeId(String collegeId,  int rewardPoints) throws InvalidCollegeException;
	public List<College> viewCollegeByRewardPoints(int rewardPoints);
	public List<College> viewCollegeByActivityType(String activityType);

    
}
