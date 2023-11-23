package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/first")
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accountNo = request.getParameter("accNo");
		String accountName = request.getParameter("accName");
		
		HttpSession session = request.getSession();
		session.setAttribute("accNo", accountNo);
		session.setAttribute("accName", accountName);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Registration</title></head>");	
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Account Registration Form</h1>");
		out.println("<form method = 'post' action = "+response.encodeURL("./second")+">");
		out.println("<table>");
		
		out.println("<tr><th>Account type</th><td><input type='text' name='accType'/></td></tr>");
		out.println("<tr><th>Account Branch</th><td><input type='text' name='accBranch'/></td></tr>");
		out.println("<tr><th></th><td><input type='submit' name='next'/></td></tr>");		
		
		out.println("</table>");		
		out.println("<form>");
		out.println("<center>");
		out.println("<body>");
		out.println("</html>");
		
		out.close();
	}

}
