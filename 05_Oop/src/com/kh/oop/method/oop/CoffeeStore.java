package com.kh.oop.method.oop;

public class CoffeeStore {
	private CoffeeMaker maker;
	private String storeName;
	private String location;
	
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public CoffeeStore() {
		
	}
	
	public CoffeeStore(CoffeeMaker inMaker, String inStoreName, String inLocation) {
		this.maker = inMaker;
		this.storeName = inStoreName;
		this.location = inLocation;
	}
	
	public void orderCoffee() {
		System.out.println("커피를 주문합니다.");
		System.out.println("가게 이름 : "+storeName);
		System.out.println("가게 지역 : "+location);
		maker.makeCoffee();
	}
}
