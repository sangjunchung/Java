package ncs.test3;

public class Tv {
	private String name;
	private int price;
	private String description;

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Tv() {

	}

	public Tv(String inName, int inPrice, String inDescription) {
		this.name = inName;
		this.price = inPrice;
		this.description = inDescription;
	}

	@Override
	public String toString() {
		return name + " " + price + " " + description;
	}
}
