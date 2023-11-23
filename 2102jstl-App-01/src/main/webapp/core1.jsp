<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>Output</title>
	</head>
	<body>
		<c:set var="abc" value="10"/>
		<h1 style="color:blue;text-align: center">The result is :: <c:out value="${abc }"/></h1>
		
		<c:set var="x" value="10"/>
		<c:set var="y" value="20"/>
		<c:set var="z" value="${x+y}" scope="application"/>
		<h1 style="color:green;text-align: center">The Addition of x+y is :: <c:out value="${z}"/></h1>
		
		
		<c:set scope="request" var="username" value="${param.username}"/>
		<h1 style="color:red;text-align: center">The data from Query string is ::
			 <c:out value="${username}" default="iNeuron"/></h1>
			 
		<h1 style="color:red;text-align: center">The data from Query string is ::
			 <c:out value="${param.username}" default="default=iNeuron"/></h1>	 
			 
	</body>
</html>
