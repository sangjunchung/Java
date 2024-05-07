package com.kh.oop.basic;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.practice2();
	}
	
	public void practice1() {
		쿠키 myCookie = new 쿠키();
		myCookie.size = "라지";
		myCookie.shape = "별모양";
		
		System.out.println("쿠기의 크기 : "+myCookie.size);
		System.out.println("쿠기의 모양 : "+myCookie.shape);
		
		쿠키 sellCookie = new 쿠키();
		sellCookie.size = "스몰";
		sellCookie.shape = "동그라미";

		System.out.println("쿠기의 크기 : "+sellCookie.size);
		System.out.println("쿠기의 모양 : "+sellCookie.shape);
	}
	
	public void practice2() {
		Nation person = new Nation();
		person.name = "홍길동";
		person.age = 55;
		person.gender = 'F';
		person.jumin = "550101-2345678";
		
		System.out.println("이름 : "+person.name);
		System.out.println("나이 : "+person.age);
		System.out.println("성별 : "+person.gender);
		System.out.println("주민번호 : "+person.jumin);
		
		person.speakKorean();
		person.welfare();
		
		Nation person2 = new Nation();
		person2.name = "신짱구";
		person2.age = 5;
		person2.gender = '여';
		
		System.out.println("이름 : "+person2.name);
		System.out.println("나이 : "+person2.age);
		System.out.println("성별 : "+person2.gender);
		
		person.납세의의무();
		person2.납세의의무();
		
	}
}
