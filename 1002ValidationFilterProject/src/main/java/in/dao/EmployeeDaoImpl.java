package in.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.dto.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public String insert(Employee employee) {
		String sqlInsertQuery="insert into employeeDetails(eid,ename,eage,email,mobile) values(?,?,?,?,?)";
		Connection connection=null;
		PreparedStatement pstmt = null;
		String status=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sekhar");
			if (connection!=null) {
				pstmt=connection.prepareStatement(sqlInsertQuery);
			}
			if (pstmt!=null) {
				pstmt.setString(1, employee.getEid());
				pstmt.setString(2, employee.getEname());
				pstmt.setString(3, employee.getEage());
				pstmt.setString(4,employee.getEmail());
				pstmt.setString(5, employee.getMobile());
				
				int rowCount=pstmt.executeUpdate();
				if(rowCount==1) {
					status="success";
					return status;
				}else {
					status="Failure";
					return status;
					
				}
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		status="Failure";
		return status;
	}

}
