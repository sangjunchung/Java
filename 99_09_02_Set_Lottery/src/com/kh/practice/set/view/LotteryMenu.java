package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	private Scanner sc = new Scanner(System.in);
	private LotteryController lc = new LotteryController();

	public void mainMenu() {
		int selectMenu = 0;
		boolean checkExit = true;

		System.out.println("========== KH 추첨 프로그램 ==========");

		while (checkExit) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			selectMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMenu) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.print("프로그램 종료");
				checkExit = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (checkExit)
				System.out.println();
		}
	}

	public void insertObject() {
		int insertNum = 0;
		int count = 0;
		String insertName = "";
		String insertPhone = "";

		System.out.print("추가할 추첨 대상 수 : ");
		insertNum = sc.nextInt();
		sc.nextLine();

		while (count < insertNum) {
			System.out.print("이름 : ");
			insertName = sc.nextLine();
			System.out.print("핸드폰 번호 : ");
			insertPhone = sc.nextLine();
			System.out.println();

			boolean checkInsert = lc.insertObject(new Lottery(insertName, insertPhone));

			if (checkInsert) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
			} else {
				count++;
			}
		}
		System.out.println(count + "명 추가 완료되었습니다.");
	}

	public void deleteObject() {
		String deleteName = "";
		String deletePhone = "";

		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		deleteName = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		deletePhone = sc.nextLine();

		if (lc.deleteObject(new Lottery(deleteName, deletePhone))) {
			System.out.println("삭제 완료 되었습니다.");
		} else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}

	public void winObject() {
		if (lc.winObject().isEmpty()) {
			System.out.println("당첨 대상을 확인하기 위해서는 추첨 대상이 4명 이상있어야 합니다.");
		} else {
			System.out.println(lc.winObject());
		}

	}

	public void sortedWinObject() {
		if (lc.sortedWinObject() == null) {
			System.out.println("현재 당첨 대상자가 없습니다. 당첨 대상 확인을 먼저 진행해주세요.");
		} else {
			Iterator<Lottery> it = lc.sortedWinObject().iterator();

			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
	}

	public void searchWinner() {
		String searchWinName = "";
		String searchWinPhone = "";

		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		searchWinName = sc.nextLine();
		System.out.print("핸드폰 번호('-'빼고) : ");
		searchWinPhone = sc.nextLine();

		if (lc.searchWinner(new Lottery(searchWinName, searchWinPhone))) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		} else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}

	}

}
