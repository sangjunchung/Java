package com.kh.inheritance.OverrideEx;

public class Animal {
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Animal() {
		
	}
	
	public Animal(String inName) {
		this.name = inName;
	}
	
	public void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}
