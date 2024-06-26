package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	private static int bookCount = 0;

	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
		for(Book b : bArr) {
			if(b == null) {
				break;
			} else {
				bookCount++;
			}
		}
	}

	public void mainMenu() {
		int selectMainMenu = 0;

		System.out.println("1. 도서 추가 저장");
		System.out.println("2. 저장 도서 출력");
		System.out.println("9. 프로그램 끝내기");
		System.out.print("메뉴 번호 : ");
		selectMainMenu = sc.nextInt();
		sc.nextLine();

		switch (selectMainMenu) {
		case 1:
			fileSave();
			break;
		case 2:
			fileRead();
			break;
		case 9:
			System.out.println("프로그램 종료");
			return;
		}
	}

	public void fileSave() {
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판 날짜(yyyy-MM-dd) : ");
		String publicationDate = sc.nextLine();
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		sc.nextLine();
		
		String[] inDate = publicationDate.split("-");
		Calendar newDate = Calendar.getInstance();
		newDate.set(Integer.parseInt(inDate[0]), Integer.parseInt(inDate[1]), Integer.parseInt(inDate[2]));
		
		bArr[bookCount++] = new Book(title, author, price, newDate, discount);
		
		bc.fileSave(bArr);
	}

	public void fileRead() {
		for(Book b : bc.fileRead()) {
			if(!(b==null)) {
				System.out.println(b.toString());
			}
		}
	}
}
