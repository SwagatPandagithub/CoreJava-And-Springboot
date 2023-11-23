package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in Servlet 2");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>2nd Servlet</h1></br>");
		out.println("<h1>Welcome to Second Servlet....redirected from the first Servlet</h1>");
		
		out.close();
	}

}
