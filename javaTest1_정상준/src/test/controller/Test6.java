package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 ~ 5 숫자 입력 : ");
		int num1 = sc.nextInt();

		switch (num1) {
		case 1:
			System.out.println("** 입력이 정상적으로 되었습니다! **");
			break;
		case 2:
			System.out.println("** 조회가 시작되었습니다! **");
			break;
		case 3:
			System.out.println("** 수정이 정상적으로 되었습니다! **");
			break;
		case 4:
			System.out.println("** 삭제가 정상적으로 되었습니다! **");
			break;
		case 5:
			System.out.println("** 정상적으로 종료 되었습니다! **");
			break;
		default:
			System.out.println("** 다시 입력해 주세요! **");
		}
		sc.close();
	}
}
