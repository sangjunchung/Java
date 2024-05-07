package com.kh.variable.ex;

public class 상수Ex {

	public static void main(String[] args) {
		// 상수 (final) : 한 번 값을 기록하면 값을 바꿀 수 없는 변수
		// 상수명 작성 : 대문자로 작성, 연결되는 단어 사이는 _로 연결
		// 상수를 대문자로 작성하는 것은 개발자간의 규칙
		
		final double PI = 3.1415926538;
		final int NUMBER = 10;
		final int MIN = 0;
		final int MAX = 100;
		final String STR = "Hello World!";
		
		System.out.println(PI);
		System.out.println(NUMBER);
		System.out.println(MIN);
		System.out.println(MAX);
		System.out.println(STR);
	}
}
