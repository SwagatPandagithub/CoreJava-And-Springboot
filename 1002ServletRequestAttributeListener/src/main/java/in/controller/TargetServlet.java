package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("The target Servlet is loaded....");
	}
	
	public TargetServlet() {
		System.out.println("Target Servlet is instantiated...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Target Servlet is Initialised...");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		request.setAttribute("Swagat", "Java Developer");
		request.setAttribute("swagat sekhar panda", "Engineer");
		request.setAttribute("swag", "Elect eng.");
		request.removeAttribute("swag");
		request.setAttribute("swagat", "Sofware Engineer");
		out.println("<h1>Demonstaration of the Servlet Request Attribute Listener....</>");
		out.close();
	}

}
