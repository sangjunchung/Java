package com.kh.oop.method.ex;

public class PizzaStore {
	
	private String pizzaName;
	private int pizzaPrice;
	
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	
	public PizzaStore() {
		
	}
	
	public PizzaStore(String inPizzaName, int inPizzaPrice) {
		this.pizzaName = inPizzaName;
		this.pizzaPrice = inPizzaPrice;
	}
	
	public void infoPizza() {
		System.out.println("피자 이름 : "+pizzaName);
		System.out.println("피자 가격 : "+pizzaPrice);
		System.out.println("----------------------");
	}
	
	public static void main(String[] args) {
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("페퍼로니 피자");
		pizza1.setPizzaPrice(11000);
		pizza1.infoPizza();
		
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("포테이토 피자");
		pizza2.infoPizza();
		
		PizzaStore pizza3 = new PizzaStore("치즈 피자", 13000);
		pizza3.infoPizza();
	}
}
