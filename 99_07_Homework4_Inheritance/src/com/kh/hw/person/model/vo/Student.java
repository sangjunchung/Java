package com.kh.hw.person.model.vo;

public class Student extends Person {
	private int grade;
	private String major;

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public String getMajor() {
		return major;
	}

	public Student() {

	}

	public Student(String inName, int inAge, double inHeight, double inWeight, int inGrade, String inMajor) {
		super(inName, inAge, inHeight, inWeight);
		this.grade = inGrade;
		this.major = inMajor;
	}

	public String toString() {
		return super.toString() + ", 학년 : " + grade + ", 전공 : " + major;
	}
}
