<%@ page language="java" %>
<jsp:useBean id="employee" class="in.jspProgs.Employee" scope='session'/>


<h1 style = 'color:green; text-align: center'>Setting the values from the same Employee object</h1>

<jsp:setProperty name="employee" property="name" value="mubas@7699"/>
<jsp:setProperty name="employee" property="id" value="10"/>
<jsp:setProperty name="employee" property="address" value="Pune"/>
<jsp:setProperty name="employee" property="age" value="25"/>

	<h1><%=employee %></h1>
	
<h1>
	The square of 5 is <%=employee.square(5) %><br/>
	The square of 6 is <%=employee.square(6) %>	
</h1>

<%--Setting the request parameter values to the employee object through Query String --%>

<jsp:setProperty name="employee" property="name" param="name"/>
<jsp:setProperty name="employee" property="id" param="id"/>
<jsp:setProperty name="employee" property="address" param="address"/>
<jsp:setProperty name="employee" property="age" param="age"/>

	<h1><%=employee %></h1>
	
	
	<%--if java bean proporties and request parameter names are same then map the proporties with a '*' --%>
	<jsp:setProperty name="employee" property="*" />
	<h1 style='color:green'>Using * with request parameter the setter methods in the bean class is getting called automatically <%=employee %></h1>