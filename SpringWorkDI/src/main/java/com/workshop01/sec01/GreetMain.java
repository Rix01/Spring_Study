package com.workshop01.sec01;

import org.springframework.context.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 구체 클래스를 bean으로 등록하고 getBean()을 사용해서 선조 인터페이스로 리턴.
		// 1. 메모리 로드된 객체를 찾아서 리턴 확인
		Greet mg = context.getBean("morningGreet", MorningGreet.class);
		System.out.println(mg.greeting());
		
		// 2. context 소멸하는 방법 2가지(자동, 명시)
		((AbstractApplicationContext) context).close();	// 자동
		
//		if(context instanceof ConfigurableApplicationContext) {
//			((ConfigurableApplicationContext) context).close();	// 명시
//		}
		
		// 3. context close 됐는지 isActive로 확인
		if(context instanceof ConfigurableApplicationContext) {
			boolean isActive = ((ConfigurableApplicationContext) context).isActive();
			System.out.println("close 여부(열림: true, 닫힘: false) -> "+ isActive);
		}
		
		// 4. close 잘 됐는지 getBean()을 통해 재확인
		mg = context.getBean("morningGreet", MorningGreet.class);
		System.out.println(mg.greeting());
	}

}
