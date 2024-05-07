package com.kh.oop.method.oop;

public class DrinkMaker {
	private String drinkType;
	private int quantity;
	private int temp;
	
	public String getDrinkType() {
		return drinkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTemp() {
		return temp;
	}

	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public DrinkMaker() {
		
	}
	
	public DrinkMaker(String inDrinkType, int inQuantity, int inTemp) {
		this.drinkType = inDrinkType;
		this.quantity = inQuantity;
		this.temp = inTemp;
	}
	
	public void makeDrink() {
		System.out.println("음료 종류 : "+drinkType);
		System.out.println("음료 양 : "+quantity);
		if(temp < 5) System.out.println("온도 : 차갑게");
		else if(temp < 10) System.out.println("온도 : 미지근하게");
		else System.out.println("온도 : 뜨겁게");
		System.out.println("음료제조 완료");
	}
}
