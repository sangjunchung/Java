package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();

	public void mainMenu() throws Exception {
		while (true) {
			System.out.println("1. 점수 저장");
			System.out.println("2. 점수 출력");
			System.out.println("3. 종료");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 3:
				System.out.print("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			System.out.println();
		}
	}

	public void saveScore() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		sc.nextLine();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		scr.saveScore(name, kor, eng, math, sum, avg);
	}

	public void readScore() throws Exception {
		DataInputStream dis = scr.readScore();

		while (dis.available() > 0) {
			String name = dis.readUTF();
			int kor = dis.readInt();
			int eng = dis.readInt();
			int math = dis.readInt();
			int sum = dis.readInt();
			double avg = dis.readDouble();
			System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 합계 : %d, 평균 : %.2f\n", name, kor, eng, math, sum, avg);
		}
	}
}
