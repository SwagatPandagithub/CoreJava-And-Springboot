<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>core11A.jsp</title>
</head>
<body>
	<h1>Welcome to URL related tags in JSP core 11A is linked with core 11B</h1>
		<c:import url="core11B.jsp" var="x">
			<c:param name="sub1" value="Core java"/>
			<c:param name="sub2" value="Advanced  java"/>
			<c:param name="sub3" value="Spring framework"/>
			
		</c:import>
		
		<h1>The Modified Url Is ${x}</h1>
		<a href="${x}">|click here to go the new page|</a>
</body>
</html>