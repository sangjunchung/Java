package com.kh.op;

import java.util.Scanner;
// Class 바깥에는 package 와 import만 작성할 수 있음
// 이외 개발자가 실행하고자 하는 내용은 Class 내부에 작성해줘야함

public class OperatorEx2 {
	// 1. 스캐너를 사용하지 않는 메서드
	public static void method1() {
		int num1 = 20;
		int num2 = 5;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("더하기 : " + sum);
		System.out.println("빼기 : " + sub);
		System.out.println("곱하기 : " + mul);
		System.out.println("나누기 : " + div);
	}
	
	public static void method2() {
		double num3 = 1.4;
		double num4 = 2.5;
		
		double sum = num3 + num4;
		double sub = num3 - num4;
		double mul = num3 * num4;
		double div = num3 / num4;
		
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num5 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num6 = sc.nextInt();
		
		int sum1 = num5 + num6;
		int sub1 = num5 - num6;
		int mul1 = num5 * num6;
		int div1 = num5 / num6;
		
		System.out.println("sum1 : " + sum1);
		System.out.println("sub1 : " + sub1);
		System.out.println("mul1 : " + mul1);
		System.out.println("div1 : " + div1);
	}
	
	public static void method4() {
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("첫번째 실수를 입력하세요 : ");
		double num7 = sc2.nextDouble();
		System.out.print("두번째 실수를 입력하세요 : ");
		double num8 = sc2.nextDouble();
		
		double sum2 = num7 + num8;
		double sub2 = num7 - num8;
		double mul2 = num7 * num8;
		double div2 = num7 / num8;
		
		System.out.println("sum2 : " + sum2);
		System.out.println("sub2 : " + sub2);
		System.out.println("mul2 : " + mul2);
		System.out.println("div2 : " + div2);
		
		sc2.close();
	}
	
	public static void main(String[] args) {
		method1();
		System.out.println();
		method2();
		System.out.println();
		method3();
		System.out.println();
		method4();
	}
}
