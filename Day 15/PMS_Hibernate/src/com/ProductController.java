package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Product;


/**
 * Servlet implementation class ProductController
 */

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	Configuration configuration = null;
	SessionFactory factory =null;
    public ProductController() {
        // TODO Auto-generated constructor stub
    	configuration = new Configuration().configure();
		factory = configuration.buildSessionFactory();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName =request.getParameter("productName");
		int price = Integer.parseInt(request.getParameter("price"));
		int qoh = Integer.parseInt(request.getParameter("qoh"));
		
		
		Product product = new Product(productId, productName, price, qoh);
		HttpSession session = request.getSession();
		session.setAttribute("proDetails",product);
		
		Session sess = factory.openSession();
		Transaction transaction = sess.beginTransaction();
		
		sess.save(product);
		transaction.commit();
		sess.close();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("CNC.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
