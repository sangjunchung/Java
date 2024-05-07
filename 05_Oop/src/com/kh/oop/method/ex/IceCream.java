package com.kh.oop.method.ex;

public class IceCream {
	private String name;
	private int sugar;
	private boolean milk;
	
	public String getName() {
		return name;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	public IceCream() {
		
	}
	
	public IceCream(String inName, int inSugar, boolean inMilk) {
		this.name = inName;
		this.sugar = inSugar;
		this.milk = inMilk;
	}
	
	public void makeIceCream() {
		System.out.println("아이스크림을 만듭니다.");
		System.out.println("이름 : "+name);
		System.out.println("설탕 : "+sugar+" g");
		if(milk) System.out.println("우유 추가");
		else System.out.println("우유 미추가");
		System.out.println("아이스크림을 다 만들었습니다.");
		System.out.println("------------------------");
	}
}
