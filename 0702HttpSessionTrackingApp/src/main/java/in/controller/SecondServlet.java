package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studAddress = request.getParameter("saddr");
		String studQuali = request.getParameter("squali");
		
		HttpSession session = request.getSession(false);
		session.setAttribute("Address", studAddress);
		session.setAttribute("Qualification", studQuali);
		
		RequestDispatcher reqDisp = request.getRequestDispatcher("./form3.html");
		reqDisp.forward(request, response);
	}

}
