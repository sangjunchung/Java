package com.kh.practice.chap02.loop;

import java.math.BigInteger;
import java.util.Scanner;

public class LoopPractice {
	
	public void geeting() {
		System.out.println("안녕하세요.");
	}
	
	public void geeting2() {
		System.out.println("반갑습니다.");
	}
	
	public void practice1() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.print((i+1)+" ");
				if(((i+1)%10) == 0) System.out.println();
			}
		} else System.out.println("1 이상의 숫자를 입력해주세요.");
	}
	
	public void practice2() {
		int num = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(check) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num > 0) {
				for (int i = 0; i < num; i++) {
					System.out.print((i+1)+" ");
					if(((i+1)%10) == 0) System.out.println();
				}
				check = false;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.println();
			}
		}
	}
	
	public void practice3() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.print((i)+" ");
				if(((i)%10) == 1) System.out.println();
			}
		} else System.out.println("1 이상의 숫자를 입력해주세요.");
	}
	
	public void practice4() {
		int num = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(check) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print((i)+" ");
					if(((i)%10) == 1) System.out.println();
				}
				check = false;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.println();
			}
		}
	}
	
	public void practice5() {
		int num = 0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			total += i;
			if (i == num) {
				System.out.println(i+" = "+total);
			}else System.out.print(i+" + ");
		}
	}
	public void practice6() {
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("첫번째 숫자 : ");
		num2 = sc.nextInt();
		
		if (num1 > 0 && num2 > 0) {
			if (num1 == num2) {
				System.out.println(num1);
			} else if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i+ " ");
				} 
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i+" ");
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice7() {
		int num1 = 0;
		int num2 = 0;
		boolean check = true;
		int count = 1;
		int min = 0;
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(check) {
			System.out.print("첫번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두번째 숫자 : ");
			num2 = sc.nextInt();
			
			min = Math.min(num1, num2);
			max = Math.max(num1, num2);
			// Math 클래스에 있는 random 보다 Random 클래스에 있는 random 이 기능이 더 많지만 둘 다 사용하는데 큰 차이는 없음
			if(num1 > 0 && num2 > 0) {
				if (min == max) {
					System.out.println(min);
					break;
				} 
				for (int i = min; i <= max; i++) {
					System.out.print(i+" ");
					if ((count%10) == 0) System.out.println();
					count++;
				}
				check = false;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.println();
			}
		}
	}
	
	public void practice8() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		num = sc.nextInt();
		
		System.out.println("===== "+num+"단 =====");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num*i));
		}
	}
	
	public void practice9() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		num = sc.nextInt();
		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			return;
		}
		while(true) {
			if (num > 9) {
				break;
			}
			System.out.println("===== "+num+"단 =====");
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", num, i, (num*i));
			}
			num++;
		}
	}
	
	public void practice10() {
		int num = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(check) {
			System.out.print("숫자 : ");
			num = sc.nextInt();
			if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			while(true) {
				if (num > 9) {
					check = false;
					break;
				}
				System.out.println("===== "+num+"단 =====");
				for (int i = 1; i < 10; i++) {
					System.out.printf("%d * %d = %d\n", num, i, (num*i));
				}
				num++;
			}
		}
	}
	
	public void practice11() {
		int num = 0;
		int dif = 0;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		num = sc.nextInt();
		System.out.print("공차 : ");
		dif = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			total = num + (dif * i);
			System.out.print((total)+" ");
			if (dif == 0) {
				break;
			}
		}
	}
	
	public void practice12() {
		int num1 = 0;
		int num2 = 0;
		int total = 0;
		String oper = "";
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (check) {
			System.out.print("연산자(+, -, *, /, %) : ");
			oper = sc.next();
			if(oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.print("정수 1: ");
			num1 = sc.nextInt();
			System.out.print("정수 2: ");
			num2 = sc.nextInt();
			
			switch (oper) {
				case "+":
					total = num1 + num2;
					break;
				case "-":
					total = num1 - num2;
					break;
				case "*":
					total = num1 * num2;
					break;
				case "/":
					if (num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						System.out.println();
						continue;
					}
					total = num1 / num2;
					break;
				case "%":
					if (num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						System.out.println();
						continue;
					}
					total = num1 % num2;
					break;
				default :
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
					System.out.println();
					continue;
			}
			System.out.printf("%d %s %d = %d\n", num1, oper, num2, total);
			System.out.println();
		}
	}
	
	public void practice13() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <=num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice15() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
