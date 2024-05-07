package com.kh.oop.basic;

public class Student {
	String studentName;
	int age;
	int grade;
	
	public Student(String inName, int inAge, int inGrade) {
		this.studentName = inName;
		this.age = inAge;
		this.grade = inGrade;
	}
	
	public void info() {
		System.out.printf("학생의 이름 : %s, 나이 : %d, 학년 : %d 입니다.\n", studentName, age, grade);
	}
	
	public static void main(String[] args) {
		Student std1 = new Student("김철수", 18, 3);
		Student std2 = new Student("박영희", 20, 2);
		
		std1.info();
		std2.info();
	}
}
