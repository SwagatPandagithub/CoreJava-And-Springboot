package com.cg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.model.Student;
import com.cg.util.jdbcUtil;




public class StudentDaoImpl implements IStudentDao{
	
	Connection connection= null;
	PreparedStatement pstmt=null;
	ResultSet resultSet=null;
	static Scanner scan= new Scanner(System.in);
	Student student = null;

	@Override
	public String addStudent(Student student) {
		
		try {
			
			connection=jdbcUtil.getConnection();
			
			String sqlInsertQuery="insert into student(name,age,address) values(?,?,?)";
			if (connection != null) {
				pstmt=connection.prepareStatement(sqlInsertQuery);
			}
			
			if (pstmt != null) {
				
				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSage());
				pstmt.setString(3, student.getSaddress());
				
			}
			
			int rowsAffected=0;
			rowsAffected=pstmt.executeUpdate();
			if (rowsAffected ==1) {
				return "success";	
			}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failed";
	}

	@Override
	public Student searchStudent(Integer sid) {
		String sqlSelectQuery = "select id,name,age,address from student where id = ?";
		Student student = null;

		try {
			try {
				connection=jdbcUtil.getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null)
				pstmt.setInt(1, sid);

			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) {

				if (resultSet.next()) {
					student = new Student();

					// copy resultSet data to student object
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setSage(resultSet.getInt(3));
					student.setSaddress(resultSet.getString(4));

					return student;
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return student;
	}

	@Override
	public String updateStudent(Student student) {
		
		int sid=student.getSid();
		String sname=student.getSname();
		int sage=student.getSage();
		String saddress= student.getSaddress();
		
		try {			
			connection=jdbcUtil.getConnection();
			String sqlUpsateQuery="update student set name=?,age=?,address=? where id=?";
			pstmt=connection.prepareStatement(sqlUpsateQuery);
			
			if (pstmt != null) {
				pstmt.setInt(4, sid);
				pstmt.setString(1, sname);
				pstmt.setInt(2, sage);
				pstmt.setString(3, saddress);
				
				int rowAffected=pstmt.executeUpdate();
				if (rowAffected == 1) {
					return "success";					
				}else
					return "failed";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failed";
	}

	@Override
	public String deleteStudent(Integer sid) {
		String sqlDeleteQuery = "delete from student where id = ?";
		try {
			try {
				connection=jdbcUtil.getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (connection != null)
				pstmt = connection.prepareStatement(sqlDeleteQuery);

			if (pstmt != null) {

				pstmt.setInt(1, sid);

				int rowAffected = pstmt.executeUpdate();
				if (rowAffected == 1) {
					return "success";
				} else {
					return "not found";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return "failure";
		}
		return "failure";

	}

}
