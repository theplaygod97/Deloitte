<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="result.jsp">
<jsp:include page = "q3.html"></jsp:include>
<% 
String Q2A = (String)request.getParameter("Q2A");
session.setAttribute("Q2A",Q2A);
out.print(request.getParameter("Q2A"));
%>
</form>
</body>
</html>