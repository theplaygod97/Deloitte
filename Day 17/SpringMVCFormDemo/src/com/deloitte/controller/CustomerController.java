package com.deloitte.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;
import com.cms.deloitte.service.CustomerService;
@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/CustSave")
	public ModelAndView saveCustomerDetails(Customer customer) 
	{
		System.out.println(customer);
		customerService.addCustomer(customer);
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
		if(customerService.isCustomerExists(ID)) {
			customerService.updateCustomer(customer);
			view.setViewName("result");
		}
		else {
			view.setViewName("error");
		}
		
		return view;
	}
	@RequestMapping("/customerDetails")
	public ModelAndView CustomerDetails(HttpSession session) 
	{
		ModelAndView view = new ModelAndView();
		view.setViewName("allCustDetailsTable");
		//view.setViewName("allCustomerRecords");
		List<Customer> allCustomers = customerService.listCustomers();
		view.addObject("allCust",allCustomers);
		session.setAttribute("allCust", allCustomers);
		return view;
	}
	@RequestMapping("/CustomerForm")
	public ModelAndView customerForm() 
	{
		System.out.println("customerForm");
		ModelAndView view = new ModelAndView();
		view.addObject("command",new Customer());
		view.setViewName("customerForm");
		return view;
	}
	@RequestMapping("/fetchCustomer")
	public ModelAndView fetchCustomer(Customer customer) 
	{
		System.out.println("fetchCustomer");
		ModelAndView view = new ModelAndView();
		Customer retrievedCustomer = customerService.findCustomer(customer.getCustomerId());
		view.addObject("command",retrievedCustomer);
		view.setViewName("customerForm");
		System.out.println(retrievedCustomer);
		return view;
	}
}