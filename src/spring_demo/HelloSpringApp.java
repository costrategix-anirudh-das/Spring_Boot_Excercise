package spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortune());
		context.close();
	}
	
//convention over configuration
	//spring mvc (design pattern) 
	//dispatcher servelet in spring mvc
}
