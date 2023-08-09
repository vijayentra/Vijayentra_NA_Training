package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.exception.InvalidLaptopException;
import com.util.ApplicationUtil;
import com.model.Laptop;

public class LaptopDAO {
	public static Connection connection= null;

	public int insertServiceList(List<Laptop> serviceList)  {
		
		// Fill the code here
		int n =0;
		try {
			connection = DBConnectionManager.getConnection();
			String query = "insert into Laptop values(?,?,?,?,?,?)";
			PreparedStatement st = connection.prepareStatement(query);
			for(Laptop list: serviceList) {
				String id = list.getHardwareId();
				String name = list.getHardwareId();
				java.sql.Date date = ApplicationUtil.utilToSqlDateConverter(list.getReceivedDate());
				String root = list.getRootIssue();
				String inten = list.getIssueIntensity();
				double cost = list.getBillAmount();
				st.setString(1,id);
				st.setString(2,name);
				st.setDate(3,date);
				st.setString(4,root);
				st.setString(5,inten);
				st.setDouble(6,cost);
				int count = st.executeUpdate();
				n=n+count;
			}
			st.close();
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
         return n;
	}
}
	 	  	  		    	  	      	      	 	