package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("lifeCycle-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}

}
