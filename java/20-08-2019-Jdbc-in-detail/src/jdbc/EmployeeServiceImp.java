package jdbc;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImp implements EmployeeService {
	private EmployeeDao dao = null;

	public EmployeeServiceImp() throws SQLException {
		super();
		dao = new EmployeeDaoImp();
	}

	@Override
	public void createEmployee(Employee employee) {

		dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployee();
	}

	@Override
	public Employee getEmployeeById(int id) {
               
		return dao.getemployeeId(id);
	}

	@Override
	public Employee DeleteEmployByID(int id) {
		dao.DeleteById(id);
		return null;
	}
}
