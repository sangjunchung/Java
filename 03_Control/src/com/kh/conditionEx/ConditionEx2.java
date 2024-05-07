package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {

	public static void method1() {
		int money = 1500;
		String result;
		
		if(money >= 2000) {
			result = "택시를 탄다.";
		}
		else if(money >= 1500 && money <=1900) {
			result = "대중교통을 이용한다.";
		}
		else {
			result = "걸어간다.";
		}
		
		System.out.println(result);
		
	}
	
	public static void method2() {
		int age = 0;
		String result;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("안녕하세요. 티켓나라입니다.");
		System.out.print("고객님의 나이를 입력해주세요 : "); 
		age = sc.nextInt();
		
		if(0 < age && age < 14) {
			result = "어린이";
		} else if(age>13 && age <19 ) {
			result = "청소년";
		} else {
			result = "성인";
		}
		
		System.out.println(result);
		
		sc.close();
		
	}
	
	public static void method3() {
		int month = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월부터 12월 중 입력하시면 해당 월의 계절이 출력됩니다 : ");
		month = sc.nextInt();
		String result = "null";
		
		if(month > 0 && month <13) {
			if(month > 2 && month < 6) {
				result = "따뜻한 봄입니다.";
			}else if(month > 5 && month < 9) {
				result = "더운 여름입니다.";
			}else if(month > 8 && month < 12) {
				result = "시원한 가을입니다.";
			}else {
				result = "추운 겨울입니다.";
			}
		}else {
			result = month+"월은 존재하지 않습니다.";
		}
		System.out.println(result);
		
		sc.close();
	}
	
	public static void method4() {
		int age = 15;
		String result;
		
		if(age <= 13) {
			result ="어린이";
		} else if (age >= 14 && age <= 18) {
			result = "청소년";
		} else {
			result = "성인";
		}
		System.out.println(result+"입니다.");
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		method4();
	}

}
