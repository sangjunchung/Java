package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void mainMenu() {
		int selectMenu = 0;
		boolean menuExit = true;
		while (menuExit) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			selectMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMenu) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.print("프로그램 종료");
				menuExit = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (menuExit)
				System.out.println();
		}
	}

	public void addList() {
		String addLastTitle = "";
		String addLastSinger = "";
		int addcheck = 0;

		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		addLastTitle = sc.nextLine();
		System.out.print("가수 명 : ");
		addLastSinger = sc.nextLine();

		addcheck = mc.addList(new Music(addLastTitle, addLastSinger));
		if (addcheck == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void addAtZero() {
		String addFirstTitle = "";
		String addFirstSinger = "";
		int addcheck = 0;

		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		addFirstTitle = sc.nextLine();
		System.out.print("가수 명 : ");
		addFirstSinger = sc.nextLine();

		addcheck = mc.addAtZero(new Music(addFirstTitle, addFirstSinger));
		if (addcheck == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		System.out.println(mc.printAll());
	}

	public void searchMusic() {
		String searchTitle = "";

		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		searchTitle = sc.nextLine();

		Music result = mc.searchMusic(searchTitle);
		if (result == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else {
			System.out.println("검색 한 곡은 (" + result.toString() + ") 입니다.");
		}
	}

	public void removeMusic() {
		String removeTitle = "";

		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		removeTitle = sc.nextLine();

		Music result = mc.removeMusic(removeTitle);
		if (result == null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else {
			System.out.println("(" + result.toString() + ")을 삭제 했습니다.");
		}
	}

	public void setMusic() {
		String searchTitle = "";
		String setTitle = "";
		String setSinger = "";

		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		searchTitle = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		setTitle = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		setSinger = sc.nextLine();

		Music result = mc.setMusic(searchTitle, new Music(setTitle, setSinger));
		if (result == null) {
			System.out.println("수정할 곡이 없습니다.");
		} else {
			System.out.println("(" + result.toString() + ")의 값이 변경 되었습니다.");
		}
	}

	public void ascTitle() {
		int result = mc.ascTitle();

		if (result == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
	}

	public void descSinger() {
		int result = mc.descSinger();

		if (result == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
	}
}