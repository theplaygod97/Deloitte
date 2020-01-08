<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int num1; %>
<% String name = "Tufail"; 
int num2 = 200;%>
<h1>Deloitte welcome you</h1>
Printed via scriplet :<% out.println("Welcome "+name); %><br/>
Printed via expressions : <%= "Welcome "+name %><br/>

Sum of num1(Instance) + num2(Local) is : <%=num1 + num2 %><br/>

<%! int p; %> Value of P (Instance) : <%= p %>
</body>
</html>