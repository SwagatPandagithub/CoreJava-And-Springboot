package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.listener.ServletRequestListener;


@WebServlet("/test")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("TargetServlet.class file is loading...");
	}
	
	public TargetServlet(){
		System.out.println("TargetServlet constructor to instantiate  the test servlet object");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("TargetServlet.init() to initialise the servlet obejct...");
		
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>The number of hits to the application is "+ServletRequestListener.count+"</h1>");
		System.out.println("Request processign logic in doGet method");
		System.in.read();
		out.close();
	}

}
