<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date" session="true" isELIgnored="false" info ="Java developer " autoFlush = "true" errorPage='error.jsp'%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		public void jspInit(){
			System.out.println("JSP Initialisation Activities");			
		}
	
	%>


	<h1 style = 'color:green; text-align:center'>Working with JSP Page Directives </h1>
	<h1 style = 'color:green; text-align:center'>The Server time is :: </h1>
	<h2 style = 'color:green; text-align:center'><%=new Date() %></h2>
	<h2 style = 'color:green; text-align:center'><%=session%></h2>
	
	<h2 style = 'color:green; text-align:center'>Username is <%=request.getParameter("username") %></h2>
	<h2 style = 'color:green; text-align:center'>Accessing Username through EL syntax(--when elIgnored is true output ${param.username}):: ${param.username} </h2>
	<h2 style = 'color:green; text-align:center'>Accessing info ::(info="Swagat Applicantion")/Jasper JSP 2.3 Engine with no info :::: <%=getServletInfo() %></h2>
	
	<% 
		/* for(int i=0;i<1000000;i++){
				out.println("Java Development");
			
		}
	While working with buffer and autoFlush 
	buffer handles the data if the data is above the buffer value and autoflush is true due to autoflush it works smoothly
	if the data is above the buffer value and autoflush is false it throws exception.
	
	*/
	
		int i=10;int j=0;
		System.out.println(i/j);
	
	
	%>
	
	<%!
	
	
		public void jspDestroy(){
			System.out.println("JSP clean up Activities");
		}
	
	%>
	

</body>
</html>