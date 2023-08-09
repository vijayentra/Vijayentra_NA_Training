package com.service;
import java.util.ArrayList;
import java.util.List;

import com.dao.LaptopDAO;
import com.model.Laptop;
import com.util.ApplicationUtil;

public class LaptopService {

	public static List <Laptop> buildServiceList(List <String> ServiceRecords) {

		List <Laptop> objectList = new ArrayList<Laptop>();
		// FILL THE CODE HERE
		for(String list : ServiceRecords) {
			String[] details = list.split(":");
			String Id = details[0];
			String name = details[1];
			java.util.Date date = ApplicationUtil.stringToDateConverter(details[2]);
			String issue = details[3];
			String intensity = details[4];
			double cost = calculateBillAmount(issue,intensity);
			Laptop obj = new Laptop(Id,name,date,issue,intensity,cost);
			objectList.add(obj);
		}
		return objectList;
	}

	public boolean addServiceList(String[] input)	{

		// FILL THE CODE HERE
		List<String> res = new ArrayList<String>();
		res = ApplicationUtil.extractDetails(input);
		List<Laptop> output = new ArrayList<Laptop>();
		output = buildServiceList(res);
		LaptopDAO lap = new LaptopDAO();
		if(output.isEmpty()) return false;
		lap.insertServiceList(output);
		return true;
	}	 	  	  		    	  	      	      	 	
	public static double calculateBillAmount(String rootIssue,String issueIntensity)
	{
		// FILL THE CODE HERE 
		double cost = 0;
		switch(rootIssue.toLowerCase()) {
		case "software" : 
			cost+=2000;
			break;
		case "display" : 
			cost+=5000;
			break;
		case "keyboard" : 
			cost+=1000;
			break;
		case "sound" : 
			cost+=800;
			break;
		case "key" : 
			cost+=500;
			break;
		}
		if(issueIntensity.toLowerCase().equals("low")) cost=cost-cost*0.05;
		if(issueIntensity.toLowerCase().equals("mid")) cost=cost+cost*0.05;
		if(issueIntensity.toLowerCase().equals("high")) cost=cost+cost*0.10;
		return cost;
	}

}

