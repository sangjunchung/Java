package com.kh.oop.method.ex;

public class HamburgerStore {
	
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public HamburgerStore() {
		
	}
	
	public HamburgerStore(String inName, int inPrice) {
		this.name = inName;
		this.price = inPrice;
	}
	
	public void info() {
		System.out.println("햄버거 이름 : "+name);
		System.out.println("햄버거 가격 : "+price);
		System.out.println("--------------------");
	}
	
	public static void main(String[] args) {
		HamburgerStore hamburger1 = new HamburgerStore();
		hamburger1.setName("불고기 버거");
		hamburger1.setPrice(2000);
		hamburger1.info();
		
		HamburgerStore hamburger2 = new HamburgerStore("치즈 버거", 3000);
		hamburger2.info();
	}
}

