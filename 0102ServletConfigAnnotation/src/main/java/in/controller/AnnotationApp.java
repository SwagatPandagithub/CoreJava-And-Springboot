package in.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnnotationApp
 */
@WebServlet(
		urlPatterns = { "./test" }, loadOnStartup = 10,
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:oracle:thin:@localhost:1521:xe"), 
				@WebInitParam(name = "username", value = "system"), 
				@WebInitParam(name = "password", value = "sekhar")
		})
public class AnnotationApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	Connection connection= null;
	PreparedStatement pstmt = null;
	
	public void init() {
		System.out.println("Config Object Created and got the value from the initialisation process");
		
		String url = getInitParameter("url");
		String username = getInitParameter("username");
		String password = getInitParameter("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		try {
			connection= DriverManager.getConnection(url, username, password);
			if (connection !=null) {
				System.out.println("Connection established Successfully...");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("userName");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		
		String sqlInsertQuery="insert into student(name,age,address) values(?,?,?)";
		
		
			try {
				if (connection !=null) {
					pstmt = connection.prepareStatement(sqlInsertQuery);
				}
				if(pstmt !=null) {
					pstmt.setString(1, name);
					pstmt.setInt(2, Integer.parseInt(age));
					pstmt.setString(3, address);
				}
				if(pstmt!=null) {
					int rowAffected=pstmt.executeUpdate();
					PrintWriter out = response.getWriter();
					
					if (rowAffected == 1) {
						out.println("<h1 style='color:green;text-align:center;'>Registration Successful</h1>");
					} else {
						out.println("<h1 style='color:green;text-align:center;'>Registration Failed Try again clicking on the below link</h1>");
						out.println("<a href='./reg.html'/>|REGISTRATION|<?a>");
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
