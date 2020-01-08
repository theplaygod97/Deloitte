<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String username = (String) session.getAttribute("username"); %>

<%= username + " , below is your scores " %>
<% 
int marks ;
String A1 = (String)session.getAttribute("Q1A");
String A2 = (String)session.getAttribute("Q2A");
String A3 = request.getParameter("Q3A");




int sum=0;


%>

<table border="2">
<th>Your Answer</th>
<th>Correct Answer</th>
<th>Score</th>
<tr>
	<td><%= A1 %></td>
	<td>A</td>
	<td>
	<% 
		if(A1.equals("A")) 
		{
			sum += 10;
			out.println("10");
		}
		else
		{
			out.println("0");
		}
		%>
	</td>
</tr>
<tr>
	<td><%= A2 %></td>
	<td>B</td>
	<td>
	<% 
		if(A2.equals("B")) 
		{
			sum += 10;
			out.println("10");
		}
		else
		{
			out.println("0");
		}
		%>
	</td>
</tr>
<tr>
	<td><%= A3 %></td>
	<td>C</td>
	<td>
	<% 
		if(A3.equals("C")) 
		{
			sum += 10;
			out.println("10");
		}
		else
		{
			out.println("0");
		}
		%>
	</td>
</tr>
</table>

<h1>Your total score is : <%= sum %></h1>

</body>
</html>