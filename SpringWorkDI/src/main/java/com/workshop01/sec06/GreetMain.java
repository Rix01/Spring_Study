package com.workshop01.sec06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GreetService gs = context.getBean("greetService6", GreetService.class);
		gs.sayHello();
	}

}
