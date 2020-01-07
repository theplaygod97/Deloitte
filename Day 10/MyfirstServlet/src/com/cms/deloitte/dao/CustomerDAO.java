package com.cms.deloitte.dao;
import java.util.ArrayList;
import java.util.List;

import com.cms.deloitte.model.*;
public interface CustomerDAO {

	public boolean addCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);
	public List<Customer> listCustomers();
	public Customer findCustomer(Customer customer);
	public boolean isCustomerExists(int customerId);
	
}
