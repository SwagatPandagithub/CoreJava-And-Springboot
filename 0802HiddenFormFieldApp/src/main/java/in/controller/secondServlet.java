package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/second")
public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@Override
   	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String StudName = request.getParameter("studName");
		String StudAge = request.getParameter("studAge");
		String StudGender = request.getParameter("studGender");
		String StudBranch = request.getParameter("studBranch");
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Registration</title></head>");	
		out.println("<body bgcolor='#EE82EE'>");
		out.println("<center>");
		out.println("<h1 style ='color:green' >Student Registration Form</h1>");
		out.println("<form method = 'post' action = './third'>");
		out.println("<input type = 'hidden' name = 'studName' value = '"+StudName+"'>");
		out.println("<input type = 'hidden' name = 'studAge' value = '"+StudAge+"'>");
		out.println("<input type = 'hidden' name = 'studGender' value = '"+StudGender+"'>");
		out.println("<input type = 'hidden' name = 'studBranch' value = '"+StudBranch+"'>");
		
		out.println("<table>");
		
		out.println("<tr><th>Student Marks</th><td><input type='text' name='studMarks'/></td></tr>");
		out.println("<tr><th>Student country</th><td><input type='text' name='studCountry'/></td></tr>");
		out.println("<tr><th></th><td><input type='submit' name='next'/></td></tr>");		
		
		out.println("</table>");		
		out.println("<form>");
		out.println("<center>");
		out.println("<body>");
		out.println("</html>");
		
		out.close();
		
		
	}

}
