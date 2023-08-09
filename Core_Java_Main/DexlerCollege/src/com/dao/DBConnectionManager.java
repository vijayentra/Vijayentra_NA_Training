package com.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class DBConnectionManager {

	private static Connection con = null;
	private static Properties props = new Properties();

	public static Connection getConnection() 
	{
	    // Write code here
		try {
			FileInputStream fis = new FileInputStream("database.properties");
			props.load(fis);
			Class.forName(props.getProperty("drivername"));
			con = DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),
					props.getProperty("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
 		return con;	
	}
}