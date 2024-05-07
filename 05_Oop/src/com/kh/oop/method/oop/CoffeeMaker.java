package com.kh.oop.method.oop;

public class CoffeeMaker {
	private String coffeeType;
	private int sugar;
	private boolean milk;
	
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	// boolean 같은 경우는 get이 아닌 is로 표시함
	public boolean isMilk() {
		return milk;
	}

	public void setCoffee(String inCoffeetype, int inSugar, boolean inMilk) {
		this.coffeeType = inCoffeetype;
		this.sugar = inSugar;
		this.milk = inMilk;
	}
	
	public CoffeeMaker() {
		
	}
	
	public CoffeeMaker(String inCoffeetype, int inSugar, boolean inMilk) {
		this.coffeeType = inCoffeetype;
		this.sugar = inSugar;
		this.milk = inMilk;
	}
	
	public void makeCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : "+coffeeType);
		System.out.println("설탕 : "+sugar+" g");
		if(milk) System.out.println("우유 첨가");
		else System.out.println("우유 미첨가");
		System.out.println("커피가 준비되었습니다.");
		System.out.println("------------------------");
	}
	/*
	public static void main(String[] args) {
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffee("아메리카노", 1, false);
		coffee1.makeCoffee();
		
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인 아메리카노", 2, true);
		coffee2.makeCoffee();
	}
	*/
}
