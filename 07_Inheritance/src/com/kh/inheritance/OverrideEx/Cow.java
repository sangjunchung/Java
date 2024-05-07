package com.kh.inheritance.OverrideEx;

public class Cow extends Animal {
	
	public Cow(String inName) {
		super(inName);
	}
	@Override
	public void sound() {
		System.out.println(name+" 이(가) 음메하고 웁니다.");
	}
}
