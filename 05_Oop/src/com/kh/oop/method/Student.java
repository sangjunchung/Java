package com.kh.oop.method;

public class Student {
	
	private String name;
	private int age;
	private int grade;
	
	public Student() {
		
	}
	
	public Student(String inName, int inAge, int inGrade) {
		this.name = inName;
		this.age = inAge;
		this.grade = inGrade;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void info() {
		System.out.println("학생의 이름 : "+name);
		System.out.println("학생의 나이 : "+age);
		System.out.println("학생의 학년 : "+grade);
	}
	
	public static void main(String[] args) {
		Student std1 = new Student("박영수", 15, 2);
		Student std2 = new Student("김영희", 17, 1);
		
		std1.info();
		std2.info();
	}

}
