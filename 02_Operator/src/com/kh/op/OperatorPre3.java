package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
	
	public static void method1() {
		int num1 = 0;
		int num2 = 0;
		boolean result1;
		boolean result2;
		boolean result3;
		boolean result4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		num2 = sc.nextInt();
		
		result1 = (num1 > num2);
		result2 = (num1 >= num2);
		result3 = (num1 < num2);
		result4 = (num1 <= num2);
		
		System.out.println("num1 > num2 : "+result1);
		System.out.println("num1 >= num2 : "+result2);
		System.out.println("num1 < num2 : "+result3);
		System.out.println("num1 <= num2 : "+result4);
		
		sc.close();
	}
	
	public static void method2() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean result;
		boolean exit = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(exit) {
			System.out.println("서로 다른 숫자 세 개 입력시 비교해서 출력합니다.");
			System.out.print("첫번째 정수를 입력해주세요 : ");
			num1 = sc.nextInt();
			System.out.print("두번째 정수를 입력해주세요 : ");
			num2 = sc.nextInt();
			if(num1 == num2) {
				System.out.println();
				System.out.println("두번째 입력하신 정수와 첫번째 정수와 동일합니다.");
				System.out.println("동일한 수 한번 더 입력시 프로그램은 종료됩니다.");
				System.out.print("두번째 정수를 다시 입력해주세요 : ");
				num2 = sc.nextInt();
				if(num1 == num2) {
					System.out.println();
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			System.out.print("세번째 정수를 입력해주세요 : ");
			num3 = sc.nextInt();
			if((num3 == num1) || (num3 == num2)) {
				System.out.println();
				System.out.println("세번째 입력하신 정수와 기존에 입력했던 정수와 동일합니다.");
				System.out.println("기존에 입력하였던 정수를 한번 더 입력시 프로그램은 종료됩니다.");
				System.out.print("세번째 정수를 다시 입력해주세요 : ");
				num3 = sc.nextInt();
				if((num3 == num1) || (num3 == num2)) {
					System.out.println();
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			
			//result = (num1 < num2) && (num2 == num3);
			//System.out.println("result : "+result);
				
			if((num1 > num2) && (num1 > num3)) {
				if(num2 > num3) {
					System.out.println();
					System.out.println("숫자 1 : "+num1+", 숫자 2 : "+num2+", 숫자 3 : "+num3+" 입니다.");
					System.out.println("내림차순으로 정렬시 : "+num1+", "+num2+", "+num3+" 입니다.");
				}
				else {
					System.out.println();
					System.out.println("숫자 1 : "+num1+", 숫자 2 : "+num2+", 숫자 3 : "+num3+" 입니다.");
					System.out.println("내림차순으로 정렬시 : "+num1+", "+num3+", "+num2+" 입니다.");
				}
			}
			else if((num2 > num1) && (num2 > num3)) {
				if(num1 > num3) {
					System.out.println();
					System.out.println("숫자 1 : "+num1+", 숫자 2 : "+num2+", 숫자 3 : "+num3+" 입니다.");
					System.out.println("내림차순으로 정렬시 : "+num2+", "+num1+", "+num3+" 입니다.");
				}
				else {
					System.out.println();
					System.out.println("숫자 1 : "+num1+", 숫자 2 : "+num2+", 숫자 3 : "+num3+" 입니다.");
					System.out.println("내림차순으로 정렬시 : "+num2+", "+num3+", "+num1+" 입니다.");
				}
			}
			else{
				if(num1 > num2) {
					System.out.println();
					System.out.println("숫자 1 : "+num1+", 숫자 2 : "+num2+", 숫자 3 : "+num3+" 입니다.");
					System.out.println("내림차순으로 정렬시 : "+num3+", "+num1+", "+num2+" 입니다.");
				}
				else {
					System.out.println();
					System.out.println("숫자 1 : "+num1+", 숫자 2 : "+num2+", 숫자 3 : "+num3+" 입니다.");
					System.out.println("내림차순으로 정렬시 : "+num3+", "+num2+", "+num1+" 입니다.");
				}
			}
			System.out.println();
			exit = false;
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		//method1();
		method2();
	}

}
