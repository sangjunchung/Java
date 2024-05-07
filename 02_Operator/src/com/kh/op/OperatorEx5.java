package com.kh.op;

public class OperatorEx5 {

	public static void main(String[] args) {
		/*
		비교 연산자
		== : 서로 같으면 true
		!= : 서로 다르면 true
		
		논리 연산자
		&& : 양쪽의 조건 중 모두 true면 true
		|| : 양쪽의 조건 중 하나라도 true면 true
		*/
		
		int num1 = 10;
		int num2 = 20;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 < num2);
		
		System.out.println("num1 == num2 : "+result1);
		System.out.println("num1 != num2 : "+result2);
		System.out.println("num1 < num2  : "+result3);
		
	}

}
