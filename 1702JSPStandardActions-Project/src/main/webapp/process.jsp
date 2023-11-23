<%@ page language="java"%>

<jsp:useBean id="employeeDto" class ="in.beanDto.Employee" scope='request'/>

<jsp:setProperty name="employeeDto"  property="*"/>

<%=employeeDto %>

<jsp:useBean id="service" class="in.service.SalaryDetailsGeneratorImpl" scope="application"/>


<% 

	service.generateSalaryDetails(employeeDto);
%>

<table>
	<center>
	<caption>Employee salary details</caption>
	<tr>
		<th>Employee id</th>
		<td>
			<jsp:getProperty property="eno" name="employeeDto"/>
		</td>
	</tr>
	<tr>
		<th>Name</th>
		<td>
			<jsp:getProperty property="ename" name="employeeDto"/>
		</td>
	</tr>
	<tr>
		<th>Basic Salary</th>
		<td>
			<jsp:getProperty property="bSal" name="employeeDto"/>
		</td>
	</tr>
	<tr>
		<th>Gross Salary</th>
		<td>
			<jsp:getProperty property="gSal" name="employeeDto"/>
		</td>
	</tr>
	<tr>
		<th>net Salary</th>
		<td>
			<jsp:getProperty property="netSal" name="employeeDto"/>
		</td>
	</tr>
	<tr>
		<th></th>
		<td><a href="./index.html">|HOME PAGE|</a></td>
	</tr>
	</center>
</table>