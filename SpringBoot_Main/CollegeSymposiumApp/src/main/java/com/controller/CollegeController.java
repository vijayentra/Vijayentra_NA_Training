package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.College;
import com.exception.InvalidCollegeException;
import com.service.ICollegeService;

//Provide necessary Annotation
@RestController
public class CollegeController {
	
	//Provide necessary Annotation
	@Autowired
	private ICollegeService iCollegeService;
	
	//Provide necessary Annotation for the below methods and fill the code
	@PostMapping("/college/addCollege")
	public College addCollege(@RequestBody College college) {
		return iCollegeService.addCollege(college);
	}
	
	@GetMapping("/college/viewByCollegeId/{collegeId}")
	public College viewByCollegeId(@PathVariable String collegeId) throws InvalidCollegeException {
		return iCollegeService.viewByCollegeId(collegeId);
	}
	
	@PutMapping("/college/updateRewardPointsByCollegeId/{collegeId}/{rewardPoints}")
	public College updateRewardPointsByCollegeId(@PathVariable String collegeId,@PathVariable int rewardPoints) throws InvalidCollegeException {
		return iCollegeService.updateRewardPointsByCollegeId(collegeId, rewardPoints);
	}

	@GetMapping("/college/viewCollegeByRewardPoints/{rewardPoints}")
	public List<College> viewCollegeByRewardPoints(@PathVariable int rewardPoints) {
		return iCollegeService.viewCollegeByRewardPoints(rewardPoints);
	}

	@GetMapping("/college/viewCollegeByActivityType/{activityType}")
	public List<College> viewCollegeByActivityType(String activityType) {
		return iCollegeService.viewCollegeByActivityType(activityType);
	}

}

