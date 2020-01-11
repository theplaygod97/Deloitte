<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import = "java.util.List,com.Product,com.deloitte.pms.dao.ProductDAO , com.deloitte.pms.dao.impl.ProductDAOImpl ,java.util.ArrayList "  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List all</title>
<style>
	table , th , td {
		border: 1px solid red;
	}
</style>

</head>
<body align = "center">

<%
	ProductDAO productDAO = new ProductDAOImpl();
	List<Product> allProduct = new ArrayList<Product>();
	allProduct = productDAO.listProduct();
%>

<table align = "center">

	<tr>
		<th>ID</th>
		<th>name</th>
		<th>price</th>
		<th>qty</th>
	</tr>

	<%
		for(Product p : allProduct){
		
			out.println("<tr>");
			out.println("<td>"+p.getProductId()+"</td>");
			out.println("<td>"+p.getProductName()+"</td>");
			out.println("<td>"+p.getPrice()+"</td>");
			out.println("<td>"+p.getQoh()+"</td>");
			out.println("</tr>");
	}
	%>
</table>

<a href="index.html">Back to homepage</a>

</body>
</html>