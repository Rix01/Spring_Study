package com.workshop02.sec01;

public class Student {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Student() {
		
	}
	
	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String studentInfo() {
		return String.format("%-5s %-5d %-5d %-5d", name, age, height, weight);
	}

	public int getAge() {
		return age;
	}


	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
	
}
