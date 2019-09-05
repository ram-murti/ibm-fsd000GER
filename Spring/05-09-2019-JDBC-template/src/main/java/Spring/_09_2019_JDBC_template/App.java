package Spring._09_2019_JDBC_template;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO dao=context.getBean("employeeDAO",EmployeeDAO.class);
        dao.createEmployee(new Employee("Ajeet Giri2"));
    }
}
