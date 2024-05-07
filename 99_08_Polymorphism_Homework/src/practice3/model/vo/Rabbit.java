package practice3.model.vo;

public class Rabbit extends Animal {
	private int weight;
	private String color;

	public Rabbit() {

	}

	public Rabbit(String inName, String inKinds, int inWeight, String inColor) {
		super(inName, inKinds);
		this.weight = inWeight;
		this.color = inColor;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() + " 몸무게는" + weight + "kg이며, 색상은 " + color + "입니다.");
	}

}
