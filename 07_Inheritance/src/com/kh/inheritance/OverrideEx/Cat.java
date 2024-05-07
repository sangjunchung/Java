package com.kh.inheritance.OverrideEx;

public class Cat extends Animal {
	
	public Cat(String inName) {
		super(inName);
	}
	
	@Override
	public void sound() {
		System.out.println(name+" 이(가) 야옹 소리를 냅니다.");
	}
}
