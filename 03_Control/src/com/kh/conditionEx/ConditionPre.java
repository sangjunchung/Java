package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	public static void method1() {
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개 비교합니다.");
		System.out.print("첫번째 정수를 입력해주세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("두 정수는 동일합니다.");
		} else System.out.println("두 정수는 동일하지 않습니다.");
		
		sc.close();
	}
	
	public static void method2() {
		String str1;
		String str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 2개 비교합니다.");
		System.out.print("첫번째 문자열을 입력해주세요 : ");
		str1 = sc.nextLine();
		System.out.print("두번째 문자열을 입력해주세요 : ");
		str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println("두 문자열은 동일합니다.");
		} else System.out.println("두 문자열은 동일하지 않습니다.");
		
		sc.close();
	}
	
	public static void method3() {
		//실수 2개 비교
		double num1 = 0.0;
		double num2 = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수 2개 비교합니다.");
		System.out.print("첫번째 실수를 입력해주세요 : ");
		num1 = sc.nextDouble();
		System.out.print("두번째 실수를 입력해주세요 : ");
		num2 = sc.nextDouble();
		
		if (num1 == num2) {
			System.out.println("두 실수는 동일합니다.");
		} else System.out.println("두 실수는 동일하지 않습니다.");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
	}

}
