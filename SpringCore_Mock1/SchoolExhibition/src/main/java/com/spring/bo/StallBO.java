package com.spring.bo;

import org.springframework.stereotype.Component;

import com.spring.model.Stall;

//use appropriate annotation to make this class as component class
@Component
public class StallBO {

	public double calculateNetProfit(Stall stallObj) {
		double netProfit = 0;
		// Fill the code
		double budget = 0;
		switch(stallObj.getType()) {
		case "FoodStall":
			budget = 100;
			break;
		case "BookStall":
			budget = 80;
			break;
		case "ArtGallery":
			budget = 70;
			break;
		case "PlantNursery":
			budget = 60;
			break;
		default:
			break;
		}
		netProfit = stallObj.getTotalIncome()-(budget+stallObj.getSetUpCost());
		stallObj.calculateRewardAmount(netProfit);
		return netProfit;
	}
}
