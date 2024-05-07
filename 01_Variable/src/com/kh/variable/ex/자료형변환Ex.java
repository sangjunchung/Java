package com.kh.variable.ex;

public class 자료형변환Ex {
	
	public static void main(String[] args) {
		/*
		 컴퓨터에서 계산을 할 때 값 처리 원칙
		 - 같은 자료형끼리 연산, 결과도 같은 자료형
		  
		 만약에 다른 자료형끼리 계산하는 경우 자료형을 맞게 변환(자동 형 변환)
		 - 연산시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환 > 이게 묵시적 형 변환?
		*/
		
		int num1 = 9;
		long num2 = 10000000000L;
		long result = num1 + num2;
		
		System.out.println(result);
		
		int result2 = num1 + (int) num2;
		
		System.out.println(result2);
		
		int a1 = (int) num2;
		System.out.println(a1);
		
		float fl1 = 5.14f;
		double db1 = 3.14;
		int num3 = 7;
		
		float fl2 = fl1 + num3;
		System.out.println(fl2);
		
		int num4 = (int) fl1 + num3;
		System.out.println(num4);
		
		double db2 = db1 + fl1;
		System.out.println(db2);
		
		float fl3 = (float)db1 + fl1;
		System.out.println(fl3);
		
	}
}
