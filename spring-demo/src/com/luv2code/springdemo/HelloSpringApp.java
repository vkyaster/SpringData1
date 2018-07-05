package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(myCoach.getDailyWorkOut());

		context.close();
	}

}
