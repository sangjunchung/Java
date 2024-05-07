package com.kh.op;

public class OperatorEx3 {
	
	public static void main(String[] args) {
		/*
		 증감 연산자 : ++, --
		 전위 연산자 : 먼저 더하기/빼기를 한 다음에 다른 계산을 실행
		 후위 연산자 : 다른 계산 먼저 한 다음에 더하기/빼기를 진행  
		*/
		
		int a = 10;
		int b = ++a;
		int c = 10;
		int d = c++;
		
		System.out.println("a : "+a+" , "+"b : "+b);
		System.out.println("c : "+c+" , "+"d : "+d);
		
	}
}
