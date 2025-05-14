package com.workshop02.sec01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext01.xml");
		StudentService service = context.getBean("service", StudentService.class);
		
		service.printAllInfo();
		System.out.println();
		service.printStats();
	}

}
