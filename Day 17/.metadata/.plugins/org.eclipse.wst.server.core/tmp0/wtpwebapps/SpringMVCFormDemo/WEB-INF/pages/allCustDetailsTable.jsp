<%@page import="java.util.Iterator"%>
<%@page import="com.cms.deloitte.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<div align="center">
<table border="2">
<tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Bill</th>
            </tr>
<tr>
<% 
List<Customer> allCust = (List<Customer>)session.getAttribute("allCust");
Iterator<Customer> iterator = allCust.iterator();
while(iterator.hasNext()){
	Customer cust = iterator.next();
%>

<td><%= cust.getCustomerId() %></td>
<td><%= cust.getCustomerName() %></td>
<td><%= cust.getCustomerAddress() %></td>
<td><%= cust.getBillAmount() %></td>

</tr>
<% 	
}
%>
</table>
</div>
</body>
</html>