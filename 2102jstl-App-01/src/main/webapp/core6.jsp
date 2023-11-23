<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>if/else</title>
	</head>
	<body>
		<c:choose>
		
			<c:when test="${param.p>0 }">
				<h1>p ${param.p} is a positive number </h1>
			</c:when>
			
			<c:when test="${param.p<0 }">
				<h1>p ${param.p} is a negative number </h1>
			</c:when>
			
			<c:otherwise>
				<h1>p is zero </h1>
			</c:otherwise>
			
		</c:choose>
	</body>
</html>