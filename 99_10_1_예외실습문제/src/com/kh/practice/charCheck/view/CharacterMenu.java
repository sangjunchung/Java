package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	private Scanner sc = new Scanner(System.in);
	CharacterController cc = new CharacterController();

	public void menu() {
		String str = "";
		int count = 0;

		System.out.print("문자열 : ");
		str = sc.nextLine();

		try {
			count = cc.countAlpha(str);

			System.out.println("'" + str + "' 에 포함된 영문자 개수 : " + count);
		} catch (CharCheckException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
