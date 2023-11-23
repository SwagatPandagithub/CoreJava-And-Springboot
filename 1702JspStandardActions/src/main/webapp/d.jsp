<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>d.jsp</title>
</head>
<body>
	<h1 style="color:violet;text-align:center" >from d.jsp file getting forwarded from a.jsp  </h1>
		customer name:: <%=request.getParameter("customerName") %><br/>
		bill Amount  :: <%=request.getParameter("billamount") %>
</body>
</html>