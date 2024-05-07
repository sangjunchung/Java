package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	String kind;
	String name;
	String flavor;
	int numOf;
	int price;
	boolean check = true;
	char answer;
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		SnackController scr = new SnackController();
		

		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		kind = sc.next();
		System.out.print("이름 : ");
		name = sc.next();
		sc.nextLine();
		System.out.print("맛 : ");
		flavor = sc.nextLine();
		System.out.print("개수 : ");
		numOf = sc.nextInt();
		System.out.print("가격 : ");
		price = sc.nextInt();
			
		scr.saveData(kind, name, flavor, numOf, price);
		
		while(check) {
			System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
			answer = sc.next().charAt(0);
		
			switch (answer) {
				case 'y': case 'Y':
					scr.confirmData();
					check = false;
					break;
				case 'n': case 'N':
					System.out.println("프로그램을 종료합니다.");
					check = false;
					break;
				default:
					System.out.println("잘못된 입력입니다.");
			}
		}
		sc.close();
	}
}
