package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.exception.InvalidLaptopException;
import com.util.ApplicationUtil;
import com.model.Laptop;

public class LaptopDAO {
	public static Connection connection= null;

	public int insertServiceList(List<Laptop> serviceList)  {
		
		// Fill the code here
		int total =0;
//		ArrayList<Integer> count = new ArrayList<>();
		
		try {
			connection = DBConnectionManager.getConnection();
			String query = "insert into Laptop values(?,?,?,?,?,?)";
			PreparedStatement st = connection.prepareStatement(query);
			for(Laptop list: serviceList) {
				String id = list.getHardwareId();
				String name = list.getLaptopName();
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
//				int n= st.executeUpdate();
//				count.add(n);
				st.executeUpdate();
				total+=1;
			}
			String q2 = "delete from Laptop where LAPTOP_NAME = ?";
			PreparedStatement ss = connection.prepareStatement(q2);
			ss.setString(1, "Apple");
			ss.executeUpdate();
			ss.close();
			st.close();
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
         return total;
	}
}    	  	      	      	 	