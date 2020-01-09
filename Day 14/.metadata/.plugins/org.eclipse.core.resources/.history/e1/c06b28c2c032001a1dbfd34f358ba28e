package com.cms.deloitte.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dbcon.DBConnection;
import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {


	private static final String INSERT_CUSTOMER_QUERY ="insert into hr.customer values(?,?,?,?) ";
	

	private static final String UPDATE_CUSTOMER_QUERY ="update hr.customer set customerName=?,customerAddress=?,billAmount=? where customerId=? ";
	private static final String DELETE_CUSTOMER_QUERY ="delete from hr.customer where customerId=?";
	private static final String FETCH_CUSTOMER_QUERY ="select * from hr.customer ";

	private static final String FETCH_SINGLE_CUSTOMER_QUERY ="select * from hr.customer where customerId =? ";
	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		int result=0;
		Connection connection;
		try {
			connection = DBConnection.makeConnection();
			PreparedStatement Statement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
			Statement.setInt(1, customer.getCustomerId());
			Statement.setString(2, customer.getCustomerName());
			Statement.setString(3, customer.getCustomerAddress());
				Statement.setInt(4, customer.getBillAmount());
				result=Statement.executeUpdate();

		} 
		catch(SQLException e)
		{
			e.printStackTrace();
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		if(result==0)
		return false;
		else
			return true;
		
		
		
		
		
	}

	@Override
	public boolean updateCustomer(Customer customer)   {
		// TODO Auto-generated method stub
		
		int result=0;
		
		Connection connection;
		try {
			connection = DBConnection.makeConnection();
	
			PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
			statement.setString(1, customer.getCustomerName());
			statement.setString(2, customer.getCustomerAddress());
			statement.setInt(3, customer.getBillAmount());
			statement.setInt(1, customer.getCustomerId());
			result=statement.executeUpdate();
			
		}
		
catch(SQLException e)
		{
	e.printStackTrace();
		}
		 catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		if(result==0)
			return false;
		else
			return true;
		
		
	
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub

		int result=0;
		
		
		Connection connection;
		try {
			connection = DBConnection.makeConnection();

			PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			
			statement.setInt(1, customerId);
			result=statement.executeUpdate();
			
		}
catch(SQLException e)
		{
	e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		if(result==0)
			return false;
		else
			return true;
			}

	@Override
	public List<Customer> listCustomers()  {
		// TODO Auto-generated method stub
		
		Connection connection;
		
		List<Customer> allCustomers=new ArrayList<Customer>();
		try {
			connection = DBConnection.makeConnection();
			

Statement statement =connection.createStatement();

ResultSet res = statement.executeQuery(FETCH_CUSTOMER_QUERY);

while(res.next())
{
	Customer customer= new Customer();
	customer.setCustomerId(res.getInt(1));
	customer.setCustomerName(res.getString(2));
	customer.setCustomerAddress(res.getString(3));
	customer.setBillAmount(res.getInt(4));
	allCustomers.add(customer);
	

}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allCustomers;
	}

	@Override
	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		
		Customer  customer= new Customer();
		
		Connection connection;
		try {
			connection = DBConnection.makeConnection();
			PreparedStatement statement= connection.prepareStatement(FETCH_SINGLE_CUSTOMER_QUERY);
			
			statement.setInt(1, customerId);
			ResultSet res=statement.executeQuery();
			
			res.next();
	customer.setCustomerId(res.getInt(1));
	customer.setCustomerName(res.getString(2));

	customer.setCustomerAddress(res.getString(3));
customer.setBillAmount(res.getInt(4));
 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
		
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub

		
		boolean recordExists= false;
		Connection connection;
		try {
			connection = DBConnection.makeConnection();
			PreparedStatement statement= connection.prepareStatement(FETCH_SINGLE_CUSTOMER_QUERY);
			
			statement.setInt(1, customerId);
			ResultSet res=statement.executeQuery();
			
			if(res.next())
			{
				recordExists=true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordExists;
		
	}

}
