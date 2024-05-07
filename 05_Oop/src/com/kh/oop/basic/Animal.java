package com.kh.oop.basic;

public class Animal {
	String name;
	int age;
	
	public Animal() {
		
	}
	
	public Animal(String inName, int inAge) {
		this.name = inName;
		this.age = inAge;
	}
	
	public void info() {
		System.out.println("동물의 이름 : "+name);
		System.out.println("동물의 나이 : "+age);
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "뽀삐";
		dog.age = 1;
		
		Animal cat = new Animal("고등어", 2);
		
		dog.info();
		cat.info();
	}
}
