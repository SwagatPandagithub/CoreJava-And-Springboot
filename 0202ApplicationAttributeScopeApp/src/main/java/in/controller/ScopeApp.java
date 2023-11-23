package in.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ScopeApp")
public class ScopeApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		ServletContext context= getServletContext();
		context.setAttribute("name", "swagat");
		context.setAttribute("address", "Pune");
		
		out.println("<html><head><title>Attribute Data</title></head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1 style='color:blue'>Dynamic Data in Application Scope...</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>Attribute data</th><th>Attribute values</th></tr>");
		
	Enumeration<String> attributeNames=context.getAttributeNames();
	while (attributeNames.hasMoreElements()) {
		String attributeName = (String) attributeNames.nextElement();
		Object attributeValues = context.getAttribute(attributeName);
		
	//here the key value pair can be string and any object
	
	out.println("<tr>");
	out.println("<td>"+attributeName+"</td>");
	out.println("<td>"+attributeValues+"</td>");
	out.println("</tr>");
		
	}	
		out.println("</table>");
		out.println("</center>");
		out.println("<body>");
		out.println("<html>");
		out.close();
		
		
		
	}

}
