package com.spring.app;

import java.util.Map;

public class GoldRateInfo {

	private Map<Integer,Double>rateInfo;

	public Map<Integer, Double> getRateInfo() {
		return rateInfo;
	}

	public void setRateInfo(Map<Integer, Double> rateInfo) {
		this.rateInfo = rateInfo;
	}
	
	public double calculateGoldRate(int goldCarat, double grams) 
	{
		double totalRate=0.0;
		//fill the code
//		rateInfo.put(goldCarat, grams);
		switch(goldCarat) {
		case 18:
			totalRate = grams*3800;
			break;
		case 22:
			totalRate = grams*4300;
			break;
		case 24:
			totalRate = grams*4500;
			break;
		}
		return totalRate;
	}
}
