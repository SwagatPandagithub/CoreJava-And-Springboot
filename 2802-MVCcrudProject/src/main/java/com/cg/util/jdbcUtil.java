package com.cg.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcUtil {
	
	//JDBCUtil has functions which are common like connection and close resources
	
	public static Connection getConnection() throws Exception {
//Load and Install the driver
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully");
		
		FileInputStream fis=new FileInputStream("C:\\Users\\SWAGAPAN\\Desktop\\INeuron\\0202ServletCRUDproject\\src\\main\\java\\com\\cg\\proporties\\application.properties");
		Properties properties = new Properties();
		properties.load(fis);

//Create Connection
		String url=properties.getProperty("url");
		String userName = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		Connection connection= DriverManager.getConnection(url,userName,password);
		System.out.println("The implementation class is : "+connection.getClass().getName());
		
		if (connection != null) {
				System.out.println("Connection done successfully...");
		}
		
		return connection;
		
	}
	
	public static void closeUp(Connection connection,Statement statement, ResultSet resultset) throws SQLException {
		if (connection != null) 
				connection.close();
		if (statement != null) 
				statement.close();
		if (resultset != null) 
				resultset.close();
		
		System.out.println("Closing the resources...");
		
		
		
	}
	
	

}
