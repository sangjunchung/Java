package sup3.controller;

import java.util.Scanner;

import sup3.sample.Calculator;

public class TestSup3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		Calculator calc = new Calculator(num1, num2);
		calc.displayResult();
		
		sc.close();
	}
}
