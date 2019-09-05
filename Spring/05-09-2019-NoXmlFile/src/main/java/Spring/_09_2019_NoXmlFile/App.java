package Spring._09_2019_NoXmlFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
    	Employee emp=context.getBean("employee",Employee.class);
          emp.printSomething();
          EmployeeDAO dao=context.getBean("employeeDAO",EmployeeDAO.class);
          dao.createEmployee(new Employee("Ajeet 123"));
    }
}
