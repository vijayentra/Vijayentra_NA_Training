package com.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnectionManager {
	
	private static Connection con = null;
	private static Properties props = new Properties();

	public static Connection getConnection() throws Exception {
	    // fill the code here
		FileInputStream f = null;
		f = new FileInputStream("database.properties");
		props.load(f);
		Class.forName(props.getProperty("drivername"));
		Connection con  = DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),
						props.getProperty("password"));
	    
 		return con;	
	}
}
