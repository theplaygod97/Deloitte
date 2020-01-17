<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript">
	function validate() {

		var adminEmail = document.getElementById("adminEmail").value;
		var adminPassword = document.getElementById("adminPassword").value;

		adminEmail=adminEmail.toUpperCase();
		adminPassword=adminPassword.toUpperCase();
		
		if ((adminEmail == "ADMIN") && (adminPassword == "ADMIN")) 
		{
			return true;
		}
		else
		{
			alert("Only Admin allowed ... ");
			return false;
		}
			
	}
</script>
</head>
<body style='background: linear-gradient(-90deg, #2C3E50 4%, #FD746C 100%);background-repeat: repeat-y';>
	
	<form onsubmit="return validate()" align="center">
		<img src="img/adminlogin.jpg" height="100" width="300" align="middle"/>
		<table align="center" cellspacing="4" cellpadding="4">

			<tr>
				<td>Email</td>
				<td><input name="adminEmail" id="adminEmail" required></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input name="adminPassword" type="password"
					id="adminPassword" required></td>
			</tr>
		
			<td align="center" colspan="2"><input type="submit" value="Log in"
				formaction="admin_welcome"></td>
		</table>
	</form>
</body>
</html>
