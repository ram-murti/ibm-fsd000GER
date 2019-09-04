package Spring._09_2019_Component;

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
          Coach c=context.getBean("swimCoach",Coach.class);
          System.out.println(c.getDailyWorkout()+"\n"+c.getDailyFortune());
          
          context.close();
    }
}
