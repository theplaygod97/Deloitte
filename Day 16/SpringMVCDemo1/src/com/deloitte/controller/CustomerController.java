package com.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;
@Controller
public class CustomerController {
	
	@Autowired
	CustomerDAO customerDAO ;
	
	@RequestMapping("/CustSave")
	public ModelAndView saveCustomerDetails(Customer customer) 
	{
		System.out.println(customer);
		customerDAO.addCustomer(customer);
		ModelAndView view = new ModelAndView();
		view.setViewName("result");
		view.addObject("custo", customer);
		return view;
	}
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomerDetails(Customer customer) 
	{
		int ID = customer.getCustomerId();
		ModelAndView view = new ModelAndView();
		view.addObject("custoupd", customer);
		if(customerDAO.isCustomerExists(ID)) {
			customerDAO.updateCustomer(customer);
			view.setViewName("result");
		}
		else {
			view.setViewName("error");
		}
		
		return view;
	}
}
