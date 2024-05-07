package practice3.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;

	public void setName(String name) {
		this.name = name;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String getName() {
		return name;
	}

	public String getKinds() {
		return kinds;
	}

	public Animal() {

	}

	public Animal(String inName, String inKinds) {
		this.name = inName;
		this.kinds = inKinds;
	}

	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds+"입니다.";
	}

	public abstract void speak();
}
