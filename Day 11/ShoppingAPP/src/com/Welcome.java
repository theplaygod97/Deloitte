package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//String password=request.getParameter("password");
		String username = request.getParameter("username");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		session.setAttribute("currentBuyer", username);
		
		out.println("<h1>Successfully authenticated");
		out.println("<h1>welcome ,:"+username);
		out.println("<h1><a href = 'Item.html'>Select Products</a>");
		
		
		
		
}

}
