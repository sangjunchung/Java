package ncs4.test2;

public class Fruit {
	private String name;
	private int price;
	private int quantity;
	
	public Fruit() {
	
	}

	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		return name+","+price+","+quantity;
	}
}
