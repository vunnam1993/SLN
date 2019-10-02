<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homes</title>
</head>
<body>
	<h1>Welcome To Registration</h1>
	<form action="/welcomes" method="get">
		First name: <input type="text" name="firstName"><br><br> 
		Last name: <input type="text" name="lastName"><br><br>
		Password: <input type="text" name="password"><br><br> 
		Conform Password: <input type="text" name="conformPassword"><br><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>