package com.workshop01.sec04;

public class GreetService {
	private Greet greet;
	
	public GreetService(Greet greet) {
		this.greet = greet;
	}

	public void sayHello() {
		System.out.println(greet.greeting());
	}
	
}
