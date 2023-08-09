package com.dao;

import com.model.Faculty;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.model.Faculty;
import com.util.ApplicationUtil;
import com.exception.InvalidFacultyException;
import java.util.*;

public class FacultyDAO {
	public static Connection connection= null;

	public int insertFacultyList(List<Faculty> facultyList)
	{
	
	// FILL THE CODE HERE
	int n =0;
	
	try {
		connection = DBConnectionManager.getConnection();
		String query = "insert into FACULTY values (?,?,?,?,?,?,?,?)";
		PreparedStatement st = connection.prepareStatement(query);
		for(Faculty f : facultyList) {
			String id = f.getFacultyId();
			String name = f.getFacultyName();
			String job = f.getJobTitle();
			String dep = f.getDepartment();
			int age = f.getAge();
			java.sql.Date date = ApplicationUtil.utilToSqlDateConverter(f.getDateOfJoining());
			long ph = f.getPhoneNumber();
			double salary = f.getSalary();
			st.setString(1, id);
			st.setString(2, name);
			st.setString(3, job);
			st.setString(4, dep);
			st.setInt(5, age);
			st.setDate(6, date);
			st.setLong(7, ph);
			st.setDouble(8, salary);
			st.executeUpdate();
			n+=1;
			
		}
		st.close();
		connection.close();
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return n;
		
	}
public List<Faculty> retrieveFacultyList(String department) {


	// FILL THE CODE HERE
	List<Faculty> list = new ArrayList<>();
	try {
		connection = DBConnectionManager.getConnection();
		String query = "Select * from FACULTY where DEPARTMENT = ?";
		PreparedStatement st = connection.prepareStatement(query);
		st.setString(1, department);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String job = rs.getString(3);
			String dep = rs.getString(4);
			int age = rs.getInt(5);
			java.util.Date date = ApplicationUtil.sqlToUtilDateConverter(rs.getDate(6));
			long ph = rs.getLong(7);
			double salary = rs.getDouble(8);
			Faculty f = new Faculty(id,name,job,dep,age,date,ph,salary);
			list.add(f);
		}
		st.close();
		rs.close();
		connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	return list;
}	    

		
	  

}
	 	  	 	  	      	 	    	      	    	      	 	
