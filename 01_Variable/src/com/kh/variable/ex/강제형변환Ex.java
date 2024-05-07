package com.kh.variable.ex;

public class 강제형변환Ex {
	public static void main(String[] args) {
		/*
		강제 형 변환
		1. 값의 범위가 큰 자료형 -> 작은 자료형으로 강제 변환 -> 데이터 손실 발생 할 수 있음
		(자료형) 변수명 -> 지정된 자료형으로 변경됨 > 이게 명시적 형 변환?  
		*/
		
		int num1 = 290;
		byte result1 = (byte) num1;
		
		System.out.println(result1);
		
	}
}
