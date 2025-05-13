package com.sec02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EveningGreet eg = context.getBean("eveningGreet", EveningGreet.class);
		System.out.println(eg.greeting());
	}

}
