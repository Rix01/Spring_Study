package com.workshop01.sec02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Greet eg = context.getBean("eveningGreet", Greet.class);
		System.out.println(eg.greeting());
	}

}
