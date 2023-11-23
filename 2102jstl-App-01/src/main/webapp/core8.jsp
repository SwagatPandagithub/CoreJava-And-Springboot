<%@ page %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>URL related tags</title>
	</head>
	<body>
		<table border="1">
			<tr>
				<th>KEY</th>
				<td>value</td>
			</tr>
			
			<c:forEach var="p" items="${param }">
				<tr>
					<th>${p.key}</th>
					<td>${p.value}</td>
				</tr>
			</c:forEach>
		</table>
		
	</body>
</html>