package jdbc;

import java.util.List;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public Employee DeleteEmployByID(int id);
}
