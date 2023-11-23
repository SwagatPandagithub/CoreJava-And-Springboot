<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>URL related Tags</title>
	</head>
	<body>
		<%--Defining the URL to send the request --%>
		<c:url value="http://www.google.com" var="googleSearch" scope="request"/>
		
		<%--perform redirection --%>
		<c:redirect url="${googleSearch}"/>
	</body>
</html>