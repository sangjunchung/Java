package ncs.test5;

public class Phone {
	private String model;
	private int price;
	private String manufacture;
	private int quantity;

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public int getQuantity() {
		return quantity;
	}

	public Phone() {

	}

	public Phone(String model, int price, String manufacture, int quantity) {
		this.model = model;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}

	public String toString() {
		return model+", "+price+", "+manufacture+", "+quantity;
	}
}
