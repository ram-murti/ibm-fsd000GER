package Spring._09_2019_Spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 try {
         	
         	ClassPathXmlApplicationContext context=new 
         			ClassPathXmlApplicationContext("applicationContext.xml");
         Coach myCoach=context.getBean("theCoach",CricketCoach.class);
         	System.out.println(myCoach.getDailyRoutine());
         	Coach myCoach1=context.getBean("theCoach",CricketCoach.class);
         //	System.out.println(myCoach==myCoach1);
         	ClassPathXmlApplicationContext context1=new 
         			ClassPathXmlApplicationContext("applicationContext1.xml");
         	Employee emp=context1.getBean("Employee",Employee.class);
         	System.out.println(emp.toString());
         	//ClassPathXmlApplicationContext context2=new 
        			//ClassPathXmlApplicationContext("applicationContext1.xml");
        	//Coach theCoach=context2.getBean("theCoach",Coach.class);
        //	System.out.println(theCoach.getDailyRoutine()+" "+theCoach.getFortuneDetail());
 		} catch (Exception e) {
 			// TODO: handle exception
 		}
    }
}
