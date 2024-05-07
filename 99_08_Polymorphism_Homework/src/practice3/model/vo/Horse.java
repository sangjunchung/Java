package practice3.model.vo;

public class Horse extends Animal {
	private String location;
	private String color;

	public Horse() {

	}

	public Horse(String inName, String inKinds, String inLocation, String inColor) {
		super(inName, inKinds);
		this.location = inLocation;
		this.color = inColor;
	}

	@Override
	public void speak() {
		System.out.println(super.toString()+location+"에 서식하며, 색상은 "+color+"입니다.");
	}
}
