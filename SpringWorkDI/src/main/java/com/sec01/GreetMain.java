package com.sec01;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MorningGreet mg = context.getBean("morningGreet", MorningGreet.class);
		System.out.println(mg.greeting());
	}

}
