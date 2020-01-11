<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>

	<%
		boolean result = (Boolean)session.getAttribute("result");
		String productId = request.getParameter("pid");
		String productName = request.getParameter("productname");
	%>

	<h3>The product with</h3>
	<h3>
		ID :
		<%=productId%></h3>
	<h3>
		Product Name :
		<%=productName%></h3>
		
	<%
		if(result)
			out.println("<h3>has been saved Succesfully !<h3> <a href=\"index.html\"> Back to homepage </a>");
		else
			out.println("<h3> Already Exists ! Please try again <h3> <a href=\"Store.html\">Store Product</a>");
	%>
</body>
</html>