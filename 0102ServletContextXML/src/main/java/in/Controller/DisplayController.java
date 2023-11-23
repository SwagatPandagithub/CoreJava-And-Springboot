package in.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		PrintWriter out=response.getWriter();
		System.out.println("available for display");
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1 style='color:green;'>Context Paaramater Information</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>Context Parameter name</th><th>Context Parameter Value</th></tr>");
		
			ServletContext context=getServletContext();
			Enumeration<String> paramaternames= context.getInitParameterNames();
			while (paramaternames.hasMoreElements()) {
				String parameterName=(String) paramaternames.nextElement();	
				String parameterValue=context.getInitParameter(parameterName);
				out.println("<tr>");
				out.println("<td>"+parameterName+"</td>");
				out.println("<td>"+parameterValue+"</td>");
				out.println("</tr>");
			}
			
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
		
	

}
