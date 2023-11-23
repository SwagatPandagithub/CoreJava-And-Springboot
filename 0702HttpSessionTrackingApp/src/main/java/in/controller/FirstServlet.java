package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studName = request.getParameter("sname");
		String studAge = request.getParameter("sage");
		
		HttpSession session = request.getSession();		
		session.setAttribute("Student Name",studName);
		session.setAttribute("Age", studAge);
		
		RequestDispatcher reqDisp= request.getRequestDispatcher("./form2.html");
		reqDisp.forward(request, response);
		
		
	}

}
