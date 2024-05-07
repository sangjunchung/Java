package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		int selectMainMenu = 0;
		boolean checkExit = true;

		while (checkExit) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			selectMainMenu = sc.nextInt();
			sc.nextLine();

			switch (selectMainMenu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
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

	public void fileSave() {
		String fileName = "";
		String content = "";

		System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
		fileName = sc.nextLine();

		if (fc.checkName(fileName)) {
			System.out.println("파일이 이미 존재합니다.");
		} else {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			content = sc.nextLine();
			fc.fileSave(fileName, new StringBuilder(content));
		}
	}

	public void fileOpen() {
		System.out.print("열어줄 파일 이름 입력하기 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
		System.out.println("파일 내용 : " + fileContent);

	}

	public void fileEdit() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);

		System.out.println("현재 파일 내용 : " + fileContent);
		System.out.println("새로운 내용 입력 : ");
		String newContent = sc.nextLine();
		fc.fileEdit(fileName, new StringBuilder(newContent));
	}
}
