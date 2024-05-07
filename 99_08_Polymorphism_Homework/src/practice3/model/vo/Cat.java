package practice3.model.vo;

public class Cat extends Animal {
	private String location;
	private String color;

	public void setLocation(String location) {
		this.location = location;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLocation() {
		return location;
	}

	public String getColor() {
		return color;
	}

	public Cat() {

	}

	public Cat(String inName, String inKinds, String inLocation, String inColor) {
		super(inName, inKinds);
		this.location = inLocation;
		this.color = inColor;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() + location + "에 서식하며, 색상은 " + color + "입니다.");
	}
}
