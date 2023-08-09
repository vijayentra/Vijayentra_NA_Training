package com.util;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.exception.InvalidLaptopException;

public class ApplicationUtil {

	public static List<String> extractDetails(String[] input) {
	    List<String> stringList = new ArrayList<String>();
	   // FILL THE CODE HERE
	    for(String list : input) {
	    	 String[] details = list.split(":");
	    	 String name = details[1];
	    	 try {
	    		 if(validateLaptopName(name)) {
	    			 stringList.add(list);
	    		 }
	    	 }catch(InvalidLaptopException e) {
	    		 System.out.println(e.getMessage());
	    	 }
	    }
	    return stringList;
	}


	public static boolean validateLaptopName(String laptopName) throws InvalidLaptopException{
		// FILL THE CODE HERE
		String[] valid_names = {"apple","dell","hp","lenovo","acer"};
		for(String n : valid_names) {
			if(laptopName.toLowerCase().equals(n)) {
				return true;
			}
		}
		throw new InvalidLaptopException("Invalid Laptop");
	}

	public static java.util.Date stringToDateConverter(String stringDate) {
		// FILL THE CODE HERE
		String format = "dd-MM-yyyy";
		SimpleDateFormat pattern = new SimpleDateFormat(format);
		try {
			Date date = pattern.parse(stringDate);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		return null;
	}


	public static java.sql.Date utilToSqlDateConverter(java.util.Date receivedDate) {
		
		// TODO Auto-generated method stub
		java.sql.Date date = new java.sql.Date(receivedDate.getTime());
		return date;
	}
}