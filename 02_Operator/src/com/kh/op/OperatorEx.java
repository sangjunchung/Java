package com.kh.op;

import java.util.Scanner;


public class OperatorEx {
	
	public static void main(String[] args) {
		int num1;
		int num2;
		int select;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 2개를 큰 수 먼저 차례대로 입력해 주세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("원하는 연상 방법을 선택해주세요(1.더하기 2.뺴기 3.곱하기 4.나누기) : ");
		select = sc.nextInt();
		
		sc.close();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(select);
	}

}
