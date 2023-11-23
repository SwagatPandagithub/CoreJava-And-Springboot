package in.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("The control is in The first Servlet....");
		
		System.out.println("username entered is :: "+username+" and password is :"+password);
		
		if(username.equals("swagat") && password.equals("sekhar")) {
			
			//Request Dispatching method 1
			RequestDispatcher reqDisp = request.getRequestDispatcher("/SecondServlet");
			reqDisp.forward(request, response);
			
		}else {
			//Request dispatching method 2
			ServletContext servletContext = request.getServletContext();
			RequestDispatcher reqDisp = servletContext.getRequestDispatcher("/ThirdServlet");
			reqDisp.forward(request, response);
			
		}
		
	}

}
