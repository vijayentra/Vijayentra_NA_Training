package com.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionManager {

	private static Connection con = null;
	private static Properties props = new Properties();

	public static Connection getConnection() throws Exception {

		try {
			FileInputStream f = null;
			f = new FileInputStream("database.properties");
			props.load(f);
			Class.forName(props.getProperty("drivername"));
			con = DriverManager.getConnection(props.getProperty("url"),props.getProperty("username"),
							props.getProperty("password"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	    
 		return con;	
	}
}
