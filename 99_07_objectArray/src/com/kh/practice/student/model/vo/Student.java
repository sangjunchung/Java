package com.kh.practice.student.model.vo;

public class Student {
	private String name;
	private String subject;
	private int score;

	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}

	public Student() {

	}

	public Student(String inName, String inSubject, int inScore) {
		this.name = inName;
		this.subject = inSubject;
		this.score = inScore;
	}

	public String inform() {
		return "이름 : " + name + " / 과목 : " + subject + " / 점수 : " + score;
	}
}
