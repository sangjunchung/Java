package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		
		DrinkMaker dm1 = new DrinkMaker("허브티", 1, 5);
		DrinkStore drink1 = new DrinkStore();
		drink1.setMaker(dm1);
		drink1.setLocation("경기");
		drink1.setStoreName("멕아커피");
		drink1.setTakeout(false);
		
		drink1.orderDrink();
		
		DrinkStore drink2 = new DrinkStore(new DrinkMaker("아메리카노", 3, 1), "서울 서초구", "빠나쁘레쏘", true);
		
		drink2.orderDrink();
		
		DrinkMaker dm2 = new DrinkMaker("버블티", 5, 11);
		DrinkStore drink3 = new DrinkStore(dm2, "강원", "바다커피", false);
		
		drink3.orderDrink();

	}
}
