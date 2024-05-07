package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		IceCream ice1 = new IceCream();
		ice1.setName("빠삐코");
		ice1.setSugar(10);
		ice1.setMilk(false);
		ice1.makeIceCream();
		
		IceCream ice2 = new IceCream("쌍쌍바", 9, true);
		ice2.makeIceCream();
	}

}
