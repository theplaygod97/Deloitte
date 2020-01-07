<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="q1.jsp" >
<% 	String username=request.getParameter("username");
	session.setAttribute("username", username);
%>
<form action = "q1.jsp">
<center>
<%= "Welcome "+request.getParameter("username")%><br/>
</center>
<jsp:include page = "Instruct.html"></jsp:include>
<center>
<input type="submit" value="Enter Test">
</center>
</form>
</form>
</body>
</html>