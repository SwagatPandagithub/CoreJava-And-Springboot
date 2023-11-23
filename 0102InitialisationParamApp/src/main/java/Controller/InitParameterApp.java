package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitParameterApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<center><h1>Initialisation Parameters</h1></center><br/>");
		out.println("<table border='1' align=center>");
		out.println("<tr><th>Parameter Name</th><th>Parameter values</th><tr>");
		Enumeration<String> parameterNames=getInitParameterNames();
		
		while(parameterNames.hasMoreElements()) {
			String parameterName = parameterNames.nextElement();
			String parameterValues = getInitParameter(parameterName);
			
			out.println("<tr><th>"+parameterName+"</th><th>"+parameterValues+"</th></tr>");
		}
		out.println("<table>");
		
		out.close();
	}

}
