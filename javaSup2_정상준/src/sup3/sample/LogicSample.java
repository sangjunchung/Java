package sup3.sample;

public class LogicSample {
	private int age;
	private String name;
	private String gender;
	private String phone;

	public LogicSample(int inAge, String inName, String inGender, String inPhone) {
		this.age = inAge;
		this.name = inName;
		this.gender = inGender;
		this.phone = inPhone;
	}

	public void inputProfile() {
		System.out.println(name + ", " + age + "세, " + (gender.equals("여") ? "여자" : "남자") + ", " + phone);
	}
}
