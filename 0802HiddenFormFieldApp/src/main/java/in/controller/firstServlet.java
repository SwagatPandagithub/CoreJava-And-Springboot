package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studName = request.getParameter("studName");
		String studAge = request.getParameter("studAge");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Registration</title></head>");	
		out.println("<body bgcolor = '#E0FFFF'>");
		out.println("<center>");
		out.println("<h1 style = 'color:green' >Student Registration Form</h1>");
		out.println("<form method = 'post' action = './second'>");
		out.println("<input type = 'hidden' name = 'studName' value = '"+studName+"'>");
		out.println("<input type = 'hidden' name = 'studAge' value = '"+studAge+"'>");
		
		out.println("<table>");
		
		out.println("<tr><th>Student Gender</th><td><input type='text' name='studGender'/></td></tr>");
		out.println("<tr><th>Student Branch</th><td><input type='text' name='studBranch'/></td></tr>");
		out.println("<tr><th></th><td><input type='submit' name='next'/></td></tr>");		
		
		out.println("</table>");		
		out.println("<form>");
		out.println("<center>");
		out.println("<body>");
		out.println("</html>");
		
		out.close();
		
	}

}
