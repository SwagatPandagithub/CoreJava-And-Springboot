package in.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Control in Servlet 2");		
		PrintWriter out = response.getWriter();
		String name="";
		Enumeration<String> cursor = request.getAttributeNames();
		while(cursor.hasMoreElements()) {
			name = cursor.nextElement();
			out.println("<h1>"+name+"</h1>");
		}
		out.close();
		
	}

}
