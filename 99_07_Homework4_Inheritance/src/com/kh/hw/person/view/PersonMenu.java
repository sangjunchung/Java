package com.kh.hw.person.view;

import java.util.Scanner;
import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		int selectMenu = 0;
		boolean checkMenu = true;

		while (checkMenu) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			selectMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMenu) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				checkMenu = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			if (checkMenu == true) {
				System.out.println();
			}
		}
	}

	public void studentMenu() {
		int selectStudent = 0;
		boolean checkStudent = true;

		while (checkStudent) {
			System.out.println();
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			selectStudent = sc.nextInt();
			sc.nextLine();

			switch (selectStudent) {
			case 1:
				if (pc.personCount()[0] == 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				} else {
					insertStudent();
				}
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				checkStudent = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void employeeMenu() {
		int selectEmployee = 0;
		boolean checkEmployee = true;

		while (checkEmployee) {
			System.out.println();
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			if (pc.personCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			selectEmployee = sc.nextInt();
			sc.nextLine();

			switch (selectEmployee) {
			case 1:
				if (pc.personCount()[1] == 10) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				} else {
					insertEmployee();
				}
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				checkEmployee = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertStudent() {
		String stdName = "";
		int stdAge = 0;
		double stdHeight = 0.0;
		double stdWeight = 0.0;
		int stdGrade = 0;
		String stdMajor = "";
		boolean checkadd = true;
		char nextStudent = ' ';

		System.out.println();
		while (checkadd) {
			System.out.print("학생 이름 : ");
			stdName = sc.nextLine();
			System.out.print("학생 나이 : ");
			stdAge = sc.nextInt();
			System.out.print("학생 키 : ");
			stdHeight = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			stdWeight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			stdGrade = sc.nextInt();
			sc.nextLine();
			System.out.print("학생 전공 : ");
			stdMajor = sc.nextLine();

			pc.insertStudent(stdName, stdAge, stdHeight, stdWeight, stdGrade, stdMajor);

			if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				checkadd = false;
			} else {
				System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				nextStudent = sc.next().charAt(0);
				sc.nextLine();

				if (nextStudent == 'N' || nextStudent == 'n') {
					checkadd = false;
				}
			}
		}
	}

	public void printStudent() {
		if (pc.personCount()[0] == 0) {
			System.out.println("존재하는 학생이 없습니다.");
		} else {
			System.out.println();
			for (int i = 0; i < pc.personCount()[0]; i++) {
				System.out.println((i + 1) + ") " + pc.printStudent()[i].toString());
			}
		}
	}

	public void insertEmployee() {
		String empName = "";
		int empAge = 0;
		double empHeight = 0.0;
		double empWeight = 0.0;
		int empSalary = 0;
		String empDept = "";
		boolean checkadd = true;
		char nextEmployee = ' ';

		System.out.println();
		while (checkadd) {
			System.out.print("사원 이름 : ");
			empName = sc.nextLine();
			System.out.print("사원 나이 : ");
			empAge = sc.nextInt();
			System.out.print("사원 키 : ");
			empHeight = sc.nextDouble();
			System.out.print("사원 몸무게 : ");
			empWeight = sc.nextDouble();
			System.out.print("사원 급여 : ");
			empSalary = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 부서 : ");
			empDept = sc.nextLine();

			pc.insertEmployee(empName, empAge, empHeight, empWeight, empSalary, empDept);

			if (pc.personCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				checkadd = false;
			} else {
				System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				nextEmployee = sc.next().charAt(0);
				sc.nextLine();

				if (nextEmployee == 'N' || nextEmployee == 'n') {
					checkadd = false;
				}
			}
		}
	}

	public void printEmployee() {
		if (pc.personCount()[1] == 0) {
			System.out.println("존재하는 사원이 없습니다.");
		} else {
			System.out.println();
			for (int i = 0; i < pc.personCount()[1]; i++) {
				System.out.println((i + 1) + ") " + pc.printEmployee()[i].toString());
			}
		}
	}

}
