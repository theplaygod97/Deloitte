package com.cms.deloitte.dbcon;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	public static Connection makeConnection() throws IOException {
		Connection con=null;		
		try {
		Properties props = new Properties();	
		FileReader fReader = 
				new FileReader("D:\\Day 10\\MyfirstServlet\\src\\OracleHRSQLDB.properties");
		props.load(fReader);
		String Driver = props.getProperty("driver");
		String ConnUrl = props.getProperty("url");
		String UserName = props.getProperty("username");
		String Password = props.getProperty("password");
		
		//Load Driver ojdbc14.jar
		Class.forName(Driver);  
		//System.out.println("Driver Loaded");  
				
		//Create connection
		con=DriverManager.getConnection(  
		ConnUrl,UserName,Password);  
		//System.out.println("Connected");
			
		}
		catch(ClassNotFoundException e){
		e.printStackTrace();
		
		}
		catch(SQLException e) {
		
		e.printStackTrace();
		}
		return con;
	}

}
