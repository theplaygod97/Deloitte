<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="q3.jsp" >
<jsp:include page = "q2.html"></jsp:include>
<% 
	String Q1A = (String)request.getParameter("Q1A");
	session.setAttribute("Q1A",Q1A);
	out.print(request.getParameter("Q1A"));
	
%>
</form>
</body>

</html>