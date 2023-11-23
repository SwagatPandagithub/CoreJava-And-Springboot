<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>a.jsp</title>
</head>
<body>
	<jsp:include page="b.jsp"></jsp:include>
	
	<h1 style="text-align:center">Courses offered are java springboot, Microservices</h1>
	
	<jsp:include page="c.jsp"></jsp:include>
	
	<%
		float billamount = 600.0f+(300.0f*0.03f);	
	%>
	
	
	<jsp:forward page="d.jsp">
	<jsp:param value="swagat" name="customerName"/>
	<jsp:param value="<%=billamount %>" name="billamount"/>
	</jsp:forward>
</body>
</html>