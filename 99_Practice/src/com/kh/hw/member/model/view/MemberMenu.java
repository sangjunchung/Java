package com.kh.hw.member.model.view;

import java.util.Scanner;

import com.kh.hw.member.model.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {

	}

	public void mainMenu() {
		int num = 0;
		boolean check = true;

		while (check) {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + MemberController.count + "명입니다.");
			if (MemberController.SIZE == MemberController.count) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			} else
				System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				insertMember();
				break;
			case 2:
				if (mc.count == 0) {
					System.out.println("등록되어 있는 회원이 없어 검색 할 수 없습니다.");
					System.out.println("회원 등록 먼저 해주세요.");
				} else {
					searchMember();
				}
				break;
			case 3:
				if (mc.count == 0) {
					System.out.println("등록되어 있는 회원이 없어 수정 할 수 없습니다.");
					System.out.println("회원 등록 먼저 해주세요.");
				} else {
					updateMember();
				}
				break;
			case 4:
				if (mc.count == 0) {
					System.out.println("등록되어 있는 회원이 없어 삭제 할 수 없습니다.");
					System.out.println("회원 등록 먼저 해주세요.");
				} else {
					deleteMember();
				}
				break;
			case 5:
				if (mc.count == 0) {
					System.out.println("저장된 회원이 없습니다.");
				} else {
					printAll();
				}
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}

			System.out.println();
		}
	}

	public void insertMember() {
		boolean checkId = true;
		boolean checkGender = true;
		String sumId = "";
		String sumName = "";
		String sumPassword = "";
		String sumEmail = "";
		char sumGender = ' ';
		int sumAge = 0;

		System.out.println("새 회원을 등록합니다.");
		while (checkId) {
			System.out.print("아이디 : ");
			sumId = sc.nextLine();
			if (mc.checkId(sumId)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			} else {
				checkId = false;
			}
		}
		System.out.print("이름 : ");
		sumName = sc.nextLine();
		System.out.println("비밀번호 : ");
		sumPassword = sc.nextLine();
		System.out.println("이메일");
		sumEmail = sc.nextLine();
		while (checkGender) {
			System.out.println("성별(M/F) : ");
			sumGender = sc.next().charAt(0);
			switch (sumGender) {
			case 'm':
			case 'M':
			case 'f':
			case 'F':
				checkGender = false;
				break;
			default:
				System.out.println("성별을 다시 입력하세요.");
			}

		}
		System.out.println("나이 : ");
		sumAge = sc.nextInt();

		mc.insertMember(sumId, sumName, sumPassword, sumEmail, sumGender, sumAge);
	}

	public void searchMember() {
		int num = 0;
		Member[] search = {};

		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		num = sc.nextInt();
		sc.nextLine();
		switch (num) {
		case 1:
			System.out.print("검색할 아이디 : ");
			mc.searchId(sc.nextLine());
			break;
		case 2:
			System.out.print("검색할 이름 : ");
			search = mc.searchName(sc.nextLine());
			if (search == null) {
				System.out.println("검색 결과가 없습니다.");
			} else {
				System.out.println("찾으신 회원 조회 결과입니다.");
				for (Member sn : search) {
					sn.inform();
				}
			}
			break;
		case 3:
			System.out.print("검색할 이메일 : ");
			search = mc.searchEmail(sc.nextLine());
			if (search == null) {
				System.out.println("검색 결과가 없습니다.");
			} else {
				for (Member sn : search) {
					sn.inform();
				}
			}
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void searchId() { // 아이디 검색을 위한 데이터를 사용자에게 입력 받는 메소드

	}

	public void searchName() { // 이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드

	}

	public void searchEmail() { // 이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드

	}

	public void updateMember() { // 수정 메뉴 출력 메소드

	}

	public void updatePassword() { // 비밀번호 수정을 위한 데이터를 사용자에게 입력 받는 메소드

	}

	public void updateName() { // 이름 수정을 위한 데이터를 사용자에게 입력 받는 메소드

	}

	public void updateEmail() { // 이메일 수정을 위한 데이터를 사용자에게 입력 받는 메소드

	}

	public void deleteMember() { // 삭제 메뉴 출력 메소드

	}

	public void deleteOne() { // 하나의 회원 삭제 결과를 출력하는 메소드

	}

	public void deleteAll() { // 전체 회원 삭제 결과를 출력하는 메소드

	}

	public void printAll() { // 전체 회원을 출력하는 메소드

	}
}
