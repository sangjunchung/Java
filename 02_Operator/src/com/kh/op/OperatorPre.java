package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	// 메서드 : 특정 상태나 기능을 정리해놓은 집합
	// static : 단독으로 메모리에서 사용할 수 있게함
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	
	public static int mul(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public static int div(int a, int b) {
		int result = a / b;
		return result;
	}
	
	public static void main(String[] args) {
		int num1;
		int num2;
		int select;
		int total = 0;
		int agree;
		String oper = "null";
		boolean onoff = true;
		boolean exit = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(onoff) {			
			System.out.println("두 정수를 사칙연산하는 계산기 입니다.");
			System.out.print("첫번째 정수를 입력해 주세요 : ");
			num1 = sc.nextInt();
			System.out.print("두번째 정수를 입력해 주세요 : ");
			num2 = sc.nextInt();
			
			System.out.print("원하는 연상 방법을 선택해주세요(1.더하기 2.뺴기 3.곱하기 4.나누기 9. 종료) : ");
			select = sc.nextInt();
			
			if(select == 9) {
				System.out.println("계산기를 종료합니다.");
				break;
			}
			if(0 < select && select < 5) {
				switch(select) {		
					case 1:
						total = sum(num1, num2);
						oper = "더하기";
						break;
					case 2:
						total = sub(num1, num2);
						oper = "빼기";
						break;
					case 3:
						total = mul(num1, num2);
						oper = "곱하기";
						break;
					case 4:
						if(num2 != 0) {
						total = div(num1, num2);
						oper = "나누기";
						break;
						}
						else {
							System.out.println("2번째 숫자가 0일때 나누기는 할수 없습니다.");
							System.out.print("0이 아닌 다른 숫자를 입력해 주세요(0 입력시 계산기 종료) : ");
							num2 = sc.nextInt();
							
							if(num2 != 0) {
							total = div(num1, num2);
							oper = "나누기";
							break;
							}
							else {
								System.out.println("계산기를 종료합니다.");
								exit = true;
								break;
							}
							
						}
				}
				if(exit) { 
					sc.close();
					break;
				}
				System.out.println();
				System.out.println("두 정수의 "+oper+" 결과는 : "+ total + " 입니다.");
				System.out.println();
			}
			else {
				System.out.println("지정되지 않은 숫자를 입력하셨습니다.");
			}
			System.out.print("계산기를 다시 실행하려면 1, 아니면 임의의 숫자를 입력해 주세요 : ");
			agree = sc.nextInt();
			
			if(agree != 1) {
				System.out.println("계산기를 종료합니다.");
				onoff = false;
			}
			System.out.println();
		}
		sc.close();
	}

}
