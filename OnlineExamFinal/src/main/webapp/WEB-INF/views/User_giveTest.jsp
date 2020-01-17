<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Begin Test</title>

<style type="text/css">
	th{
		width: 500px;		
	}
</style>
</head>
<body align="center" style='background: linear-gradient(90deg, #eacda3 4%, #d6ae7b 100%);background-repeat: repeat-y';>
<h5 align="right"><%= session.getAttribute("username") %></h5>
	<form action="user_SubmitTest">
		<h2 align="center">Test</h2>
		<table align="center">

			<c:forEach items="${allQuestions}" var="qn" varStatus="it">
				<tr>
					<th align="left" style="text-decoration: underline;">QUESTION ${it.count}</th>
				</tr>

				<tr>
					<th align="left"><c:out value="${qn.question}"></c:out></th>
				</tr>

				<tr>
					<th align="left"><input type="radio" name="qn${it.count}"
						value='A' required>
					<c:out value="${qn.questionChoice1}"></c:out></th>
				</tr>

				<tr>
					<th align="left"><input type="radio" name="qn${it.count}"
						value='B' required>
					<c:out value="${qn.questionChoice2}"></c:out></th>
				</tr>

				<tr>
					<th align="left"><input type="radio" name="qn${it.count}"
						value='C' required>
					<c:out value="${qn.questionChoice3}"></c:out></th>
				</tr>
			
				<tr>
					<th style="height: 5px; background-color: black;"></th>
				</tr>
				<input type="hidden" name="answer${it.count}"
						value='<c:out value="${qn.questionAnswer}" ></c:out>' />
			</c:forEach>
		</table>
		<br><br>
		<input type="submit" value="SUBMIT ANSWERS" align = "center">
		<br><br>
	</form>

</body>
</html>