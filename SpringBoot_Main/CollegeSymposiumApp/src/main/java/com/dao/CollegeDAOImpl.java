package com.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.College;
import com.exception.InvalidCollegeException;
import com.repository.CollegeRepository;

@Component
public class CollegeDAOImpl implements ICollegeDAO{
	
	//Provide necessary Annotation	
	@Autowired
	private CollegeRepository collegeRepository;
	
	public College addCollege(College college) {
		//fill code
		return collegeRepository.save(college);
	}

	public College viewByCollegeId(String collegeId) throws InvalidCollegeException {
		//fill code
		College c = collegeRepository.findById(collegeId).orElseThrow(()-> new InvalidCollegeException("Invalid Id"));
		return c;
	}

	public College updateRewardPointsByCollegeId(String collegeId, int rewardPoints) throws InvalidCollegeException {
		//fill code
		College c = collegeRepository.findById(collegeId).orElseThrow(()-> new InvalidCollegeException("Invalid Id"));
		c.setRewardPoints(rewardPoints+c.getRewardPoints());
		return collegeRepository.save(c);	
	}

	public List<College> viewCollegeByRewardPoints(int rewardPoints) {
		//fill code
		return collegeRepository.findByRewardPointsGreaterThanEqual(rewardPoints);
	}

	public List<College> viewCollegeByActivityType(String activityType) {
		//fill code
		return collegeRepository.findByStudentList_ActivityType(activityType);
	}
}
