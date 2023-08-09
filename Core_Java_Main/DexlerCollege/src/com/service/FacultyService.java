package com.service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.model.Faculty;
import com.util.ApplicationUtil;
import com.dao.FacultyDAO;
import com.exception.InvalidFacultyException;
import java.sql.*;




public class FacultyService {
	
public static List <Faculty> buildFacultyList(List<String> facultyRecords) {

	List <Faculty> objectList = new ArrayList<Faculty>();
	// FILL THE CODE HERE
	for(String s : facultyRecords) {
		String[] parts = s.split(":");
		String id = parts[0];
		String name = parts[1];
		String job = parts[2];
		String dep = parts[3];
		int age = Integer.parseInt(parts[4]);
		java.util.Date date = ApplicationUtil.stringToDateConverter(parts[5]);
		long ph = Long.parseLong(parts[6]);
		double salary = calculateSalary(job);
		Faculty f = new Faculty(id,name,job,dep,age,date,ph,salary);
		objectList.add(f);
	}
	return objectList;
	}

	public static double calculateSalary(String jobTitle)
	{
		double salary = 0;
		// FILL THE CODE HERE
		if(jobTitle.equalsIgnoreCase("Assistant Professor")) salary = 20000;
		if(jobTitle.equalsIgnoreCase("Associate Professor")) salary = 25000;
		if(jobTitle.equalsIgnoreCase("Professor")) salary = 30000;
	
		return salary;
		
	}
	public boolean addFacultyList(String[] facultyList)
	{
		boolean flag=false;
		// FILL THE CODE HERE
		List<String> res = ApplicationUtil.extractDetails(facultyList);
		List<Faculty> output = buildFacultyList(res);
		FacultyDAO dao = new FacultyDAO();
		int n = dao.insertFacultyList(output);
		if(n!=0) return true;
		return flag;
	}	 
	
	
	public static int retrieveFacultyCount(String department)
	
	{	 	  	      	 	    	      	    	      	 	
		// FILL THE CODE HERE
		FacultyDAO fac = new FacultyDAO();
		List<Faculty> list = new ArrayList<>();
		list = fac.retrieveFacultyList(department);
		return list.size();
		
	}

}


	 