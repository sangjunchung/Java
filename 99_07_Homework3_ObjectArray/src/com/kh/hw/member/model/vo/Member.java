package com.kh.hw.member.model.vo;

public class Member {
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public Member() {

	}

	public Member(String inId, String inName, String inPassword, String inEmail, char inGender, int inAge) {
		this.id = inId;
		this.name = inName;
		this.password = inPassword;
		this.email = inEmail;
		this.gender = inGender;
		this.age = inAge;
	}

	public String inform() {
		return "ID : " + id + ", 이름 : " + name + ", 비밀번호 : " + password + ", 이메일 : " + email + ", 성별 : " + gender
				+ ", 나이 : " + age;
	}
}
