package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICollegeDAO;
import com.entities.College;
import com.exception.InvalidCollegeException;

//Provide necessary annotation
@Service
public class CollegeServiceImpl implements ICollegeService{
	
	//Provide necessary annotation
	@Autowired
	private ICollegeDAO iCollegeDAO;

	public College addCollege(College college) {
		return iCollegeDAO.addCollege(college);
	}

	public College updateRewardPointsByCollegeId(String collegeId, int rewardPoints) throws InvalidCollegeException {
		return iCollegeDAO.updateRewardPointsByCollegeId(collegeId, rewardPoints);
	}

	public College viewByCollegeId(String collegeId) throws InvalidCollegeException {
		return iCollegeDAO.viewByCollegeId(collegeId);
	}

	public List<College> viewCollegeByRewardPoints(int rewardPoints) {
		return iCollegeDAO.viewCollegeByRewardPoints(rewardPoints);
	}

	public List<College> viewCollegeByActivityType(String activityType) {
		return iCollegeDAO.viewCollegeByActivityType(activityType);
	}
	

}
