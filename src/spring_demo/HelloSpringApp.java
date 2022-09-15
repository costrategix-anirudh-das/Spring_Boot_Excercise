package spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach1", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		theCoach = context.getBean("myCoach2", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
