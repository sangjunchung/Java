package com.kh.practice.chap01_poly.view;

import java.util.Scanner;
import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		String nName = "";
		int nAge = 0;
		char nGender = ' ';
		boolean checkExit = true;
		int selectMenu = 0;

		System.out.print("이름 : ");
		nName = sc.nextLine();
		System.out.print("나이 : ");
		nAge = sc.nextInt();
		System.out.print("성별(M/F) : ");
		nGender = sc.next().charAt(0);
		
		lc.insertMember(nName, nAge, nGender);

		while (checkExit) {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			selectMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMenu) {
			case 1:
				System.out.println(lc.myInfo().toString());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rendBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				checkExit = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void selectAll() {
		for (int i=0; i<lc.selectAll().length; i++) {
			if (lc.selectAll()[i] instanceof AniBook) {
				AniBook ani = (AniBook) lc.selectAll()[i];
				System.out.println((i+1)+"번 도서 : AniBook " + ani.toString());
			} else {
				CookBook cb = (CookBook) lc.selectAll()[i];
				System.out.println((i+1)+"번 도시 :CookBook " + cb.toString());
			}
		}
	}

	public void searchBook() {
		String keyword = "";

		System.out.print("검색할 제목 키워드 : ");
		keyword = sc.nextLine();

		if (lc.searchBook(keyword) == null) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			for (Book b : lc.searchBook(keyword)) {
				if (b instanceof AniBook) {
					AniBook ani = (AniBook) b;
					System.out.println("AniBook " + ani.toString());
				} else {
					CookBook cb = (CookBook) b;
					System.out.println("CookBook " + cb.toString());
				}
			}
		}
	}

	public void rendBook() {
		int selBook = 0;
		
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		selBook = sc.nextInt();
		sc.nextLine();
		
		selBook = lc.rentBook(selBook-1);
		if(selBook==1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if(selBook==2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		} else {
			System.out.println("성공적으로 대여되었습니다.");
		}
	}
}
