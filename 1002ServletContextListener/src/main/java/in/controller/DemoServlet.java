package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   static {
	   System.out.println("DemoServlet Class is Loading...");
	   
   }
   
    public DemoServlet() {
    	System.out.println("DemoServlet Class is Instantiated...");
       
    }
    
    @Override
    public void init() throws ServletException {
    	System.out.println("DemoServlet Class is initialised...");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DemoSevlet Class Processing logic DoGet method starts.....");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Demonstrating the Context Listener Application</h1>");
		out.close();
	}

	
}
