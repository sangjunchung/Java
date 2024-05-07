package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {

	public static void test1() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		
		num = sc.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");
				return;
			default :
				System.out.println("잘못된 입력입니다.");
		}
	}
	
	public static void test2() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num = sc.nextInt();
		
		if (num >= 0) {
			if ((num%2) == 0) {
				System.out.println("짝수입니다.");
			} 
			else {
				System.out.println("홀수입니다.");
			}
		} 
		else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public static void test3() {
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		int total = 0;
		double average = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		korScore = sc.nextInt();
		System.out.print("영어 점수 : ");
		engScore = sc.nextInt();
		System.out.print("수학 점수 : ");
		mathScore = sc.nextInt();
		
		total = korScore + engScore + mathScore;
		average = (double)total / 3;
		
		if(korScore >= 40 && engScore >= 40 && mathScore >= 40) {
			if(average >= 60) {
				System.out.println();
				System.out.println("국어 : "+korScore);
				System.out.println("영어 : "+engScore);
				System.out.println("수학 : "+mathScore);
				System.out.println("합계 : "+total);
				System.out.printf("평균 : %.2f\n", average);
				System.out.println("축하합니다, 합격입니다!");
			}
			else {
				System.out.println();
				System.out.println("불합격입니다.");
			}
		}
		else {
			System.out.println();
			System.out.println("불합격입니다.");
		}
	}
	
	public static void test4() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		num = sc.nextInt();
		
		switch (num) {
			case 1: case 2: case 12:
				System.out.println(num+"월은 겨울입니다.");
				break;
			case 3: case 4: case 5:
				System.out.println(num+"월은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println(num+"월은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(num+"월은 가을입니다.");
				break;
			default :
				System.out.println(num+"월은 잘못 입력된 달입니다.");
		}
	}
	
	public static void test5() {
		final String id = "myId";
		final String password = "myPassword12";
		String getId;
		String getPassword;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		getId = sc.nextLine();
		System.out.print("비밀번호 : ");
		getPassword = sc.nextLine();
		
		if (id.equals(getId)) {
			if(password.equals(getPassword)) {
				System.out.println();
				System.out.println("로그인 성공");
			}
			else {
				System.out.println();
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println();
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public static void test6() {
		String admin = "회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성";
		String member = "게시글 작성, 게시글 조회, 댓글 작성";
		String nonMember = "게시글 조회";
		String rating;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		rating = sc.nextLine();
		
		switch (rating) {
			case "관리자":
				System.out.println(admin);
				break;
			case "회원":
				System.out.println(member);
				break;
			case "비회원":
				System.out.println(nonMember);
				break;
			default : 
				System.out.println("잘못된 입력입니다.");
		}
	}
	
	public static void test7() {
		double heightCM = 0.0;
		double heightM = 0.0;
		double weight = 0.0;
		double BMI = 0.0;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(cm)를 입력해 주세요 : ");
		heightCM = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		weight = sc.nextDouble();
		
		heightM = heightCM * 0.01;
		BMI = weight / (heightM * heightM);
		
		if (BMI < 18.5) {
			result = "저체중";
		}
		else if (BMI < 23.0) {
			result = "정상체중";
		}
		else if (BMI < 25.0) {
			result = "과체중";
		}
		else if (BMI < 30.0) {
			result = "비만";
		}
		else {
			result = "고도비만";
		}
		
		System.out.println();
		System.out.printf("BMI 지수 : %.2f\n", BMI);
		System.out.println(result);
	}
	
	public static void test8() {
		int num1 = 0;
		int num2 = 0;
		double total = 0;
		String oper = " ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자 1 입력 : ");
		num1 = sc.nextInt();
		System.out.print("피연산자 2 입력 : ");
		num2 = sc.nextInt();
		
		if (num1 >= 0 && num2 >= 0) {
			System.out.print("연산자를 입력(+,-,*,/,%) : ");
			oper = sc.next();
			
			switch (oper) {
				case "+":
					total = ((double)num1) + ((double)num2);
					break;
				case "-":
					total = ((double)num1) - ((double)num2);
					break;
				case "*": 
					total = ((double)num1) * ((double)num2);
					break;
				case "/":
					if (num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
						return;
					}
					else {
						total = ((double)num1) / ((double)num2);
					}
					break;
				case "%":
					if (num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
						return;
					}
					else {
						total = ((double)num1) % ((double)num2);
					}
					break;
				default : 
					System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
					return;
			}
		}
		else {
			System.out.println("두 피연산자가 모두 양수일 때만 동작합니다.");
			return;
		}
		System.out.printf("%d %s %d = %.2f\n", num1, oper, num2, total);
	}
	
	public static void test9() {
		final int attendTotal = 20;
		int midScore = 0;
		int finScore = 0;
		int assScore = 0;
		int attend = 0;
		int attendRate = 0;
		double midScoreResult = 0.0;
		double finScoreResult = 0.0;
		double assScoreResult = 0.0;
		double attendResult = 0.0;
		double totalScore = 0.0;
		String resultGuide = "========== 결과 ==========";
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		midScore = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		finScore = sc.nextInt();
		System.out.print("과제 점수 : ");
		assScore = sc.nextInt();
		System.out.print("출석 횟수 : ");
		attend = sc.nextInt();
		
		if (attend > attendTotal) {
			System.out.println();
			System.out.println("출석 횟수는 최대 "+attendTotal+"회 입니다.");
			System.out.print("다시 입력해주세요 : ");
			attend = sc.nextInt();
			if (attend > attendTotal) {
				System.out.println();
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		}
		
		attendRate = (attend * 100) / attendTotal;
		
		if (attendRate > 70) {
			midScoreResult = ((double)midScore) * 0.2;
			finScoreResult = ((double)finScore) * 0.3;
			assScoreResult = ((double)assScore) * 0.3;
			attendResult = ((double)attendRate) * 0.2;
			totalScore = midScoreResult + finScoreResult + assScoreResult + attendResult;
			
			if (totalScore >= 70.0) {
				result = "Pass";
			}
			else {
				result = "Fail [점수 미달]";
			}
		}
		else {
			System.out.println(resultGuide);
			System.out.printf("Fail [출석 횟수 부족 (%d/%d)]", attend, attendTotal);
			return;
		}
		
		System.out.println(resultGuide);
		System.out.printf("중간 고사 점수(20) : %.2f\n", midScoreResult);
		System.out.printf("기말 고사 점수(30) : %.2f\n", finScoreResult);
		System.out.printf("과제 점수	  (30) : %.2f\n", assScoreResult);
		System.out.printf("출석 점수 	  (20) : %.2f\n", attendResult);
		System.out.printf("총점 : %.2f\n", totalScore);
		System.out.println(result);
	}
	
	public static void test10() {
		int select = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.\r\n"
				+ "1. 메뉴 출력\r\n"
				+ "2. 짝수/홀수\r\n"
				+ "3. 합격/불합격\r\n"
				+ "4. 계절\r\n"
				+ "5. 로그인\r\n"
				+ "6. 권한 확인\r\n"
				+ "7. BMI\r\n"
				+ "8. 계산기\r\n"
				+ "9. P/F");
		System.out.print("선택 : ");
		select = sc.nextInt();
		
		switch (select) {
			case 1:
				test1();
				break;
			case 2:
				test2();
				break;
			case 3:
				test3();
				break;
			case 4:
				test4();
				break;
			case 5:
				test5();
				break;
			case 6:
				test6();
				break;
			case 7:
				test7();
				break;
			case 8:
				test8();
				break;
			case 9:
				test9();
				break;		
			default : 
				System.out.println();
				System.out.println("잘못된 입력입니다. 프로그랩을 종료합니다.");
				return;
		}
	}
	
	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		//test8();
		//test9();
		//test10();	
	}
}
