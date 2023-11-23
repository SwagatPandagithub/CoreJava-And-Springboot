<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>The application Session id is :: <%=session.getId() %></h2><br/>
	<h2>The application session newly created :: <%=session.isNew() %></h2><br/>
	<h2>The application timeout time is :: <%=session.getMaxInactiveInterval() %> seconds </h2><br/>
</body>
</html>