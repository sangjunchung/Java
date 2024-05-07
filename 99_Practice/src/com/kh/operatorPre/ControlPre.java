package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {
	
	public static void practice1() {
		int num = 0;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 숫자 하나 입력해 주세요 : ");
		num = sc.nextInt();
		
		
		if(num >= 0) {
			if((num%2) == 0) {
				System.out.println();
				result = "짝수입니다.";
			}
			else {
				System.out.println();
				result = "홀수입니다.";
			}
		}
		else {
			System.out.println();
			result = "양수만 입력해 주세요.";
		}
		System.out.println(result);
		
		sc.close();
	}
	
	public static void practice2() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;		
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력해 주세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력해 주세요 : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = (double) total / 3.0;
		
		if(kor < 40) {
			System.out.println();
			result = "불합격입니다.";
		}
		else if(eng < 40) {
			System.out.println();
			result = "불합격입니다.";
		}
		else if(math < 40) {
			System.out.println();
			result = "불합격입니다.";
		}
		else if(avg >= 60.0) {
			System.out.println();
			System.out.println("합계 : "+total);
			System.out.printf("평균 : %.2f\n", avg);
			result = "축하합니다, 합격입니다!";
		}
		else {
			System.out.println();
			result = "불합격입니다.";
		}
		System.out.println(result);
		
		sc.close();
		
	}
	
	public static void practice3() {		
		int num = 0;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12에서 숫자 입력시 해당 달이 몇 일까지 있는지 출력합니다(윤달X) : ");
		num = sc.nextInt();
		
		switch(num){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				result = num+"월은 31일까지 있습니다.";
				break;
			case 2: 
				result = num+"월은 29일까지 있습니다.";
				break;
			case 4: case 6: case 9: case 11:
				result = num+"월은 30일까지 있습니다.";
				break;
			default : result = num+"월은 존재하지 않는 달입니다.";
		}
		System.out.println(result);
		
		sc.close();
	}
	
	public static void practice3_1() {
		int num = 0;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12에서 숫자 입력시 해당 달이 몇 일까지 있는지 출력합니다(윤달X) : ");
		num = sc.nextInt();
		
		if(num > 0 && num <13) {
			if(num == 1) result = num+"월은 31일까지 있습니다.";
			else if(num == 2) result = num+"월은 29일까지 있습니다.";
			else if(num == 3) result = num+"월은 31일까지 있습니다.";
			else if(num == 4) result = num+"월은 30일까지 있습니다.";
			else if(num == 5) result = num+"월은 31일까지 있습니다.";
			else if(num == 6) result = num+"월은 30일까지 있습니다.";
			else if(num == 7) result = num+"월은 31일까지 있습니다.";
			else if(num == 8) result = num+"월은 31일까지 있습니다.";
			else if(num == 9) result = num+"월은 30일까지 있습니다.";
			else if(num == 10) result = num+"월은 31일까지 있습니다.";
			else if(num == 11) result = num+"월은 30일까지 있습니다.";
			else result = num+"월은 31일까지 있습니다.";
		} else {
			result = num +"월은 존재 하지않는 달입니다.";
		}

		System.out.println(result);
		
		sc.close();
	}
	
	public static void practice4() {
		double high = 0.0;
		double weight = 0.0;
		double BMI = 0.0;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(CM)를 입력해주세요 : ");
		high = sc.nextDouble() * 0.01;
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		weight = sc.nextDouble();
		
		BMI = weight / (high*high);
		System.out.println();
		System.out.printf("BIM 지수 : %.2f\n", BMI);
		
		if (BMI < 18.5) {
			result = "저체중";
		} else if(BMI >= 18.5 && BMI < 23.0) {
			result = "정상체중";
		} else if(BMI >= 23.0 && BMI < 25.0) {
			result = "과체중";
		} else if(BMI >= 25.0 && BMI < 30.0) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println(result);
		
		sc.close();
	}
	
	public static void practice5() {
		final int attendTotal = 20;
		int midTest = 0;
		int lastTest = 0;
		int projectScore = 0;
		int attend = 0;
		int attendCount = 0;
		double MTScore = 0.0;
		double LTScore = 0.0;
		double PSScore =  0.0;
		double attendScore = 0.0;
		double result = 0.0;
		String resultText;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		midTest = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		lastTest = sc.nextInt();
		System.out.print("과제 점수 : ");
		projectScore = sc.nextInt();
		System.out.print("출석 횟수 : ");
		attend = sc.nextInt();
		if(attend > attendTotal) {
			System.out.println("출석 횟수는 최대 20번 입니다.");
			System.out.print("다시 입력해 주세요 : ");
			attend = sc.nextInt();
		}

		MTScore = midTest * 0.2;
		LTScore = lastTest * 0.3;
		PSScore = projectScore * 0.3;
		attendScore = attend * 1.0;
		attendCount = attendTotal - attend;
		result = (MTScore + LTScore + PSScore + attendScore);
		
		if(result >= 70.0) {
			resultText = "Pass";
		} else {
			resultText = "Fail [점수 미달]";
		}

		System.out.println("========== 결과 ==========");
		if(attendCount >= (attendTotal*0.3)) {
			System.out.printf("Fail [출석 횟수 부족(%d/%d)]\n", attend, attendTotal);
		} else {
			System.out.println("중간 고사 점수(20%) : "+MTScore);
			System.out.println("기말 고사 점수(30%) : "+LTScore);
			System.out.println("과제 점수	  (30%) : "+PSScore);
			System.out.println("출석 점수	  (20%) : "+attendScore);
			System.out.printf("총점 : %.2f\n", result);
			System.out.println(resultText);
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice3_1();
		//practice4();
		//practice5();
	}

}
