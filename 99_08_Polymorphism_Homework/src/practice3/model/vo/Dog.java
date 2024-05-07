package practice3.model.vo;

public class Dog extends Animal {
	public final static String PLACE = "애견카페";
	private int weight;

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public static String getPlace() {
		return PLACE;
	}

	public int getWeight() {
		return weight;
	}

	public Dog() {

	}

	public Dog(String inName, String inKinds, int inWeight) {
		super(inName, inKinds);
		this.weight = inWeight;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
	}
}
