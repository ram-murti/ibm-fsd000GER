package assessQno1A2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	private static int option;
	static Employee add=new Employee();
	
	public static void main(String[] args) {
		int id;
		String name;
		String department;
		String dateOfJoining;
		int age;
		int salary;
		Date date = null;
		int view = 0;
		int i1=1;
	Scanner scanner=new Scanner(System.in);
         System.out.println("Enter no of employess");
         option=scanner.nextInt();
         for(int i=1;i<=option;i++) {
        	 name=scanner.next();
        	 department=scanner.next();
        	 dateOfJoining=scanner.next();
        	 try {
				date=new SimpleDateFormat("DD/MM/YYYY").parse(dateOfJoining);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 age=scanner.nextInt();
        	 salary=scanner.nextInt();
        	 add.AddEmployee(i1++, name, department, date, salary, age);
        	 System.out.println("Enter employee:"+i);
        	 }
         for(int j=0;;) {
         System.out.println("1.Sort employees by salary");
         System.out.println("2.Sort employees by age");
         view=scanner.nextInt();
         
         if(view==1) {
        	 add.ViewEmployee();
        	 continue;
         }
         if(view==2) {
        	 add.SORTBYAGE();
        	 continue;
         }
         }
	}
         

}
