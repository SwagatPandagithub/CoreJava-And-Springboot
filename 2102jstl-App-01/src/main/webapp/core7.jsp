<%@page  import ="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Looping in JSP using JSTL</title>
	</head>
	<body>
<%--Traditional For loop demo --%>
		<table border="1" style="text-align: center">
			<c:forEach var="i" begin="1" end="10" step="1">
				<tr>
					<td>2 * ${i}</td>				
					<td>${2 * i}</td>				
				
				</tr>
			</c:forEach>
		</table>
		<hr/>
<%--enhanced for loop playing with objects --%>

<% 
	String names[] = {"kohli","Dhoni","gill","jadeja","rohit"};
	request.setAttribute("names",names);
	
	List<String> stringList = new ArrayList<String>();
	
	stringList.add("RCB");
	stringList.add("MI");
	stringList.add("CSK");
	stringList.add("RR");
	stringList.add("GT");
	
	request.setAttribute("stringList", stringList);
	
%>

	<c:forEach var="name" items="${names }">
		<h1>name is :: ${name}</h1>	
	</c:forEach>
	<hr/>
		
	<c:forEach var="team" items="${stringList }">
		<h1>Teams are :: ${team}</h1>	
	</c:forEach>
		
	</body>
</html>