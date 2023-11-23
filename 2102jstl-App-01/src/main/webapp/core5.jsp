<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Conditional Tags</title>
	</head>
	<body>
	<c:set var="x" value="10" scope="page"/>
		<c:if test="${x eq 10 }" var="y" scope="application" />
		
		<h1 style="color:green;text-align: center;">
		the value of x is :: ${x}<br/>
		the result is :: ${y}
		</h1>
	</body>
</html>