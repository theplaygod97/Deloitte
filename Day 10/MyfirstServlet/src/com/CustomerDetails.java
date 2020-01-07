package com;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

/**
 * Servlet implementation class CustomerDetails
 */
public class CustomerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    int customerid = Integer.parseInt(request.getParameter("customerId"));
	String customername = request.getParameter("customerName");
	String customeradd = request.getParameter("customerAddress");
	int bill = Integer.parseInt(request.getParameter("billAmount"));
	
	Customer customer = new Customer(customerid,customername,customeradd,bill);
	CustomerDAO customerDAO = new CustomerDAOImpl() ;
	if(customerDAO.isCustomerExists(customerid)) {
		
		response.getWriter().println(customerid + " already exists.");
	}
	else {
		customerDAO.addCustomer(customer);
		response.getWriter().println(customername+" saved successfully.");
	}
	
    }
}
