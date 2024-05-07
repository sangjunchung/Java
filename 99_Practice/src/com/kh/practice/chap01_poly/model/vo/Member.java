package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount += couponCount;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public Member() {

	}

	public Member(String inName, int inAge, char inGender) {
		this.name = inName;
		this.age = inAge;
		this.gender = inGender;
	}

	@Override
	public String toString() {
		return "회원명 : " + name + ", 회원나이 : " + age + ", 성별 : " + gender + ", 요리학원쿠폰개수 : " + couponCount;
	}
}
