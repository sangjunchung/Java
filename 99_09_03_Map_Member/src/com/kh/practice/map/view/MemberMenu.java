package com.kh.practice.map.view;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public void mainMenu() {
		int selectMain = 0;
		boolean checkExit = true;

		System.out.println("========== KH 사이트 ==========");

		while (checkExit) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			selectMain = sc.nextInt();
			sc.nextLine();

			switch (selectMain) {
			case 1:
				joinMembership();
				break;
			case 2:
				login();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.print("프로그램 종료.");
				checkExit = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

			if (checkExit)
				System.out.println();
		}
	}

	public void memberMenu() {
		int selectMemberMenu = 0;
		boolean checkLogout = true;

		while (checkLogout) {
			System.out.println("=====***** 회원 메뉴 *****=====");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 입력 : ");
			selectMemberMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMemberMenu) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.print("로그아웃 되었습니다.");
				checkLogout = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void joinMembership() {
		String newId = "";
		String newPW = "";
		String newName = "";
		boolean checkId = true;

		System.out.println("=====***** 회원 가입 *****=====");

		while (checkId) {
			System.out.print("아이디 : ");
			newId = sc.nextLine();
			System.out.print("비밀번호 : ");
			newPW = sc.nextLine();
			System.out.print("이름 : ");
			newName = sc.nextLine();

			if (mc.joinMembership(newId, new Member(newPW, newName))) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				checkId = false;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
	}

	public void login() {
		String inId = "";
		String inPW = "";
		String outName = "";
		boolean checkLogin = true;

		System.out.println("=====***** 로그인 *****=====");

		while (checkLogin) {
			System.out.print("아이디 : ");
			inId = sc.nextLine();
			System.out.print("비밀번호 : ");
			inPW = sc.nextLine();

			outName = mc.login(inId, inPW);
			if (outName == null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			} else {
				System.out.println(outName + "님, 환영합니다!");
				checkLogin = false;
			}
		}
		memberMenu();
	}

	public void changePassword() {
		String inId = "";
		String nowPW = "";
		String newPW = "";
		boolean checkChangePW = true;

		System.out.println("=====***** 비밀번호 변경 *****=====");

		while (checkChangePW) {
			System.out.print("아이디 : ");
			inId = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			nowPW = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			newPW = sc.nextLine();

			if (mc.changePassword(inId, nowPW, newPW)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				checkChangePW = false;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void changeName() {
		String inId = "";
		String inPW = "";
		String newName = "";
		String oldName = "";
		boolean checkChangeName = true;

		while (checkChangeName) {
			System.out.print("아이디 : ");
			inId = sc.nextLine();
			System.out.print("비밀번호 : ");
			inPW = sc.nextLine();

			oldName = mc.login(inId, inPW);

			if (oldName == null) {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			} else {
				System.out.println("현재 설정된 이름 : " + oldName);
				checkChangeName = false;
			}
		}
		System.out.print("변경할 이름 : ");
		newName = sc.nextLine();

		mc.changeName(inId, newName);
	}

	public void sameName() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.nextLine();
				
		TreeMap<String, String> tree = new TreeMap<>(mc.sameName(searchName));
		if(tree.isEmpty()) {
			System.out.println("검색한 회원은 존재하지 않습니다.");
		} else {
			for(Map.Entry<String, String> m : tree.entrySet()) {
				System.out.println(m.getValue()+" - "+m.getKey());
			}
		}
	}
}
