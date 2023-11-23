package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in Servlet 1");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome to first Servlet </h1>");
		
			RequestDispatcher reqDisp= request.getRequestDispatcher("/SecondServlet");
			reqDisp.forward(request, response);
		
		out.close();
	}

}
