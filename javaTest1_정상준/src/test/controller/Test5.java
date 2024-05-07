package test.controller;

import java.util.Scanner;

public class Test5 {

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
				if (num1 * num2 > 9) {
					System.out.println("결과는 " + (num1 * num2) + "로 두 자리 수입니다.");
				} else {
					System.out.println("결과는 " + (num1 * num2) + "로 한 자리 수입니다.");
				}
			}
		}
		sc.close();
	}
}
