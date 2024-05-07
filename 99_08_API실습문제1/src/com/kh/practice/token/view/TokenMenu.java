package com.kh.practice.token.view;

import java.util.Scanner;
import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		int selectMenu = 0;
		boolean exitMenu = true;

		while (exitMenu) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			selectMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMenu) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 3:
				System.out.print("프로그램을 종료합니다.");
				exitMenu = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if(exitMenu) System.out.println();
		}
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";

		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());

		str = tc.afterToken(str);

		System.out.println("토큰 처리 후 글자 : " + str);
		System.out.println("토큰 처리 후 개수 : " + str.length());
		System.out.println("모두 대문자로 변환 : " + str.toUpperCase());
		System.out.println("모두 소문자로 변환 : " + str.toLowerCase());
	}

	public void inputMenu() {
		String inputStr = "";
		char keyword = ' ';
		
		System.out.print("문자열을 입력하세요 : ");
		inputStr = sc.nextLine();
		
		inputStr = tc.firstCap(inputStr);
		System.out.println(inputStr);
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		keyword = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println(inputStr+"에서 문자 "+keyword+" 의 개수는 "+tc.findChar(inputStr, keyword)+"개 입니다.");
	}
}
