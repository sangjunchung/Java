package com.kh.hw.member.view;

import java.util.Scanner;
import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {

	}

	public void mainMenu() {
		int selectMenu = 0;
		boolean onOff = true;

		while (onOff) {
			System.out.println("최대 등록 가능한 회원 수는 10명 입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명 입니다.");
			if (mc.existMemberNum() == 10) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			} else {
				System.out.println("1. 새 회원 등록");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			selectMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMenu) {
			case 1:
				System.out.println(mc.existMemberNum());
				if (mc.existMemberNum() == 10) {
					System.out.println("모든 회원의 자리가 꽉차 해당 기능은 잠금 상태입니다.");
					System.out.println("새로운 회원을 등록하고 싶으시다면 기존 회원을 삭제해주세요.");
				} else {
					insertMember();
				}
				break;
			case 2:
				if (mc.existMemberNum() == 0) {
					System.out.println("등록된 회원이 존재하지 않아 해당 기능은 사용하지 못합니다.");
					System.out.println("해당 기능을 사용하고 싶으시다면 회원을 등록해주세요.");
				} else {
					searchMember();
				}
				break;
			case 3:
				if (mc.existMemberNum() == 0) {
					System.out.println("등록된 회원이 존재하지 않아 해당 기능은 사용하지 못합니다.");
					System.out.println("해당 기능을 사용하고 싶으시다면 회원을 등록해주세요.");
				} else {
					updateMember();
				}
				break;
			case 4:
				if (mc.existMemberNum() == 0) {
					System.out.println("등록된 회원이 존재하지 않아 해당 기능은 사용하지 못합니다.");
					System.out.println("해당 기능을 사용하고 싶으시다면 회원을 등록해주세요.");
				} else {
					deleteMember();
				}
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				onOff = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (onOff) {
				System.out.println();
			}
		}
	}

	public void insertMember() {
		String nId = "";
		String nName = "";
		String nPassword = "";
		String nEmail = "";
		char nGender = ' ';
		int nAge = 0;
		boolean checkId = true;
		boolean checkMF = true;

		System.out.println("새 회원을 등록합니다.");
		while (checkId) {
			System.out.print("아이디 : ");
			nId = sc.nextLine();
			if (mc.checkId(nId)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			} else {
				checkId = false;
			}
		}
		System.out.print("이름 : ");
		nName = sc.nextLine();
		System.out.print("비밀번호 : ");
		nPassword = sc.nextLine();
		System.out.print("이메일 : ");
		nEmail = sc.nextLine();
		while (checkMF) {
			System.out.print("성별(M/F) : ");
			nGender = sc.next().charAt(0);
			switch (nGender) {
			case 'm':
			case 'M':
			case 'f':
			case 'F':
				checkMF = false;
				break;
			default:
				System.out.println("성별을 다시 입력하세요.");
			}
		}
		System.out.print("나이 : ");
		nAge = sc.nextInt();
		sc.nextLine();

		mc.insertMember(nId, nName, nPassword, nEmail, nGender, nAge);
	}

	public void searchMember() {
		int selectSearch = 0;

		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		selectSearch = sc.nextInt();
		sc.nextLine();

		switch (selectSearch) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void searchId() {
		String searchId = "";
		String result = "";

		System.out.print("검색할 아이디 : ");
		searchId = sc.nextLine();

		result = mc.searchId(searchId);
		if (result.equals("")) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}
	}

	public void searchName() {
		Member[] resultName;
		String searchName = "";

		System.out.print("검색할 이름 : ");
		searchName = sc.nextLine();

		resultName = mc.searchName(searchName);
		if (resultName == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (int i = 0; i < resultName.length; i++) {
				System.out.println(resultName[i].inform());
			}
		}
	}

	public void searchEmail() {
		Member[] resultEmail;
		String searchEmail = "";

		System.out.print("검색할 이메일 : ");
		searchEmail = sc.nextLine();

		resultEmail = mc.searchEmail(searchEmail);
		if (resultEmail == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for (int i = 0; i < resultEmail.length; i++) {
				System.out.println(resultEmail[i].inform());
			}
		}
	}

	public void updateMember() {
		int selectUpdate = 0;

		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		selectUpdate = sc.nextInt();
		sc.nextLine();

		switch (selectUpdate) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void updatePassword() {
		String searchId = "";
		String updatePassword = "";

		System.out.print("수정할 회원의 아이디 : ");
		searchId = sc.nextLine();
		System.out.print("수정할 비밀번호 : ");
		updatePassword = sc.nextLine();

		if (mc.updatePassword(searchId, updatePassword)) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}

	public void updateName() {
		String searchId = "";
		String updateName = "";

		System.out.print("수정할 회원의 아이디 : ");
		searchId = sc.nextLine();
		System.out.print("수정할 이름 : ");
		updateName = sc.nextLine();

		if (mc.updateName(searchId, updateName)) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}

	public void updateEmail() {
		String searchId = "";
		String updateEmail = "";

		System.out.print("수정할 회원의 아이디 : ");
		searchId = sc.nextLine();
		System.out.print("수정할 이메일 : ");
		updateEmail = sc.nextLine();

		if (mc.updateEmail(searchId, updateEmail)) {
			System.out.println("존재하지 않는 아이디입니다.");
		} else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
	}

	public void deleteMember() {
		int selectDelete = 0;

		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		selectDelete = sc.nextInt();
		sc.nextLine();

		switch (selectDelete) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void deleteOne() {
		String searchId = "";
		char checkDelete = ' ';

		System.out.print("삭제할 회원의 아이디 : ");
		searchId = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		checkDelete = sc.next().charAt(0);
		sc.nextLine();

		if (checkDelete == 'Y' || checkDelete == 'y') {
			if (mc.delete(searchId)) {
				System.out.println("존재하지 않는 아이디입니다.");
			} else {
				System.out.println("성공적으로 삭제하였습니다.");
			}
		}
	}

	public void deleteAll() {
		char checkDelete = ' ';

		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		checkDelete = sc.next().charAt(0);
		sc.nextLine();

		if (checkDelete == 'Y' || checkDelete == 'y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
	}

	public void printAll() {
		if (mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			for (int i = 0; i < mc.existMemberNum(); i++) {
				System.out.println((i + 1) + ") " + mc.printAll()[i].inform());
			}
		}
	}
}
