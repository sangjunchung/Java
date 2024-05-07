package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 한 자리 정수(1~9) : ");
		int num1 = sc.nextInt();

		if (num1 < 1 || num1 > 9) {
			System.out.println("입력받은 숫자가 범위를 벗어났습니다.");
		} else {
			System.out.print("두번째 한 자리 정수(1~9) : ");
			int num2 = sc.nextInt();

			if (num2 < 1 || num2 > 9) {
				System.out.println("입력받은 숫자가 범위를 벗어났습니다.");
			} else {
				System.out.println("합 : " + (num1 + num2));
				System.out.println("차 : " + (num1 - num2));
				System.out.println("곱 : " + (num1 * num2));
				System.out.println("나누기 : " + (num1 / num2));
			}
		}
		sc.close();
	}
}
