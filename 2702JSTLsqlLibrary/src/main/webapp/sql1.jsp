<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Insert title here</title>
	</head>
	<body>
		<sql:setDataSource url="jdbc:oracle:thin:@localhost:1521:xe" user="system" password="sekhar" 
		driver="oracle.jdbc.driver.OracleDriver" var="dataSource"/>
		
		<sql:query var="result" dataSource="${dataSource}">
			SELECT * FROM EMPLOYEEs
		</sql:query>
		
		<c:forEach var="row" items="${result.rows }">
			<h1>${row.emp_id}---${row.emp_name }---${row.emp_age }--${row.emp_address}</h1>
		</c:forEach>
	</body>
</html>