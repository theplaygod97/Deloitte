package com.cms.deloitte.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dbcon.DBConnection;
import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	
	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values(?,?,?,?)";
	private static final String UPDATE_CUSTOMER_QUERY = "UPDATE hr.customer SET customername = ? , "
																				+ "customeraddress = ?, "
																				+ "billamount = ? "
																				+ "WHERE customerid = ?";
	
	private static final String DELETE_CUSTOMER_QUERY = "DELETE FROM HR.customer WHERE customerid = ?";
	private static final String LIST_CUSTOMER_QUERY = "select * from hr.customer";
	private static final String FETCH_CUSTOMER = "select customername,"
													+ "customeraddress,"
													+ "billamount"
													+ " from hr.customer WHERE customerid = ?";
	
	
	@Override
	public boolean addCustomer(Customer customer) {
		int result = 0;
		Connection connection;
		
		try {
		connection = DBConnection.makeConnection();
		PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
		statement.setInt(1, customer.getCustomerId());
		statement.setString(2, customer.getCustomerName());
		statement.setString(3, customer.getCustomerAddress());
		statement.setInt(4, customer.getBillAmount());
		
		result = statement.executeUpdate();
		System.out.println(customer.getCustomerName() +" record inserted.");
		statement.close();
		connection.close();
		}
		catch(Exception e){
		e.printStackTrace();	
		} 
		
		if(result == 0)
			return false;
		else
			return true;
		
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		int result = 0;
		Connection connection;
		
		try {
		connection = DBConnection.makeConnection();
		PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
		statement.setInt(4, customer.getCustomerId());
		statement.setString(1, customer.getCustomerName());
		statement.setString(2, customer.getCustomerAddress());
		statement.setInt(3, customer.getBillAmount());
		
		result = statement.executeUpdate();
		System.out.println(customer.getCustomerName()+" ,record updated successfully.");
		statement.close();
		connection.close();
		}
		catch(Exception e){
		e.printStackTrace();	
		} 
		
		if(result == 0)
			return false;
		else
			return true;
	}

	@Override
	public boolean deleteCustomer(int ID) {
			int result = 0;
			Connection connection;
			
			try {
			connection = DBConnection.makeConnection();
			PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			statement.setInt(1, ID);
			
			
			result = statement.executeUpdate();
			System.out.println(ID+" :record deleted successfully.");
			statement.close();
			connection.close();
			}
			catch(Exception e){
			e.printStackTrace();	
			} 
			
			if(result == 0)
				return false;
			else
				return true;
		}
	

	@Override
	public List<Customer> listCustomers() {
		
		List<Customer> allcustomers = new ArrayList<Customer>();
		    Connection connection;
		    
		    try {
		    	connection = DBConnection.makeConnection();
				Statement statement = connection.createStatement();

				ResultSet rs=statement.executeQuery(LIST_CUSTOMER_QUERY);  
				ResultSetMetaData rsmd = rs.getMetaData();
				
				System.out.println(rsmd.getColumnName(1)
						+" "+rsmd.getColumnName(2)
						+" "+rsmd.getColumnName(3)
						+" "+rsmd.getColumnName(4));
				while(rs.next()) { 
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString(2));
				customer.setCustomerAddress(rs.getString(3));		
				customer.setBillAmount(rs.getInt(4));
				allcustomers.add(customer);
				}	
				statement.close();
				connection.close();
			}
		    catch(Exception e){
				e.printStackTrace();	
				} 
				
				return allcustomers;
		}

	@Override
	public Customer findCustomer(Customer customer) {
		 Connection connection;
		 
		    try {
		    	
		    	connection = DBConnection.makeConnection();
		    	PreparedStatement statement = connection.prepareStatement(FETCH_CUSTOMER);
				statement.setInt(1, customer.getCustomerId());
				
				
				ResultSet rs = statement.executeQuery();
				rs.next() ;
		
				customer.setCustomerName(rs.getString(1));
				customer.setCustomerAddress(rs.getString(2));		
				customer.setBillAmount(rs.getInt(3));
				
				statement.close();
				connection.close();
				
			}
		    catch(Exception e){
				e.printStackTrace();	
				} 
		    return customer;
		}

	@Override
	public boolean isCustomerExists(int customerId) {
		Connection connection;
		ResultSet rs;
		boolean result = false; 
	    try {
	    	
	    	connection = DBConnection.makeConnection();
	    	PreparedStatement statement = connection.prepareStatement(FETCH_CUSTOMER);
			statement.setInt(1, customerId);
			
			
			rs = statement.executeQuery();
			if(rs.next())
			result = true;
			
			statement.close();
			connection.close();
				
		}
	    catch(Exception e){
			e.printStackTrace();	
			} 
	    return result;
	}

}
