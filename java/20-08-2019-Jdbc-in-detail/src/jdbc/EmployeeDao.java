package jdbc;

import java.util.List;

public interface EmployeeDao {
public void createEmployee(Employee employe);
public List <Employee> getAllEmployee();
public Employee getemployeeId(int id);
public Employee DeleteById(int id);

}
