

package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.text.*;
import com.exception.InvalidFacultyException;




public class ApplicationUtil {

	public static List<String> extractDetails(String[] input) {
		List<String> stringList = new ArrayList<String>();
		
		//FILL THE CODE HERE
		for(String s : input) {
			String[] parts = s.split(":");
			try {
				if(validateFacultyRecords(parts[0])) {
					stringList.add(s);
				}
			}catch(InvalidFacultyException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return stringList;
	}

	public static boolean validateFacultyRecords(String facultyId) throws InvalidFacultyException 
	{
				
		//FILL THE CODE HERE
//		String regex = "^DEX[0-9]{3}$";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher m = pattern.matcher(facultyId);
//		if(!m.matches()) throw new InvalidFacultyException("Invalid Faculty Id");
//		return true;
		char[] ch = facultyId.toCharArray();
		if(ch.length!=6) throw new InvalidFacultyException("Invalid faculty");
		if(ch[0]!='D'||ch[1]!='E'||ch[2]!='X') throw new InvalidFacultyException("Invalid faculty");
		if(ch[3]!='0'&&ch[3]!='1'&&ch[3]!='2'&&ch[3]!='3'&&ch[3]!='4'&&ch[3]!='5'&& ch[3]!='6'&& ch[3]!='7'&&ch[3]!='8'&&ch[3]!='9') throw new InvalidFacultyException("Invalid faculty");
		if(ch[4]!='0'&&ch[4]!='1'&&ch[4]!='2'&&ch[4]!='3'&&ch[4]!='4'&&ch[4]!='5'&& ch[4]!='6'&& ch[4]!='7'&&ch[4]!='8'&&ch[4]!='9') throw new InvalidFacultyException("Invalid faculty");
		if(ch[4]!='0'&&ch[5]!='1'&&ch[5]!='2'&&ch[5]!='3'&&ch[5]!='4'&&ch[5]!='5'&& ch[5]!='6'&& ch[5]!='7'&&ch[5]!='8'&&ch[5]!='9') throw new InvalidFacultyException("Invalid faculty");
		return true;
	}

	
	
	public static java.util.Date stringToDateConverter(String stringDate) {
		// FILL THE CODE HERE
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = null;
		try {
			date = format.parse(stringDate);	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

	public static java.sql.Date utilToSqlDateConverter(java.util.Date utDate) {	 	  	      	 		     	     	        	 	
		
		java.sql.Date sqlDate = null;
		// FILL THE CODE HERE
		sqlDate = new java.sql.Date(utDate.getTime());
		
		return sqlDate;
		
	}
	


	public static java.util.Date sqlToUtilDateConverter(java.sql.Date sDate) {
		
		java.util.Date utDate = null;
		// FILL THE CODE HERE
		utDate = new java.util.Date(sDate.getTime());	
		return utDate;
		}

}