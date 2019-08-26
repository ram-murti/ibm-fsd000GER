package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImp implements EmployeeDao {

	private MyConnectionFactory factory = null;
	private Connection connection = null;
	private PreparedStatement pStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public EmployeeDaoImp() throws SQLException {
		super();
		factory = MyConnectionFactory.createObject();
		connection = factory.getConnection();
	}

	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			while (resultSet.next()) {
				list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void createEmployee(Employee employee) {
		try {
			pStatement = connection.prepareStatement("insert into employee values(?,?,?)");
			pStatement.setInt(1, employee.getId());
			pStatement.setString(2, employee.getFname());
			pStatement.setString(3, employee.getLname());

			pStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("duplicate id");

			e.printStackTrace();
		} finally {

		}

	}

	@Override
	public Employee getemployeeId(int id) {
		// TODO Auto-generated method stub
		Employee m = new Employee();

		try {
			statement = connection.createStatement();
			resultSet = null;
			resultSet = statement.executeQuery("select * from employee where id = " + id);
			while (resultSet.next()) {
				m = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
				System.out.println(m.getFname());
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return m;
	}

	@Override
	public Employee DeleteById(int id) {
		try {
			statement = connection.createStatement();
			pStatement = connection.prepareStatement("delete from  employee where id =?");
			pStatement.setInt(1, id);
			int a = pStatement.executeUpdate();
			if (a == 0) {
				System.out.println("not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" found");
		}
		return null;
	}

}
