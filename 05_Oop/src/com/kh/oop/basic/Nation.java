package com.kh.oop.basic;

public class Nation {
	// 속성 값
	String name = "";
	int age = 0;
	char gender = ' ';
	String jumin = "";
	
	// 메서드 기능
	public void speakKorean() {
		System.out.println("가나다라 한국어 가능");
	}
	
	public void welfare() {
		System.out.println("대한민국 복지 누리기 가능!");
	}
	
	public void 납세의의무() {
		if(age >= 19) {
			System.out.println(name+" 님은 세금 남부 대상자입니다.");
		} else {
			System.out.println(name+" 님은 미성년자로 세금 납부 대상자가 아닙니다.");
		}
	}
}
