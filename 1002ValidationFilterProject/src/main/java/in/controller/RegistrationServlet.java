package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.dao.EmployeeDaoImpl;
import in.dao.IEmployeeDao;
import in.dto.Employee;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		String eage = request.getParameter("eage");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		
		
		IEmployeeDao dao = new EmployeeDaoImpl();
		Employee employee = new Employee();
		employee.setEid(eid);
		employee.setEname(ename);
		employee.setEage(eage);
		employee.setEmail(email);
		employee.setMobile(mobile);
		
		String status = dao.insert(employee);

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Servlet Page</title></head></html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Employee Registration details</h1>");
		out.println("<table border = '1'>");
		out.println("<tr><th>EID</th><td>" + eid + "</td></tr>");
		out.println("<tr><th>EName</th><td>" + ename + "</td></tr>");
		out.println("<tr><th>EAge</th><td>" + eage + "</td></tr>");
		out.println("<tr><th>EMail</th><td>" + email + "</td></tr>");
		out.println("<tr><th>Mobile</th><td>" + mobile + "</td></tr>");
		out.println("<tr><th>Status</th><td>" + status + "</td></tr>");
		out.println("</table");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
