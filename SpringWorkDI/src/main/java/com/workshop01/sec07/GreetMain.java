package com.workshop01.sec07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Greet g = (Greet) ctx.getBean("morningGreet7");
		System.out.println(g.greeting());
	}

}
