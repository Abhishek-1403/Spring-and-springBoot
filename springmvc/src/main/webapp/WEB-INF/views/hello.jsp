<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>This is  My First JSP ANd Spring MVC Home page</h1>
	<h1>This is Home page</h1>
	<h1>This is Home page</h1>
	
	
	<%
		String name= (String) request.getAttribute("name");
	
	%>
	<h1> My name is <%= name %></h1>
</body>
</html>