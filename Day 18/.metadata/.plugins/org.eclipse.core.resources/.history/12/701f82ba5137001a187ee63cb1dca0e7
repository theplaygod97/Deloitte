<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "http://www.springframework.org/tags/form" prefix ="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>

<f:form action="saveProduct"  >
<div align="center">
<table>

<caption> <h2>Product Form</h2></caption>


<tr><td>Product Id</td><td><f:input path="productId" name="productId" id="productId"/></td></tr>

<tr><td>Product Name</td><td><f:input path="productName" name="productName" id="productName"/></td></tr>

<tr><td>Price</td><td><f:input path="price" name="price" id="price"/></td></tr>

<tr><td>QOH</td><td><f:input path="qoh" name="qoh" id="qoh"/> </td></tr>

<tr>
<td><input type="submit" value="Save"></td>

<td><input type="reset" value="Reset" /></td>

<td><input type="submit" value="Update" formaction="updateProduct"></td>

<td><input type="submit" value="Fetch" formaction="deleteProduct"></td>
</tr>

</table>
</div>
</f:form>
