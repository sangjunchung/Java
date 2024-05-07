package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitch2 {

	public static void ifExam() {
		int num = 0;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 3까지의 숫자 중 하나를 입력하세요 : ");
		num = sc.nextInt();
		
		System.out.println("if문을 활용한 예제입니다.");
		if (num == 1) {
			result = "원";
		} else if (num == 2) {
			result = "투";
		} else {
			System.out.println("잘못된 입력입니다.");
			sc.close();
			return;
			
		}
		System.out.println(num+" 은 한국어로 "+result+" 입니다.");
		
		sc.close();
	}
	
	public static void switchExam() {
		String season;
		String text;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계절을 한국어로 입력해주세요.");
		System.out.print("입력방법 (봄, 여름, 가을, 겨울) : ");
		season = sc.nextLine();
		
		switch (season) {
			case "봄" : 
				text = "따뜻한";
				break;
			case "여름" :
				text = "뜨거운";
				break;
			case "가을" :
				text = "단풍의";
				break;
			case "겨울" :
				text = "새하얀";
				break;
			default :
				System.out.println("해당하는 계절이 없습니다.");
				sc.close();
				return;
		}
		System.out.println(text + " 날씨");
		
		sc.close();
	}
	
	public static void main(String[] args) {
		//ifExam();
		//switchExam();
	}

}
