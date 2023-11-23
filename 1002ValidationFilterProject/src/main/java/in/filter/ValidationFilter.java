package in.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

public class ValidationFilter implements Filter {
    
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		 String eid_msg = "",ename_msg = "",eage_msg = "",email_msg = "",emob_msg = "";
	     boolean flag=true; 
		PrintWriter out = response.getWriter();
		
		String eid = request.getParameter("eid");
		String ename = request.getParameter("ename");
		String eage = request.getParameter("eage");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		if (eid == null || eid.equals("")) {
			eid_msg ="Employee ID Required";
			flag=false;
		}else {
			if(!eid.startsWith("abc-")) {
				eid_msg = "Employee id should start with abc-";
				flag=false;
			}else {
				flag=true;
			}
		}
		if (ename == null || ename.equals("")) {
			ename_msg ="Employee name Required";
			flag=false;
		}else {
			if(ename.length()<3) {
				ename_msg = "Employee name should be less than 10";
				flag=false;
			}else {
				flag=true;
			}
		}
		if (eage == null || eage.equals("")) {
			eage_msg ="Employee age Required";
			flag=false;
		}else {
			int age=Integer.parseInt(eage);
			if(age>=20 && age<=30) {
				eage_msg = "Employee age should be between 20 - 30";
				flag=false;
			}else {
				flag=true;
			}
		}
		if (email == null || email.equals("")) {
			email_msg ="Employee email Required";
			flag=false;
		}else {
			if(!email.endsWith("@gmail.com")) {
				email_msg = "Enter valid gmail ID eg. abc@gmail.com";
				flag=false;
			}else {
				flag=true;
			}
		}
		if (mobile == null || mobile.equals("")) {
			emob_msg ="Employee mobile Required";
			flag=false;
		}else {
			if(!mobile.startsWith("91-")) {
				emob_msg = "Employee Mobile number should start with 91-";
				flag=false;
			}else {
				flag=true;
			}
		}
		
		if(flag==true) {		
		chain.doFilter(request, response);
		}else {
			out.println("<html><head><title>Registration</title></head></html>");
			out.println("<body bgcolor='lightgreen'>");
			out.println("<center>");
			out.println("<h1>Employee Registration details</h1>");
			out.println("<form method ='post' action = './reg'>");
			out.println("<table>");
			
			out.println("<tr><th>EID</th><td><input type = 'text' name = 'eid' value ='" + eid + "'/></td><td>"+ eid_msg + "</td></tr>");
			out.println("<tr><th>ENAME</th><td><input type = 'text' name = 'ename' value ='" + ename + "'/></td><td>"+ ename_msg + "</td></tr>");
			out.println("<tr><th>EAGE</th><td><input type = 'text' name = 'eage' value ='" + eage + "'/></td><td>"+ eage_msg + "</td></tr>");
			out.println("<tr><th>EMAIL</th><td><input type = 'text' name = 'email' value ='" + email + "'/></td><td>"+ email_msg + "</td></tr>");
			out.println("<tr><th>mobile</th><td><input type = 'text' name = 'mobile' value ='" + mobile + "'/></td><td>"+ emob_msg + "</td></tr>");
			out.println("<tr><th></th><td><input type = 'submit'  value ='submit'/></td></tr>");

			out.println("</table");
			out.println("</form>");
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}

	
	public void destroy() {
		
	}

}
