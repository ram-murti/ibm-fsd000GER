package Spring._09_2019_DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class EmployeeDAO {
	
	private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	/*
	 * public void createConnection() { try { Connection
	 * connection=dataSource.getConnection();
	 * System.out.println(connection.toString()); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	
	public void createEmployee(Employee employee)
	{
		try {
			Connection connection=dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("insert into employe(name) values(?)");
			pst.setString(1, employee.getName());
			pst.executeUpdate();
			System.out.println("inseerted..!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void viewEmployee() throws SQLException {
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement pst=connection.prepareStatement("select * from  employe");
                ResultSet resultset=pst.executeQuery();
                while(resultset.next()) {
                	System.out.println("Id:"+resultset.getInt(1)+" Name:"+resultset.getString(2));
                }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getEmployeById(int id) throws SQLException {
		Connection connection=dataSource.getConnection();
		PreparedStatement pst=connection.prepareStatement("select *from employe where id=?");
		pst.setInt(1, id);
		ResultSet resultset=pst.executeQuery();
		  while(resultset.next()) {
          	System.out.println("Id:"+resultset.getInt(1)+" Name:"+resultset.getString(2));
          }

	}
	
	

}
