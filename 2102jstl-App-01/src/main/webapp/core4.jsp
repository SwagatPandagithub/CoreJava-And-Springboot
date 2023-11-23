<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Playing with Null</title>
	</head>
	<body>
	
	<%
		int[] arr={};
		java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
	%>
		<h1>${empty sachin }<br/>
		${empty "sachin" }<br/>
		${empty null }</h1><br/>
		<hr/>
	<h1>${empty arr }<br/>
		${empty al }</h1>
		<hr/>
		${10 + null}<br/>
		${!null}<br/>
		${empty null }
		
	
		
	</body>
</html>