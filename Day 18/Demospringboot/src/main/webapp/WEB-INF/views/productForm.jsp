<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri= "http://www.springframework.org/tags/form" prefix ="f" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>

<f:form modelAttribute = "product" action = "saveProduct">
<div align="center">
<table>

<caption> <h2><b>Product Form</b></h2></caption>


<tr><td>Product Id</td><td><f:input path="productId" name="productId" id="productId"/></td></tr>

<tr><td>Product Name</td><td><f:input path="productName" name="productName" id="productName"/></td></tr>

<tr><td>Price</td><td><f:input path="price" name="price" id="price"/></td></tr>

<tr><td>QOH</td><td><f:input path="qoh" name="qoh" id="qoh"/> </td></tr>


<tr>
<td></td>
<td colspan="2">
	<c:if test="${!empty product.productName}"><input type="submit" 
	value="<spring:message
	text="Edit Product"/>"/></c:if>
							
	<c:if test="${empty product.productName}"><input type="submit" 
	value="<spring:message
	text="Save Product"/>"/></c:if>
	</td>
<td></td>
</tr>


</table>
</div>
</f:form>
<br>

<br>
<center><h2><b>Product Details</b></h2></center>
<div align="center">
<table border = 2 >
<th>Product ID</th><th>Product Name</th><th>Price</th><th>QOH</th><th>Delete Product</th><th>Update Product</th>
	<c:forEach items="${allProducts}" var="product">
	<tr>
	<td><c:out value="${product.productId }"></c:out></td>
	<td><c:out value="${product.productName }"></c:out></td>
	<td><c:out value="${product.price }"></c:out></td>
	<td><c:out value="${product.qoh }"></c:out></td>
	<td><a href ="<c:url value='/deleteProduct/${product.productId}' />">Delete</a>
	<td><a href ="<c:url value='/updateProduct/${product.productId}' />">Update</a>
	</tr>

</c:forEach>
</table>
</div>