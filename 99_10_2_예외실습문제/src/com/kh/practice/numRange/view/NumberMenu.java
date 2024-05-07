package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	private Scanner sc = new Scanner(System.in);
	private NumberController nc = new NumberController();
	
	public void menu() {
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("정수 1 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		num2 = sc.nextInt();
		
		try {
			System.out.println(num1+"은(는) "+num2+"의 배수인가 ? "+nc.checkDouble(num1, num2));
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
	}
}
