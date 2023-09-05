package com.spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
//use appropriate annotation to make this class as component class

@Component
@Scope("prototype")
public class Stall implements Exhibition {

	private String type;
	private double setUpCost;
	private double totalIncome;
	private double rewardAmount;


	private double percentage=10;

	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getSetUpCost() {
		return setUpCost;
	}


	public void setSetUpCost(double setUpCost) {
		this.setUpCost = setUpCost;
	}


	public double getTotalIncome() {
		return totalIncome;
	}


	public void setTotalIncome(double totalIncome) {
		this.totalIncome = totalIncome;
	}


	public double getRewardAmount() {
		return rewardAmount;
	}


	public void setRewardAmount(double rewardAmount) {
		this.rewardAmount = rewardAmount;
	}

	

	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	@Override
	public void calculateRewardAmount(double netProfit) {

		//fill the code
		double reward = netProfit*getPercentage()*.01;
		setRewardAmount(reward);
		
	}
}
