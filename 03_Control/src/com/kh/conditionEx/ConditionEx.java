package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx {

	public static void method1() {
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객님의 나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if(age > 18) System.out.println("고객님은 성인입니다.");
		else System.out.println("고객님은 성인이 아닙니다.");
			
		sc.close();
	}
	
	public static void method2() {
		int num = 2;
		
		if((num%2) == 0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
	}
	
	public static void method3() {
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객님의 나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		if(age > 13) System.out.println("어린이가 아닙니다.");
		else if(age > 0)System.out.println("어린이입니다.");
		
		sc.close();
	}
	
	public static void practice1() {
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		if((age > 9) && (age < 20)) System.out.println("10대 입니다.");
		else System.out.println("10대가 아닙니다.");	
		
		sc.close();
	}
	
	public static void practice2() {
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		if(age > 79) System.out.println("80세 이상입니다.");
		else System.out.println("80세 이상이 아닙니다.");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//practice1();
		practice2();
		
	}

}
