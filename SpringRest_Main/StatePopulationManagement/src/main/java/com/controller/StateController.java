package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.StateInvalidException;
import com.model.State;
import com.service.StateService;

@RestController
public class StateController {
	
	@Autowired
	private StateService stateService;

	@PostMapping("/SMS/addState")
	public boolean addState(State stateObj)
	{
		return stateService.addState(stateObj);
	}
	
	@GetMapping("/SMS/viewStateById/{stateId}")
	public State viewStateById(@PathVariable Integer stateId){
		State s = stateService.viewStateById(stateId);
		if(s==null) {
			throw new StateInvalidException("State ID "+ stateId+ "does not exist");
		}
		return s;
	}
	
	@GetMapping("/SMS/viewStateByCountry/{countryName}")
	public ArrayList<State> viewStateByCountry(@PathVariable String countryName)
	{
		return stateService.viewStateByCountry(countryName);
	}
		
	@PutMapping("/SMS/updateStatePopulation/{stateId}/{population}")
	public boolean updateStatePopulation(@PathVariable Integer stateId,@PathVariable long population)
	{
		return stateService.updateStatePopulation(stateId, population);
	}
	
	@DeleteMapping("/SMS/deleteState/{stateId}")
	public boolean deleteState(@PathVariable Integer stateId ) 
	{
		return stateService.deleteState(stateId);
	}

}

