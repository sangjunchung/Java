package com.kh.example.practice4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {
		
	}
	
	public void setStudent(int inGrade, int inClassroom, String inName, double inHeight, char inGender) {
		this.grade = inGrade;
		this.classroom = inClassroom;
		this.name = inName;
		this.height = inHeight;
		this.gender = inGender;
	}
	
	public void information() {
		System.out.println("학년 : "+grade);
		System.out.println("반 : "+classroom);
		System.out.println("이름 : "+name);
		System.out.println("몸무게 : "+height);
		System.out.println("성별 : "+gender);
	}
}
