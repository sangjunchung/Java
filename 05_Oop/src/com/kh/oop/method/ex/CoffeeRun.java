package com.kh.oop.method.ex;

import com.kh.oop.method.oop.CoffeeMaker;

public class CoffeeRun {
	
	public static void main(String[] args) {
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffee("아메리카노", 1, false);
		coffee1.makeCoffee();
		
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인 아메리카노", 2, true);
		coffee2.makeCoffee();
	}
}
