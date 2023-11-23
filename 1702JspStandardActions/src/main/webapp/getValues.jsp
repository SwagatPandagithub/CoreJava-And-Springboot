<%@ page language="java"%>

<h1 style = 'color:green; text-align: center'>Getting the values from the same Employee object</h1>

<jsp:useBean id="employee" class="in.jspProgs.Employee" scope='session'/>

<%--Reading values from the bean printing on the console--%>
<b>Emp_name ::<jsp:getProperty property="name" name="employee"/></b><br/>
<b>Emp_Id ::<jsp:getProperty property="id" name="employee"/></b><br/>
<b>Emp_age ::<jsp:getProperty property="age" name="employee"/></b><br/>
<b>Emp_address ::<jsp:getProperty property="address" name="employee"/></b><br/>



