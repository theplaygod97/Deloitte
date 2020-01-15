<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "http://www.springframework.org/tags/form" prefix ="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>

<f:form action="CustSave.do" commandName="command">
<div align="center">
<table>

<caption> <h2>Customer Form</h2></caption>


<tr><td>Customer Id</td><td><f:input path="customerId" name="customerId" id="customerId"/></td></tr>

<tr><td>Customer Name</td><td><f:input path="customerName" name="customerName" id="customerName"/></td></tr>

<tr><td>Customer Address</td><td><f:input path="customerAddress" name="customerAddress" id="customerAddress"/></td></tr>

<tr><td>Bill Amount</td><td><f:input path="billAmount" name="billAmount" id="billAmount"/> </td></tr>

<tr><td><input type="submit" value="Save"></td><td><input type="reset" value="Reset" /></td>

<td><input type="submit" value="Update" formaction="updateCustomer.do"></td>

<td><input type="submit" value="Fetch" formaction="fetchCustomer.do"></td>
</tr>

</table>
</div>
</f:form>
