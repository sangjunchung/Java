package com.kh.oop.method.oop;

public class DrinkStore {
	private DrinkMaker maker;
	private String location;
	private String storeName;
	private boolean takeout;
	
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getStoreName() {
		return storeName;
	}
	public boolean isTakeout() {
		return takeout;
	}
	
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	
	public DrinkStore() {
		
	}
	
	public DrinkStore(DrinkMaker inMaker, String inLocation, String inStoreName, boolean inTakeout) {
		this.maker = inMaker;
		this.location = inLocation;
		this.storeName = inStoreName;
		this.takeout = inTakeout;
	}
	
	public void orderDrink() {
		System.out.println(location+" "+storeName+" 에 주문하신 정보입니다.");
		maker.makeDrink();
		if(takeout) System.out.println("테이크아웃 주문");
		else System.out.println("매장 내 섭취");
		System.out.println("---------------------------");
	}
}
