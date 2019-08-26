package jdbc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeTester {
	private static Scanner scanner=new Scanner(System.in);
	public static Employee empUtil = new Employee();
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		EmployeeService service=new EmployeeServiceImp();
		int choice=0;
		do {
			System.out.println("1.create employee.");
			System.out.println("2.display all employee");
			System.out.println("0:exit");
			System.out.print("Your Choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("EMployee ID: ");
				int id = scanner.nextInt();
				System.out.print("Employee First Name: ");
				String firstName = scanner.next();
				System.out.print("Employee Last Name: ");
				String lastName = scanner.next();
			
				service.createEmployee(new Employee(id, firstName, lastName));
				break;
			case 2:
				List<Employee> list=service.getAllEmployees();
				for(Employee e:list)
				{
					System.out.printf("\n%d\t%s\t%s\t",e.getId(),e.getFname(),e.getLname()
							);
				}
				break;
			case 0:
				Employee emp = service.getEmployeeById(2);
				System.out.println(emp);
				//String  string = emp.toString(emp);
				String string = emp.toString();
				System.out.println(string+"in case 0"); 
				Employee employee = empUtil.getObject(string);
				System.out.println(employee.getFname());
				break;

			default:
				System.out.println("Invalid choice.");
				break;
			}
			
		} while (choice!=0);
		
		

	}
}
