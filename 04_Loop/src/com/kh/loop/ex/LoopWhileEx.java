package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEx {
	
	public static void method1() {
		int sel = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (check) {
			System.out.println("1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료");
			System.out.print("원하는 번호를 눌러주세요 : ");
			
			sel = sc.nextInt();
			
			switch (sel) {
				case 1:
					System.out.println("게임하기");
					break;
				case 2:
					System.out.println("수영하기");
					break;
				case 3:
					System.out.println("잠자기");
					break;
				case 4:
					System.out.println("프로그램 종료");
					check = false;
					break;
				default : 
					System.out.println("잘못된 번호입니다. 재실행합니다.");
			}
		}
	}
	
	public static void khCafe() {
		int select = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("kh 카페에 오신걸 환영합니다. *^^* 원하는 메뉴를 입력해주세요. \n"
				+ "1. 아메리카노 2. 카페라떼 3. 녹차 4. 흑당버블티 5. 주문취소 : ");
		select = sc.nextInt();
		
			switch (select) {
				case 1:
					System.out.println("아메리카노 주문 추가되었습니다.");
					break;
				case 2:
					System.out.println("카페라떼 주문 추가되었습니다.");
					break;
				case 3:
					System.out.println("녹차 주문 추가되었습니다.");
					break;
				case 4:
					System.out.println("흑당버블티 주문 추가되었습니다.");
					break;
				case 5:
					System.out.println("주문이 취소 되었습니다. 다음에 방문해주세요.");
					return;
				default :
					System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			System.out.println();
		}
	}
	
	public static void getMoney() {
		int coffee = 10;
		int money = 300;
		
		while (money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			coffee--;
			money -= 100;
			
			System.out.println("남은 커피의 양 : "+coffee+"잔 입니다.");
			if (coffee == 0) {
				System.out.println("커피가 다 소진됐습니다. 판매를 중지합니다.");
				break;
			}
		}
	}
	
	public static void allNumber() {
		int num = 1;
		
		while(num < 6) {
			System.out.println(num);
			num++;
		}
	}
	
	public static void tree() {
		int treeHp = 10;
		int hit = 0;
		
		while (hit < 10) {
			
			hit++;
			System.out.println("나무를 "+hit+ "번 찍었습니다.");
			
			if (hit == 10) {
				System.out.println("나무 넘어갑니다.");
			}
		}
	}
	
	public static void method2() {
		int num = 0;
		int abc = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자 아무거나 입력해주세요 : ");
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("1부터 "+num+"까지의 숫자들");
			
			while(abc <= num) {
				System.out.println("abc : "+abc+", num : "+num);
				abc++;
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public static void getCoffee() {
		int myMoney = 0;
		int coffee = 100;
		String sel;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카페에 오신걸 환영합니다.");
		System.out.print("현재 가진 돈을 입력해주세요 : ");
		myMoney = sc.nextInt();
		
		while (myMoney < coffee) {
			System.out.println("현재 잔액은 "+myMoney+"원 입니다.");
			System.out.println("돈이 부족합니다. 커피를 구매하기 위해 더 많은 돈을 넣어주세요.");
			System.out.print("현재 가진 돈을 입력해주세요 : ");
			myMoney += sc.nextInt();
		}
		
		System.out.print("커피를 구매하시겠습니까? (Y/N) : ");
		sel = sc.next();
		
		switch (sel) {
			case "Y": case "y":
				System.out.println("커피를 구매했습니다.");
				myMoney -= coffee;
				System.out.println("남은 잔액은 "+myMoney+"원 입니다.");
				break;
			case "N": case "n":
				System.out.println("주문이 취소되었습니다.");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
		}
	}
	
	public static void iLovePork() {
		int myMoney = 0;
		int tangsuyuk = 10000;
		String sel;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 보유하고 있는 금액을 입력해주세요 : ");
		myMoney = sc.nextInt();
		
		while (myMoney < tangsuyuk) {
			System.out.println("잔액이 부족합니다. 현재 잔액은 "+myMoney+"원 입니다.");
			System.out.print("추가로 얼마나 입급하시겠습니까? : ");
			myMoney += sc.nextInt();
		}
		
		System.out.print("탕수육을 구매하시겠습니까? (Y/N) : ");
		sel = sc.next();
		
		switch (sel) {
			case "Y": case "y":
				System.out.println("탕수육을 구매했습니다.");
				myMoney -= tangsuyuk;
				System.out.println("남은 잔액은 "+myMoney+"원 입니다.");
				break;
			case "N": case "n":
				System.out.println("주문이 취소되었습니다.");
				break;
			default :
				System.out.println("잘못된 입력입니다.");
		}
	}
	
	public static void main(String[] args) {
		//method1();
		//khCafe();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		iLovePork();
	}

}
