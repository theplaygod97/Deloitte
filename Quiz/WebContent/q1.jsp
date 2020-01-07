<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  action="q2.jsp" >
<center>
<%= "Welcome "+session.getAttribute("username")%><br/>
</center>
<jsp:include page = "q1.html"></jsp:include>
<% 

%>
</form>
</body>
</html>