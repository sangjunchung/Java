package sup1.controller;

import java.util.Scanner;

public class TestSup1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		System.out.println("이름 : " + name + ", 나이 " + age + "세");

		sc.close();
	}

}
