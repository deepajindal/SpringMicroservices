package spring.ioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ioc.beans.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Coach coach=context.getBean("coach",Coach.class);
    	System.out.println("Workout:" +coach.getDailyWorkout());
    	System.out.println("Fortune:" +coach.getDailyFortune());
    }
}
