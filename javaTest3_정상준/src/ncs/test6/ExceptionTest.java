package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.print("2 ~ 5 사이 정수 입력 : ");
		int num = sc.nextInt();

		Calculator calc = new Calculator();
		System.out.println("결과값 : " + calc.getSum(num));

		sc.close();
	}
}
