package com.bean;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CURR")
public class CurrentAccount extends Account {
	private double ODLimit;

	public CurrentAccount() {
		
	}

	public double getODLimit() {
		return ODLimit;
	}

	public void setODLimit(double oDLimit) {
		ODLimit = oDLimit;
	}
	
	
          
}
