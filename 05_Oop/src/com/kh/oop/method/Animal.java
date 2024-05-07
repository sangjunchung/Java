package com.kh.oop.method;

public class Animal {
	
	public String name;
	public int age;
	
	public Animal() {
		
	}
	
	public Animal(String inName, int inAge) {
		this.name = inName;
		this.age = inAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void info() {
		System.out.println("동물 이름 : "+name);
		System.out.println("동물 나이 : "+age);
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal("강아지", 1);
		Animal cat = new Animal("고양이", 2);
		
		dog.info();
		cat.info();
	}

}
