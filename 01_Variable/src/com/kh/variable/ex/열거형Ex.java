package com.kh.variable.ex;

/*
Enum(열거형) 상수 명을 나열해놓은 것   

메서드
	values() : Enum에 적어놓은 모든 상수를 배열로 반환
	valueOf(String 이름) : 이름과 일치하는 Enum 상수를 반환
	ordinal() : Enum 상수의 순서를 전달
	name() : Enum 상수의 이름 반환
	compareTo(EnumType e) : 다른 Enum 상수와 순서 비교
	toString() : Enum 상수의 문자열 표현 반환
	getClass() : Enum 클래스의 Class 객체 반환
*/

public class 열거형Ex {

	public enum days {
		월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
	}

	public static void main(String[] args) {
		System.out.println("월요일 : " + days.월요일);
		System.out.println("화요일 : " + days.화요일);
		System.out.println("수요일 : " + days.수요일);
		System.out.println("목요일 : " + days.목요일);
		System.out.println("금요일 : " + days.금요일);
		System.out.println("토요일 : " + days.토요일);
		System.out.println("일요일 : " + days.일요일);
	}
}
