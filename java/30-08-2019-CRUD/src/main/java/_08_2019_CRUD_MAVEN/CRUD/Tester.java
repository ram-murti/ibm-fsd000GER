package _08_2019_CRUD_MAVEN.CRUD;

import java.util.Scanner;

public class Tester {
	static Scanner scanner = new Scanner(System.in);
	private static int id;
	private static String fname;
	private static String lname;
	private static int option;

	public static void main(String[] args) {
		String args12="420";
          
		
		
		
		for (;;) {
			
			System.out.println("Enter 1 for AddEmployee");
			System.out.println("Enter 2 for DeleteEmployeById");
			System.out.println("Enter 4 for View All Employee");
			System.out.println("Enter 3 for GetElemetById");
			System.out.println("Enter 5 for UpdateElementById");
			option = scanner.nextInt();
			if (option == 1) {
				System.out.println("Enter fname");
				fname = scanner.next();
				System.out.println("Enter lname");
				lname = scanner.next();
				CRUDmethod emp = new CRUDmethod();
				emp.addEmployeMethod(fname, lname);
			}
			if (option == 2) {
				System.out.println("Enter Id");
				id = scanner.nextInt();
				CRUDmethod emp = new CRUDmethod();
				emp.deleteEmployeById(id);
			}
			if (option == 3) {
				System.out.println("Enter id");
				id = scanner.nextInt();
				
				CRUDmethod emp = new CRUDmethod();
				emp.getEmployeeById(id);
			}
			if (option == 4) {
				CRUDmethod emp = new CRUDmethod();
				
				emp.viewAllEmployee();
			}
			if (option == 5) {
				System.out.println("Enter id");
				id = scanner.nextInt();
				System.out.println("Enter fname");
				fname = scanner.next();
				System.out.println("Enter lname");
				lname = scanner.next();
				CRUDmethod emp = new CRUDmethod();
				emp.updateEmployeById(id, fname, lname);
			}
		}
	}

}
