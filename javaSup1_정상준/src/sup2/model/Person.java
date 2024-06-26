package sup2.model;

public class Person {
	private String name;
	private String gender;
	private String phone;
	private int age;
	private double height;
	private double weight;

	public Person(String inName, String inGender, String inPhone, int inAge, double inHeight, double inWeight) {
		this.name = inName;
		this.gender = inGender;
		this.phone = inPhone;
		this.age = inAge;
		this.height = inHeight;
		this.weight = inWeight;
	}

	public void information() {
		System.out.printf("%s는 %s자이고, 나이는 %d세, 키는 %.1fcm이면서 몸무게는 %.1fkg 이다.", name, gender, age, height, weight);
	}
}
