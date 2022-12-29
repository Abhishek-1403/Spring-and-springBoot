<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome in help page</title>
</head>
<body>
	<h1>This is help page confirmation message..</h1>

	<%-- <%
	String name = (String) request.getAttribute("name");
	Integer rollno =(Integer) request.getAttribute("rollno");
	
	Boolean status = (Boolean) request.getAttribute("status");
	LocalDateTime time  = (LocalDateTime) request.getAttribute("time");
%> --%>


	<h1>

		my name is
		<%-- <%= name %> --%>
		${name }
	</h1>
	<h1>

		my Roll.no is
		<%-- <%= rollno %> --%>
		${rollno }
	</h1>
	<h1>

		my status is
		<%-- <%= status %> --%>
		${status }
	</h1>

	<h1>
		The current time is:
		<%-- <%= time.toString() %> --%>
		${time }
	</h1>
	<hr>


	<c:forEach var="item" items="${marks }">
		<h1>${marks }</h1>
	</c:forEach>



</body>
</html>