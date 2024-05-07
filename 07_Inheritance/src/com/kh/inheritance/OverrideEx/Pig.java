package com.kh.inheritance.OverrideEx;

public class Pig extends Animal {
	
	public Pig(String inName) {
		super(inName);
	}
	@Override
	public void sound() {
		System.out.println(name+" 이(가) 꿀꿀하고 웁니다.");
	}
}
