package com.spring.service;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.bo.DishBO;
import com.spring.exception.UnavailableDishException;
import com.spring.model.Dish;

//use appropriate annotation to make this class as component class
@Component
public class DishService {

	private DishBO dishBO;

	// use appropriate annotation
	@Autowired
	public DishService(DishBO dishBO) {
		super();
		this.dishBO = dishBO;
	}

	public DishBO getDishBO() {
		return dishBO;
	}

	public void setDishBO(DishBO dishBO) {
		this.dishBO = dishBO;
	}

	public void calculateDishSalesAmount(Dish dishObj) throws UnavailableDishException {
		// Fill the code
		Map<String,Double> details = dishObj.getDishDetails();
		int count =0;
		for(Map.Entry<String, Double> d : details.entrySet() ) {
			if(d.getKey().equals(dishObj.getName())){
				dishBO.calculateDishSalesAmount(dishObj);
				count=1;
				break;
			}
		}
		if(count==0) {
		throw new UnavailableDishException("This dish is not available");
		}
	}
}