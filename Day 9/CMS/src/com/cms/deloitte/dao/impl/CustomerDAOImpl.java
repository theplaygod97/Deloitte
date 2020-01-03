package com.cms.deloitte.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dbcon.DBConnection;
import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	
	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customer values(?,?,?,?)";
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

}