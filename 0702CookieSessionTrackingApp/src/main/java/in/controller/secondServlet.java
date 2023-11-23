package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/second")
public class secondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String prodQuantity = request.getParameter("pqty");
		String prodBrand = request.getParameter("pbrand");
		
		Cookie c3 = new Cookie("pqty", prodQuantity);
		Cookie c4 = new Cookie("pbrand", prodBrand);
		
		response.addCookie(c3);
		response.addCookie(c4);
		
		RequestDispatcher reqDisp = request.getRequestDispatcher("./form3.html");
		reqDisp.forward(request, response);
	}

}
