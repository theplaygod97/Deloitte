<%@ page import = "java.util.*,java.io.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Date now= new Date(); %>
<h1> Server date and time is : <%=now %> </h1>

<% 
   	String name = request.getParameter("name");
	String colors[] = request.getParameterValues("color");
   if (colors == null) {
	   out.println ("<b><u>No color selected<u><b>");
   }else
   {
      for (String c : colors) 
      {
         out.println ("<font color ="+c+">Hello "+name+"<br/>");
         
      }
   }
%>

</body>
</html>