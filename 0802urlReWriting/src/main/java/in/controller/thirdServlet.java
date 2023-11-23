package in.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/third")
public class thirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String DipositorName = request.getParameter("depName");
		String DipositorAmount= request.getParameter("depAmount");
		
		HttpSession session = request.getSession();
		session.setAttribute("depName", DipositorName);
		session.setAttribute("depAmount", DipositorAmount);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Registration</title></head>");	
		out.println("<body bgcolor='pink'>");
		out.println("<center>");
		out.println("<h1>Account Registration Form Details....</h1>");
		out.println("<table border = '1'>");
		out.println("<tr><th>NAMES</th><th>VALUES</th></tr>");
		
		Enumeration<String> attributes=session.getAttributeNames();
		while(attributes.hasMoreElements()) {
			String attributeName = attributes.nextElement();
			Object attributeValue = session.getAttribute(attributeName);
			
			out.println("<tr>");
			out.println("<td>"+attributeName+"</td>");
			out.println("<td>"+attributeValue+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");		
	
		out.println("<center>");
		out.println("<body>");
		out.println("</html>");
		
		out.close();
	}

}
