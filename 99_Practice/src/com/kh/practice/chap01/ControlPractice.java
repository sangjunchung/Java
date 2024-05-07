package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void test11() {
		String password;
		String result = "";
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		while(check) {
			System.out.print("비밀번호 입력(1000~9999) : ");
			password = sc.nextLine();
			
			if (password.length() == 4) {
				if (password.charAt(0) == '0') {
					result = "비밀번호 첫번째 자리에는 0이 올수 없습니다.";
				}
				else {
					for (int i = 0; i < password.length()-1; i++) {
						for (int j = i+1; j < password.length(); j++) {
							if (password.charAt(i) == password.charAt(j)) {
								result = "중복 값 있음";
								System.out.println(result);
								break;
							}
							else {
								result = "생성 성공";
								check = false;
							}
						}
						if(result.equals("중복 값 있음")) {
							break;
						}
					}
				}
			} else {
				result = "비밀번호의 자리 수가 맞지 않습니다.";
			}
			
			if(result.equals("중복 값 있음")) {
				continue;
			}
			System.out.println(result);
		}
	}
	
	public void test11_1() {
		String password;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		password = sc.nextLine();
		
		if (password.length() == 4) {
			if (password.charAt(0) == '0') {
				result = "비밀번호 첫번째 자리에는 0이 올수 없습니다.";
			}
			else {
					if (password.charAt(0) == password.charAt(1) || password.charAt(0) == password.charAt(2) ||
						password.charAt(0) == password.charAt(3) || password.charAt(1) == password.charAt(2) ||
						password.charAt(1) == password.charAt(3) || password.charAt(2) == password.charAt(3)) {
						result = "중복 값 있음";
					}
					else {
						result = "생성 성공";
					}
			}
		} else {
			result = "비밀번호의 자리 수가 맞지 않습니다.";
		}
		System.out.println(result);
	}
}
