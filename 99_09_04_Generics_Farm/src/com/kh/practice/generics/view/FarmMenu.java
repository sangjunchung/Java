package com.kh.practice.generics.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.*;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	public void mainMenu() {
		int selectMainMenu = 0;
		boolean checkExit = true;
		System.out.println("========== KH 마트 ==========");

		while (checkExit) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력 : ");
			selectMainMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMainMenu) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.print("프로그램 종료.");
				checkExit = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (checkExit) {
				System.out.println();
			}
		}
	}

	public void adminMenu() {
		int selectAdminMenu = 0;
		boolean checkMainMenu = true;

		while (checkMainMenu) {
			System.out.println("=====***** 직원 메뉴 *****=====");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 입력 : ");
			selectAdminMenu = sc.nextInt();
			sc.nextLine();

			switch (selectAdminMenu) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				checkMainMenu = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (checkMainMenu) {
				System.out.println();
			}
		}
	}

	public void customerMenu() {
		int selectCutomerMenu = 0;
		boolean checkMainMenu = true;

		while (checkMainMenu) {
			System.out.println("현재 KH마트 농산물 수량");
			if(fc.printFarm().isEmpty()) {
				System.out.println("현재 등록된 농산물이 없습니다.");
			} else {
				printFarm();
			}
			System.out.println();
			System.out.println("=====***** 고객 메뉴 *****=====");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 입력 : ");
			selectCutomerMenu = sc.nextInt();
			sc.nextLine();

			switch (selectCutomerMenu) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				checkMainMenu = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (checkMainMenu) {
				System.out.println();
			}
		}
	}

	public void addNewKind() {
		int selectAddNewKind = 0;
		int kindCount = 0;
		String kindName = "";
		boolean checkKind = true;
		Farm newFarm = null;

		while (checkKind) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			selectAddNewKind = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			kindName = sc.nextLine();
			System.out.print("수량 : ");
			kindCount = sc.nextInt();
			sc.nextLine();

			switch (selectAddNewKind) {
			case 1:
				newFarm = new Fruit("과일", kindName);
				break;
			case 2:
				newFarm = new Vegetable("채소", kindName);
				break;
			case 3:
				newFarm = new Nut("견과", kindName);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			if(fc.addNewKind(newFarm, kindCount)) {
				System.out.println("새 농산물이 추가되었습니다.");
				checkKind = false;
			} else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void removeKind() {
		int selectRemoveKind = 0;
		String kindName = "";
		boolean checkRemove = true;
		Farm removeKind = null;
		
		while (checkRemove) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			selectRemoveKind = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			kindName = sc.nextLine();

			switch (selectRemoveKind) {
			case 1:
				removeKind = new Fruit("과일", kindName);
				break;
			case 2:
				removeKind = new Vegetable("채소", kindName);
				break;
			case 3:
				removeKind = new Nut("견과", kindName);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			if(fc.removeKind(removeKind)) {
				System.out.println("농산물 삭제에 성공하셨습니다.");
				checkRemove = false;
			} else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void changeAmount() {
		int selectchangeAmount = 0;
		int newCount = 0;
		String kindName = "";
		boolean checkAmount = true;
		Farm changeFarm = null;
		
		while (checkAmount) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			selectchangeAmount = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			kindName = sc.nextLine();
			System.out.print("수정할 수량 : ");
			newCount = sc.nextInt();
			sc.nextLine();

			switch (selectchangeAmount) {
			case 1:
				changeFarm = new Fruit("과일", kindName);
				break;
			case 2:
				changeFarm = new Vegetable("채소", kindName);
				break;
			case 3:
				changeFarm = new Nut("견과", kindName);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			if(fc.changeAmount(changeFarm, newCount)) {
				System.out.println("농산물 수량이 수정되었습니다.");
				checkAmount = false;
			} else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void printFarm() {
		HashMap<Farm, Integer> hash = fc.printFarm();
		
		for(Farm f : hash.keySet()) {
			if(f instanceof Fruit) {
				Fruit fru = (Fruit) f;
				System.out.println(f.getKind()+": "+fru.getName()+"("+hash.get(f)+"개)");
			} else if (f instanceof Vegetable) {
				Vegetable veg = (Vegetable) f;
				System.out.println(f.getKind()+": "+veg.getName()+"("+hash.get(f)+"개)");
			} else {
				Nut nut = (Nut) f;
				System.out.println(f.getKind()+": "+nut.getName()+"("+hash.get(f)+"개)");
			}
		}
	}

	public void buyFarm() {
		int selectBuyFarm = 0;
		String buyName = "";
		boolean checkBuy = true;
		Farm buyFarm = null;
		
		while(checkBuy) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매할 종류 번호 : ");
			selectBuyFarm = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			buyName = sc.nextLine();

			switch (selectBuyFarm) {
			case 1:
				buyFarm = new Fruit("과일", buyName);
				break;
			case 2:
				buyFarm = new Vegetable("채소", buyName);
				break;
			case 3:
				buyFarm = new Nut("견과", buyName);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			if(fc.buyFarm(buyFarm)) {
				System.out.println("구매에 성공하였습니다.");
				checkBuy = false;
			} else {
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
			}
		}
	}

	public void removeFarm() {
		int selectRemoveFarm = 0;
		String removeName = "";
		boolean checkRemove = true;
		Farm removeFarm = null;
		
		while(checkRemove) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("취소할 종류 번호 : ");
			selectRemoveFarm = sc.nextInt();
			sc.nextLine();
			System.out.print("구매 취소할 것 : ");
			removeName = sc.nextLine();

			switch (selectRemoveFarm) {
			case 1:
				removeFarm = new Fruit("과일", removeName);
				break;
			case 2:
				removeFarm = new Vegetable("채소", removeName);
				break;
			case 3:
				removeFarm = new Nut("견과", removeName);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			if(fc.removeFarm(removeFarm)) {
				System.out.println("구매 취소에 성공하였습니다.");
				checkRemove = false;
			} else {
				System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
			}
		}
	}

	public void printBuyFarm() {
		Iterator<Farm> it = fc.printBuyFarm().iterator();
		
		if(it.hasNext()) {
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
		} else {
			System.out.println("현재 구매 목록에 농산물이 존재하지 않습니다. 구매 후 확인해주세요.");
		}
	}
}
