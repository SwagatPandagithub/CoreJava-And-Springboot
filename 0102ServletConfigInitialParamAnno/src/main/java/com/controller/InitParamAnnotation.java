package com.controller;

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


@WebServlet(
		urlPatterns = { "/test" }, //we have to create a html page  and bind the page to this url pattern or protocol
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:oracle:thin:@localhost:1521:xe"), 
				@WebInitParam(name = "username", value = "system"), 
				@WebInitParam(name = "password", value = "sekhar")
		},loadOnStartup = 10)
public class InitParamAnnotation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection connection= null;
	PreparedStatement pstmt= null;
	
	static {//static block helps in loading first which helps in connection establishment at the starting
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver added Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void init() throws ServletException {//after static bloack init method will be called
		
		String jdbcUrl=getInitParameter("url");
		String user=getInitParameter("username");
		String password=getInitParameter("password");
		
		try {
			connection = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("comnnection done successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//static block and init method executed only once
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username= request.getParameter("username");
		String userage= request.getParameter("userage");
		String useraddress= request.getParameter("useraddress");
		
		String sqlInsertQuery= "insert into student(name,age,address) values(?,?,?)";
		try {
				if (connection != null) {
					pstmt = connection.prepareStatement(sqlInsertQuery);
				}
				if (pstmt != null) {
					pstmt.setString(1, username);
					pstmt.setInt(2, Integer.parseInt(userage));
					pstmt.setString(3, useraddress);					
					}
				if (pstmt != null) {
					int rowAffected = pstmt.executeUpdate();
					PrintWriter out=response.getWriter();
					if (rowAffected==1) {
						
						out.println("<h1 style='color:green;text-align:center;'>Registration Successful</h1>");
						
					} else {
						
						out.println("<h1 style='color:green;text-align:center;'>Registration failed try again with following link</h1>");
						out.println("<a href='./reg.html'/>|Register Again|</a>");
						
					}
					out.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	@Override
	public void destroy() {
			try {
				if (connection != null) {
				connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}


