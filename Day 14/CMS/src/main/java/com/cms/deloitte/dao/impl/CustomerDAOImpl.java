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

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import org.hibernate.criterion.Restrictions;

import com.cms.deloitte.dao.CustomerDAO;

import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	Configuration configuration =null;
	SessionFactory factory = null;
	
public CustomerDAOImpl() {
	configuration = new Configuration().configure().addAnnotatedClass(Customer.class);
	factory = configuration.buildSessionFactory();
}

	public boolean addCustomer(Customer customer) {
		
		org.hibernate.Session session = factory.openSession();
		
		Transaction transcation = session.beginTransaction();
		session.save(customer);
		transcation.commit();
		return false;
	}


	public boolean updateCustomer(Customer customer) {
		org.hibernate.Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();		
		session.close();	
		return false;
	}


	public boolean deleteCustomer(int customerId) {
	org.hibernate.Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		Customer customer= new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();		
		return false;
	}

	
	public List<Customer> listCustomers() {
		
		org.hibernate.Session session = factory.openSession();		
		Query query = session.createQuery("from Customer");
		return query.list();
	}
	

	public List<Customer> filterCustomers(int billAmount) {
		org.hibernate.Session session = factory.openSession();
		Query query = session.createQuery
				("select c.customerName from Customer c where c.billAmount > "+billAmount);
		return query.list();
	}
	
	

	public List<Customer> filterCustomers(String customerAddress,int billAmount) {
		org.hibernate.Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("customerAddress",customerAddress));
		criteria.add(Restrictions.gt("billAmount", billAmount));
		
		return criteria.list();
	}


	public Customer findCustomer(int customerId) {
		org.hibernate.Session session = factory.openSession();
		Customer customer =	(Customer)session.get(Customer.class, customerId);
		session.close();
		return customer;
	}

	
	public boolean isCustomerExists(int customerId) {
		org.hibernate.Session session = factory.openSession();
		Customer customer =	(Customer)session.get(Customer.class, customerId);
		session.close();
			if (customer==null){	
				return false;
			}
			else {			
				return true;
			}
						
	}

	
		

}
