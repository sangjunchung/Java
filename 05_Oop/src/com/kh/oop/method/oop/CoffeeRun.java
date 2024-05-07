package com.kh.oop.method.oop;

public class CoffeeRun {

	public static void main(String[] args) {
		
		CoffeeMaker cm = new CoffeeMaker("아메리카노", 1, false);
		CoffeeStore cs1 = new CoffeeStore(cm, "꺼삐빈", "서울시 강남구");
		CoffeeStore cs2 = new CoffeeStore(new CoffeeMaker("카페라떼", 2, true), "수타복수", "강원도 속초");
		
		cs1.orderCoffee();
		cs2.orderCoffee();
		
		cs2.setMaker(new CoffeeMaker("버븥티", 10, false));
		cs2.orderCoffee();
	}

}
