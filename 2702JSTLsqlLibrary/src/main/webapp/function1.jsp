<%@ page isELIgnored="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>JSTL Function library</title>
	</head>
	<body>
		<c:set var="data" value="Hello and Welcome to JSTL library and it is very easy....."/>
		
		<h1 style="color:green; text-align:center;">
			
			Data :: ${data}<br/>
			length of data :: ${fn:length(data) }<br/>
			does data contains Welcome?? :: ${fn:contains(Welcome) }<br/>
			does data starts with Hello ?? :: ${fn:startsWith(data,"Hello") }<br/>
			does data ends with easy ?? :: ${fn:startsWith(data,"easy") }<br/>
			data. toUppercase  :: ${fn:toUpperCase(data)) }<br/>
			data. toLowercase  :: ${fn:toLowerCase(data)) }<br/>
			data. Substring  :: ${fn:substring(data,3,19) }<br/>
		</h1>
	</body>
</html>