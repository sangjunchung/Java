package com.kh.inheritance.OverrideEx;

public class Rabbit extends Animal {
	
	public Rabbit(String inName) {
		super(inName);
	}
	@Override
	public void sound() {
		System.out.println(name+" 이(가) 낑낑하고 소리를 냅니다.");
	}
}
