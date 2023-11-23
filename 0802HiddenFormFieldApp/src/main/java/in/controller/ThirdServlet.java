package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String StudName = request.getParameter("studName");
		String StudAge = request.getParameter("studAge");
		String StudGender = request.getParameter("studGender");
		String StudBranch = request.getParameter("studBranch");
		String studMarks = request.getParameter("studMarks");
		String studCountry = request.getParameter("studCountry");
		
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Registration</title></head>");	
		out.println("<body bgcolor = '	#E6E6FA'>");
		out.println("<center>");
		out.println("<h1 stule = 'color:red'>Student Data</h1>");		
		out.println("<table border = '1'>");
		
		out.println("<tr><th>Student Details</th><td>Values</td></tr>");
		out.println("<tr><th>Name</th><td>"+StudName+"</td></tr>");
		out.println("<tr><th>Age</th><td>"+StudAge+"</td></tr>");
		out.println("<tr><th>Gender</th><td>"+StudGender+"</td></tr>");
		out.println("<tr><th>Branch</th><td>"+StudBranch+"</td></tr>");
		out.println("<tr><th>Marks</th><td>"+studMarks+"</td></tr>");
		out.println("<tr><th>Country</th><td>"+studCountry+"</td></tr>");
		
		
		out.println("</table>");		
		out.println("<center>");
		out.println("<body>");
		out.println("</html>");
		
		out.close();
	}

}
