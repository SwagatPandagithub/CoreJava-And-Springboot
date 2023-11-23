package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String productName = request.getParameter("pname");
			String productCost = request.getParameter("pcost");
			
			Cookie c1 = new Cookie("pname",productName);
			Cookie c2 = new Cookie("pcost", productCost);
			
			response.addCookie(c1);
			response.addCookie(c2);
			
			RequestDispatcher reqDisp = request.getRequestDispatcher("./form2.html");
			reqDisp.forward(request, response);
		
		
	}

}
