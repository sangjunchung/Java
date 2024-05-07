package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {

	public static void takeAtaxi() {
		int money = 0;
		String answer;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		money = sc.nextInt();
		
		if (money >= 3000) {
			System.out.print("택시를 탈까요? (예/아니오) : ");
			answer = sc.next();
			
			switch (answer) {
				case "예" :
					System.out.println("택시를 탔습니다.");
					break;
				case "아니오":
					System.out.println("택시를 타지 않습니다.");
					break;
				default :
					System.out.println("잘못된 입력입니다.");
			}
		}else {
			System.out.println("3000원 이하이므로 잔액이 부족합니다.");
		}
		sc.close();
	}
	
	public static void whyScore() {
		int score = 0;
		String grade;
		String answer;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력해 주세요 : ");
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = "A";
			System.out.println();
			System.out.println("당신의 학점은 : "+grade+" 입니다.");
		} else if (score >= 80) {
			grade = "B";
			System.out.println();
			System.out.println("당신의 학점은 : "+grade+" 입니다.");
		} else if (score >= 70) {
			grade = "C";
			System.out.println();
			System.out.println("당신의 학점은 : "+grade+" 입니다.");
		} else if (score >= 60) {
			grade = "D";
			System.out.println();
			System.out.println("당신의 학점은 : "+grade+" 입니다.");
		} else {
			grade = "F";
			System.out.println();
			System.out.println("당신의 학점은 : "+grade+" 입니다.");		
		}
		
		if(grade.equals("F")) {
			System.out.print("재수강 하시겠습니다? (Y/N) : ");
			answer = sc.next();
			
			switch (answer) {
				case "Y": case "y":
					System.out.println("재수강을 신청하셨습니다.");
					break;
				case "N": case "n":
					System.out.println("재수강을 신청하지 않으셨습니다.");
					break;
				default : 
					System.out.println("잘못된 입력입니다.");
			}
		}
		
		sc.close();
	}
	
	public static void whatDay() {
		String day;
		String answer;
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오늘의 요일을 입력해 주시면 일정이 출력됩니다 : ");
		day = sc.next();
		
		switch (day) {
			case "월": case "월요일": case "수": case "수요일": case "금": case "금요일":
				System.out.println();
				System.out.println("오늘의 일정은 헬스 입니다.");
				break;
			case "화": case "화요일": case "목": case "목요일":
				System.out.println();
				System.out.println("오늘의 일정은 공부 입니다.");
				break;
			case "토": case "토요일": case "일": case "일요일":
				System.out.println();
				System.out.println("오늘은 주말입니다."); 
				System.out.print("집에서 쉴 예정이신가요? (예/아니오) : ");
				answer = sc.next();
				
				if(answer.equals("예")) {
					System.out.println();
					System.out.println("오늘 하루 편안히 휴식을 취하시길 바랍니다.");
					break;
				}
				else {
					System.out.println();
					System.out.println("주말인데 어떤 활동을 하실 예정이신가요?");
					System.out.print("1.등산, 2.독서, 3.수영 : ");
					choice = sc.nextInt();
					
					switch (choice) {
						case 1:
							System.out.println();
							System.out.println("등산을 선택하셨습니다.");
							System.out.println("즐거운 등산되시길 바랍니다.");
							break;
						case 2:
							System.out.println();
							System.out.println("독서을 선택하셨습니다.");
							System.out.println("즐거운 독서되시길 바랍니다.");
							break;
						case 3:
							System.out.println();
							System.out.println("수영을 선택하셨습니다.");
							System.out.println("즐거운 수영되시길 바랍니다.");
							break;
						default :
							System.out.println("잘못된 입력입니다.");
					}
				}
				break;
				
			default :
					System.out.println("오늘의 요일을 정확히 입력해주세요.");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		//takeAtaxi();
		//whyScore();
		//whatDay();
	}

}
