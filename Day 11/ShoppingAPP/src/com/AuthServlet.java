package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("username");
		//String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.println("Authentication Successful!");
		if(userName.equals("Admin")) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("AdminServlet");
			dispatcher.include(request, response);
		}
		else if(userName.equals("Guest")){
			RequestDispatcher dispatcher=request.getRequestDispatcher("GuestName");
			dispatcher.include(request, response);	
		}else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("Welcome");
			dispatcher.include(request, response);	
	}
		Cookie allCookies[] = request.getCookies();
		boolean alrVisited = false;
		if(allCookies!=null) {
			for(Cookie c :allCookies) {
			if(c.getName().equals(userName)) {
				alrVisited = true;
				break;
			}
		}
		}
		out.println("<h1>Successfully authenticated");
		
		if(!alrVisited) {
			out.println("<h1>Welcome,you are the first time visitor , :"+userName);
			Cookie cookie = new Cookie(userName,userName);
			response.addCookie(cookie);
			System.out.println("Cookie Set");
		}else {
			out.println("Welcome,u have visited already");
		}
		
		out.println("<h1><form action = 'Welcome'>");
		out.println("<h1>Wife name : <input type = 'text' name = 'wifeName'>");
		out.println("<h1><input type = 'hidden' name = 'username' value = "+userName+">");
		out.println("<h1><input type = 'submit' value = 'Enter'>");
		out.println("<h1></form>");
		
		
		
}
}