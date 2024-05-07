package com.kh.inheritance.OverLoadingEx;

public class Person {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public Person() {
		
	}
	
	public Person(String inName) {
		this.name = inName;
	}
	
	public Person(String inName, int inAge) {
		this.name = inName;
		this.age = inAge;
	}
	
	public void displayInfo() {
		System.out.println("이름 : "+name+ " , 나이 : "+age);
	}
}
