package com.cms.deloitte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.model.Customer;
import com.cms.deloitte.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	CustomerDAO customerDAO;
	
	@Override
	public boolean addCustomer(Customer customer) {
		boolean result = true;
		if(customer.getBillAmount()>0)
			customerDAO.addCustomer(customer);
		else
			result = false;
		return result;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.deleteCustomer(customerId);
	}

	@Override
	public List<Customer> listCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.listCustomers();
	}

	@Override
	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.findCustomer(customerId);
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return customerDAO.isCustomerExists(customerId);
	}

}
