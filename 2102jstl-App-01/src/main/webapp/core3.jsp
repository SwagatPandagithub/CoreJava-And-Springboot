<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>o/p</title>
	</head>
	<body>
		<c:catch var='e'>
			<jsp:scriptlet>
				Integer age=Integer.parseInt(request.getParameter("age")); 
			</jsp:scriptlet>
			<h1 style="color:green;text-align: center;">The age is :: ${request.age}</h1>
		</c:catch>
		
		<c:if test="${!empty e }">
			<h1>The exception raised is :: "${e}"</h1>
		</c:if>
		
		<h1>This line shows teh exception is handled and the remaining lines of code is working fine</h1>
	</body>
</html>