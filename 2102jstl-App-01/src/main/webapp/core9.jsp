<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>url related tags</title>
</head>
<body>
	<c:forTokens items="kohli.gill.dhoni.rohit.sachin" delims="." var="name">
		<h1>The names are :: ${name}</h1>
	</c:forTokens>

	<c:forTokens items="kohli$gill$dhoni$rohit$sachin" delims="$" var="team">
		<h1>The names are :: ${team}</h1>
	</c:forTokens>
</body>
</html>