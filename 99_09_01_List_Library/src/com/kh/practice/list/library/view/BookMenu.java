package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {
		int selectMenu = 0;
		boolean checkExit = true;

		while (checkExit) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			selectMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMenu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.print("프로그램을 종료합니다.");
				checkExit = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (checkExit)
				System.out.println();
		}
	}

	public void insertBook() {
		String addBookTitle = "";
		String addBookAuthor = "";
		String addBookCategory = "";
		int addBookPrice = 0;
		int categoryNum = 0;
		boolean checkCategory = true;

		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		addBookTitle = sc.nextLine();
		System.out.print("저자 명 : ");
		addBookAuthor = sc.nextLine();
		while (checkCategory) {
			System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
			categoryNum = sc.nextInt();

			switch (categoryNum) {
			case 1:
				addBookCategory = "인문";
				checkCategory = false;
				break;
			case 2:
				addBookCategory = "과학";
				checkCategory = false;
				break;
			case 3:
				addBookCategory = "외국어";
				checkCategory = false;
				break;
			case 4:
				addBookCategory = "기타";
				checkCategory = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		System.out.print("가격 : ");
		addBookPrice = sc.nextInt();
		sc.nextLine();

		bc.insertBook(new Book(addBookTitle, addBookAuthor, addBookCategory, addBookPrice));
	}

	public void selectList() {
		ArrayList<Book> selectBook = bc.selectList();

		if (selectBook.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			System.out.println("===== 도서 전체 조회 =====");
			for (Book b : selectBook) {
				System.out.println(b.toString());
			}
		}
	}

	public void searchBook() {
		String keyword = "";

		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		keyword = sc.nextLine();

		ArrayList<Book> searchList = bc.searchBook(keyword);

		if (searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Book b : searchList) {
				System.out.println(b.toString());
			}
		}
	}

	public void deleteBook() {
		String deleteBookTitle = "";
		String deleteBookAuthor = "";

		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		deleteBookTitle = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		deleteBookAuthor = sc.nextLine();

		if (bc.deleteBook(deleteBookTitle, deleteBookAuthor) == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		} else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
	}
	
	// asc = ascending - 오름차순
	public void ascBook() {
		int result = bc.ascBook();
		
		if(result == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
