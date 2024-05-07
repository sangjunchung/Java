package com.kh.example.practice1.model.vo;

public class Member {
	String memberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;
	String email;
	
	public Member() {
		
	}
	
	public void changeName(String inname) {
		this.memberName = inname;
	}
	
	public void printName() {
		System.out.println("해당 멤버의 이름은 "+memberName+" 입니다.");
	}
	
	public String changeEmail(String inEmail) {
		this.email = inEmail;
		return email;
	}
}
