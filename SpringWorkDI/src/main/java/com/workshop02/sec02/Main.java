package com.workshop02.sec02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext02.xml");
		EmployeeService service = context.getBean("service", EmployeeService.class);
		service.printAllEmployees();
	}

}
