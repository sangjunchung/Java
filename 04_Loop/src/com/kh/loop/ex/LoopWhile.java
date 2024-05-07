package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {

	public static void inLoop() {
		
		while(true) {
			System.out.println("무한 실행");
		}
	}
	
	public static void outLoop() {
		/*
		while(false) {
			System.out.println("실행 안됨");
		}
		*/
	}
	
	public static void whileLoop() {
		int i = 1;
		
		while (i <= 2) {
			System.out.println("i 의 값 : "+i);
			i++;
		}
	}
	
	public static void whileLoopEx() {
		int num = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (check) {
			System.out.println("1. 실행 2. 종료");
			System.out.print("원하는 숫자를 입력하세요 : ");
			
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.println("프로그램을 실행합니다.");
					System.out.println();
					break;
				case 2:
					System.out.println("프로그램을 종료합니다.");
					check = false;
					break;
				default :
					System.out.println("잘못된 번호입니다. 번호를 다시 입력해주세요.");
					System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		//inLoop();
		//whileLoop();
		whileLoopEx();
	}
}
