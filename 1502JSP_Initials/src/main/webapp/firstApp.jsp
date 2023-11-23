<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	the below line copies the contents of second.jsp file into first.jsp file using "include file"
	<%@ include file ='SecondApp.jsp' %>
	
	<h1>This is the control in FirstApp</h1>
	
	the below line forwards/includes the contents of second.jsp file into first.jsp file using "pageContext.include("second.jsp")"
	<%// pageContext.forward("SecondApp.jsp"); 
	
	pageContext.include("SecondApp.jsp");%>
</body>
</html>