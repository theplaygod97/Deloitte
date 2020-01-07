package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConfirmProductServlet
 */
public class ConfirmProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String selectedItems[] = req.getParameterValues("item");
    	HttpSession session = req.getSession();
    	String str = (String) session.getAttribute("CurrentBuyer");
    	PrintWriter out=resp.getWriter();
		if(selectedItems == null) {
			out.println(str+"Please select products");
			out.println("GO BACK,<a href='Item.html'>SHOP</a>");
		}else {
		out.println(str+" have selected following products");
		for(String product : selectedItems) {
			out.println(product);
			out.println();
		}
		}
    	
    }

}
