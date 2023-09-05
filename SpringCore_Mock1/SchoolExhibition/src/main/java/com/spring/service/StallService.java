package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.bo.StallBO;
import com.spring.model.Stall;

//use appropriate annotation to make this class as component class

@Component
public class StallService {
	
	private StallBO stallBO;

//use appropriate annotation
	@Autowired
	public StallService(StallBO stallBO) {
		super();
		this.stallBO = stallBO;
	}

	public StallBO getStallBO() {
		return stallBO;
	}

	public void setStallBO(StallBO stallBO) {
		this.stallBO = stallBO;
	}

	public void calculateNetProfit(Stall stallObj) {
		// Fill the code
		stallBO.calculateNetProfit(stallObj);
	}
}