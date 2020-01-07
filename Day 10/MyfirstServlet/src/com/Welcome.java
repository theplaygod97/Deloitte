package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void display() {
    	System.out.println("Display called");
    }
    public void init() {
    	System.out.println("INIT Called");
    }
    int counter =0;
    String in = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
    		ServletContext context = config.getServletContext();
    		in = context.getInitParameter("ItemName");
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	counter++;
   	response.getWriter().println("<h1>DOPOST Called</h1>");
   	response.getWriter().println("<h1>ITEM NAME </h1>"+in);
   	System.out.println("DOPOST Called");
    String usern =
    		 request.getParameter("username"); String pass =
    		 request.getParameter("password");
    		
    		  response.getWriter().println("<h1>Welcome to my Website</h1>");
    		  response.getWriter().println("<h1>Visitor ID : "+counter+"</h1>");
    		  response.getWriter().println("<h1>Username : "+usern+"</h1>");
    		  response.getWriter().println("<h1>Password : "+pass+"</h1>");
    		  response.getWriter().println(); response.getWriter().println();
    		  response.getWriter().println(); response.getWriter().println();
    		 
    		  response.getWriter().println(); response.getWriter().println();
    		  response.getWriter().println(); response.getWriter().println();
    		  response.getWriter().println("<a href = 'Customer Form.html'>Query");
   	
    }

	/*
	 * @Override protected void doGet(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * counter++; response.getWriter().println("<h1>DOGET Called</h1>");
	 * System.out.println("DOGET Called"); String usern =
	 * request.getParameter("username"); String pass =
	 * request.getParameter("password");
	 * 
	 * 
	 * 
	 * response.getWriter().println("<h1>Welcome to my Website</h1>");
	 * response.getWriter().println("<h1>Visitor ID : "+counter+"</h1>");
	 * response.getWriter().println("<h1>Username : "+usern+"</h1>");
	 * response.getWriter().println("<h1>Password : "+pass+"</h1>");
	 * response.getWriter().println(); response.getWriter().println();
	 * response.getWriter().println(); response.getWriter().println();
	 * 
	 * response.getWriter().println(); response.getWriter().println();
	 * response.getWriter().println(); response.getWriter().println();
	 * response.getWriter().println("<a href = 'Customer Form.html'>Login"); }
	 */
	
	  protected void service(HttpServletRequest request,HttpServletResponse
	  response) throws ServletException,IOException{ counter++;
	  System.out.println("Service Called"); 
	  response.getWriter().println("<h1>ITEM NAME </h1>"+in);
	  String usern =
	  request.getParameter("username"); String pass =
	  request.getParameter("password");
	  
	  
	  
	  response.getWriter().println("<h1>Welcome to my Website</h1>");
	  response.getWriter().println("<h1>Visitor ID : "+counter+"</h1>");
	  response.getWriter().println("<h1>Username : "+usern+"</h1>");
	  response.getWriter().println("<h1>Password : "+pass+"</h1>");
	  response.getWriter().println(); response.getWriter().println();
	  response.getWriter().println(); response.getWriter().println();
	  
	  response.getWriter().println(); response.getWriter().println();
	  response.getWriter().println(); response.getWriter().println();
	  response.getWriter().println("<a href = 'DisplayGETPOST'>Query"); }
	 
    
    @Override
    public void destroy() {
    	System.out.println("Destroyed Called");
    }
}
