package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력(1~9) : ");
		int num1 = sc.nextInt();
		if (num1 < 1 || num1 > 9) {
			System.out.println("입력하신 정수가 지정한 범위를 벗어났습니다.");
			sc.close();
			return;
		}
		System.out.print("두번째 정수 입력(1~9) : ");
		int num2 = sc.nextInt();
		if (num2 < 1 || num2 > 9) {
			System.out.println("입력하신 정수가 지정한 범위를 벗어났습니다.");
			sc.close();
			return;
		}

		System.out.println("합 : " + calc.sum(num1, num2));
		System.out.println("차 : " + calc.subtract(num1, num2));
		System.out.println("곱 : " + calc.multiply(num1, num2));
		System.out.println("나누기 : " + calc.divide(num1, num2));

		sc.close();
	}

}
