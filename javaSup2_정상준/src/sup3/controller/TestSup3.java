package sup3.controller;

import java.util.Scanner;

import sup3.sample.LogicSample;

public class TestSup3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		if (age < 20) {
			System.out.println("미성년자는 가입할 수 없습니다.");
		} else {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("성별 (남/여) : ");
			String gender = sc.next();
			sc.nextLine();
			System.out.print("전화번호 : ");
			String phone = sc.nextLine();
			
			LogicSample ls = new LogicSample(age, name, gender, phone);
			ls.inputProfile();
		}
		sc.close();
	}
}
