package com.spring.bo;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.spring.model.Dish;

//use appropriate annotation to make this class as component class
@Component
public class DishBO {

	public double calculateDishSalesAmount(Dish dishObj) {
		double dishSalesAmount = 0;
		// Fill the code
		double cost = 0;
		Map<String,Double> details = dishObj.getDishDetails();
		switch(dishObj.getName()) {
		case "North Indian Thali":
			cost = details.get("North Indian Thali");
			break;
		case "Chicken Biriyani":
			cost = details.get("Chicken Biriyani");
			break;
		case "Paneer Butter Masala":
			cost = details.get("Paneer Butter Masala");
			break;
		case "Butter Chicken":
			cost = details.get("Butter Chicken");
			break;
		default:
			break;
		}
		dishSalesAmount = dishObj.getOrderCount()*cost;
		dishObj.calculateBonusAmount(dishSalesAmount);
		return dishSalesAmount;
	}
}
