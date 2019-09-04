package Spring._09_2019_DatabaseConnection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext context=
         		new ClassPathXmlApplicationContext("applicationContext.xml");
         EmployeeDAO dao=context.getBean("eDao",EmployeeDAO.class);
         dao.createEmployee(new Employee("null"));
         
     }
    }

