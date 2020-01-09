package com.cms.deloitte.dao;
import java.util.ArrayList;
import java.util.List;

import com.cms.deloitte.model.*;
public interface CustomerDAO {

	public boolean addCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);
	public List<Customer> listCustomers();
	public boolean isCustomerExists(int customerId);
	public List<Customer> filterCustomers(String customerAddress, int billAmount);
	public List<Customer> filterCustomers(int billAmount);
	public Customer findCustomer(int customerId);
	
}
