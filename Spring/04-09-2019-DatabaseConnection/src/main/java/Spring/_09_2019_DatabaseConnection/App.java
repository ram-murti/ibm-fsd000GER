package Spring._09_2019_DatabaseConnection;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	 ClassPathXmlApplicationContext context=
         		new ClassPathXmlApplicationContext("applicationContext.xml");
         EmployeeDAO dao=context.getBean("eDao",EmployeeDAO.class);
         dao.createEmployee(new Employee("Ram"));
         System.out.println("List of All Employee");
         dao.viewEmployee();
         dao.getEmployeById(3);
     }
    }

