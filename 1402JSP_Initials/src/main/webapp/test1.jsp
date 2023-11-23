<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The Request Method is ::<%=	request.getMethod()%></br>
	The Request Parameter is ::<%=	request.getParameter("username")%></br>
	Client Ip is ::<%=	request.getRemoteAddr()%></br>
	Context type is ::<%=	request.getContentType()%></br>
</body>
</html>