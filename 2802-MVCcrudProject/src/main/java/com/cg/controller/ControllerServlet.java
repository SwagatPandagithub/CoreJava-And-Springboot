package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.model.Student;
import com.cg.service.IStudentService;
import com.cg.serviceFactory.StudentServiceFactory;


@WebServlet("/Controller/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		IStudentService stdService  = StudentServiceFactory.getStudentService();
		
		System.out.println("Request URI :: "+request.getRequestURI());
		System.out.println("Path Info   :: "+request.getPathInfo());
		
		if(request.getRequestURI().endsWith("addform")) {
			String sage=request.getParameter("sage");
			String sname=request.getParameter("sname");
			String saddress=request.getParameter("saddr");
			
			Student student= new Student();
			student.setSage(Integer.parseInt(sage));
			student.setSname(sname);
			student.setSaddress(saddress);
			
			String status = stdService.addStudent(student);
			PrintWriter out = response.getWriter();
			RequestDispatcher rd = null;
			if (status.equals("success")) {
					
					request.setAttribute("status", "success");
					rd=request.getRequestDispatcher("../insertResult.jsp");
					rd.forward(request, response);
					
			} else {
				
					request.setAttribute("status", "failure");
					rd=request.getRequestDispatcher("../insertResult.jsp");
					rd.forward(request, response);
				
			}
			
		}
		if(request.getRequestURI().endsWith("searchform")) {
			
			String sid=request.getParameter("sid");			
			Student student = stdService.searchStudent(Integer.parseInt(sid));
			
		/*	PrintWriter out = response.getWriter();
			if (student != null) {
				out.println("<body>");
				out.println("<br/><br/><br/>");
				out.println("<center>");
				out.println("<table border='1'>");
				out.println("<tr><th>ID</th><td>" + student.getSid() + "</td></tr>");
				out.println("<tr><th>NAME</th><td>" + student.getSname() + "</td></tr>");
				out.println("<tr><th>AGE</th><td>" + student.getSage() + "</td></tr>");
				out.println("<tr><th>ADDRESS</th><td>" + student.getSaddress() + "</td></tr>");
				out.println("</table>");
				out.println("</center>");
				out.println("</body>");
			} else {
				out.println("<h1 style='color:red;text-align:center;'>RECORD NOT AVAILABLE FOR THE GIVEN ID " + sid
						+ "</h1>");
			}
			out.close(); 
			
		*/
			//keeping the student data in request object
			request.setAttribute("student", student);
			RequestDispatcher rd= null;
			rd=request.getRequestDispatcher("../display.jsp");
			rd.forward(request, response);
		
		}
		
		if (request.getRequestURI().endsWith("deleteform")) {
			String sid = request.getParameter("sid");
			String status = stdService.deleteStudent(Integer.parseInt(sid));

			PrintWriter out = response.getWriter();
			if (status.equals("success")) {
				out.println("<body>");
				out.println("<h1 style='color:green;text-align:center;'>RECORD DELETED SUCCESFULLY</h1>");
				out.println("</body>");
			} else if (status.equals("failure")) {
				out.println("<body>");
				out.println("<h1 style='color:red;text-align:center;'>RECORD DELETION FAILED</h1>");
				out.println("</body>");

			} else {
				out.println("<body>");
				out.println("<h1 style='color:green;text-align:center;'>RECORD NOT FOUND FOR DELETION</h1>");
				out.println("</body>");

			}
			out.close();
		}
		
		if(request.getRequestURI().endsWith("editform")) {
			String sid=request.getParameter("sid");
			
			Student student = stdService.searchStudent(Integer.parseInt(sid));
			
			PrintWriter out = response.getWriter();
			
			if(student!=null) {
				out.println("<body>");
				out.println("<center>");
				out.println("<form method='post' action='./Controller/updateRec'>");
				out.println("<table>");		
				out.println("<tr><th>ID</th><td>"+student.getSid()+"</td></tr>");		
				out.println("<input type='hidden' name='sid' value='" + student.getSid() + "'/>");
				out.println("<tr><th>Name</th><td><input type='text' name='sname' value='"+student.getSname()+"'/></td></tr>");		
				out.println("<tr><th>Age</th><td><input type='text' name='sage' value='"+student.getSage()+"'/></td></tr>");		
				out.println("<tr><th>Address</th><td><input type='text' name='saddr' value='"+student.getSaddress()+"'/></td></tr>");		
				out.println("<tr><th></th><td><input type='submit'  value='update'/></td></tr>");		
				
				out.println("</table>");
				out.println("</form>");
				out.println("</center>");				
				out.println("</body>");
			}else {
				out.println("<body>");
				out.println("<h1 style='color:green; text-align:center'>Record not available for th egiven id :: "+sid+"</h1></br>");
				out.println("</body>");
				
			}
			out.close();
			
			
		}
		
		if(request.getRequestURI().endsWith("updateRec")) {
			PrintWriter out = response.getWriter();
			
			String sid=request.getParameter("sid");
			String sname=request.getParameter("sname");
			String sage=request.getParameter("sage");
			String saddr=request.getParameter("saddr");
			
			Student student =  new Student();
			student.setSid(Integer.parseInt(sid));
			student.setSname(sname);
			student.setSaddress(saddr);
			student.setSage(Integer.parseInt(sage));
			
			String report = stdService.updateStudent(student);
			

			if (report.equals("success")) {
				out.println("<h1 style='color:green; text-align:center'>Congratulations!!</h1></br>");
				out.println("<h1 style='color:green; text-align:center'>REGISTRATION SUCCESSFUL</h1>");
			} else {
				out.println("<h1 style='color:green; text-align:center'>REGISTRATION FAILED</h1></br>");
			}
			out.close();
		}
	}
}
