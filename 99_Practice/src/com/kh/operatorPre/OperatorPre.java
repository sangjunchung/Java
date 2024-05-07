package com.kh.operatorPre;

import java.util.Scanner;
import java.text.DecimalFormat;

public class OperatorPre {
	
	public static void practice1() {
		int human = 0;
		int candy = 0;
		int getCandy = 0;
		int extraCandy = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람 수를 입력하세요. : ");
		human = sc.nextInt();
		
		System.out.print("사탕의 갯수를 입력하세요. : ");
		candy = sc.nextInt();
		
		getCandy = candy / human;
		extraCandy = candy % human;
		
		System.out.println();
		if(candy < human) {
			System.out.println("사람 수가 사탕의 갯수보다 많아 아무도 사탕을 받을수 없습니다.");
		}
		else {
			System.out.println("사람의 수는 "+human+" 명이며, 사탕 수는 "+candy+" 개이므로,");
			System.out.println("한 사람 당 "+getCandy+" 개의 사탕을 나눠 가졌으며, 여분의 사탕은 "+extraCandy+" 개입니다.");
		}
		sc.close();
	}

	public static void practice2() {
		String name = "null";
		int year = 0;
		int cla = 0;
		int num = 0;
		double score = 0.0;
		String gender = "null";
		boolean check = true;
		
		Scanner sc2 = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.##");
		
		System.out.print("이름 : ");
		name = sc2.next();
		System.out.print("학년(숫자만) : ");
		year = sc2.nextInt();
		System.out.print("반(숫자만) : ");
		cla = sc2.nextInt();
		System.out.print("번호(숫자만) : ");
		num = sc2.nextInt();
		System.out.print("성별(M/F) : ");
		gender = sc2.next();
		// sc2.next().charAt(int index); 로 입력 받은 글자 중 원하는 자리 글자만 출력 가능
		if((gender.equals("M"))||(gender.equals("m"))) {
			gender = "남학생";
		}
		else if((gender.equals("F"))||(gender.equals("f"))){
			gender = "여학생";
		}
		else {
			System.out.println();
			System.out.println("성별은 M 또는 F만 입력 가능합니다.");
			check = false;
		}
		// System.out.printf(); 로 다양한 포멧으로(%d: 10진수 정수 / %f: 실수 등)원하는 숫자 출력 가능, 
		// 문구 안에 연결시 +가 아닌 콤마(,)를 사용해야함
		// 포멧 : %d : 10진수 정수 / %f : 실수(소수점) / %s : 문자열 / %c : 글자 하나(char)
		// %x : 16진수 정수 / %o : 8진수 정수 / %b : true or false(boolean) / %n : 줄 바꿈
		if(check) {
			System.out.print("성적(소수점아래 2번째까지 보여짐) : ");
			score = sc2.nextDouble();
			
			System.out.println();
			System.out.println(year+"학년 "+cla+"반 "+num+"번 "+name+" "+gender+"의 성적은 "+form.format(score)+"이다.");
		}
		else {
			System.out.println("프로그램을 종료합니다. 입력을 원하시면 재 실행해 주세요.");
		}
		sc2.close();
	}
	
	public static void practice3() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double average = 0.0;
		
		Scanner sc3 = new Scanner(System.in);
		DecimalFormat form2 = new DecimalFormat("#.##");

		System.out.print("국어 점수를 입력해 주세요 : ");
		kor = sc3.nextInt();
		System.out.print("영어 점수를 입력해 주세요 : ");
		eng = sc3.nextInt();
		System.out.print("수학 점수를 입력해 주세요 : ");
		math = sc3.nextInt();
		
		total = kor + eng + math;
		average = (double) total / 3.0;
		
		System.out.println();
		System.out.println("세 과목의 합 : "+total);
		System.out.println("세 과목의 평균 : "+form2.format(average));
		//System.out.printf("세 과목의 평균 : %.2f", average);
		sc3.close();
	}
	
	public static void practice4() {
		int num1 = 0;
		int num2 = 0;
		boolean check;
		
		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("두 정수를 비교하여 동일하면 true, 다르면 false를 출력합니다.");
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = sc4.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = sc4.nextInt();
		
		check = (num1 == num2);
		
		System.out.println();
		System.out.println("결과 : "+check);
		
		sc4.close();
	}
	
	public static void method4() {
		int num1 = 0;
		int num2 = 0;
		boolean check;
		
		Scanner sc4 = new Scanner(System.in);
		
		System.out.println("두 정수를 비교하여 동일하면 false, 다르면 true를 출력합니다.");
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = sc4.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = sc4.nextInt();
		
		check = (num1 != num2);
		
		System.out.println();
		System.out.println("결과 : "+check);
		
		sc4.close();
	}
	
	public static void practice5() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean isOR;
		
		Scanner sc5 = new Scanner(System.in);
		
		System.out.println("세 정수를 비교하여 동일하면 true, 다르면 false를 출력합니다.");
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = sc5.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = sc5.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		num3 = sc5.nextInt();
		
		if((num1 == num2) && (num1 == num3)) {
			System.out.println();
			System.out.println("And 결과 : true");
		}
		else {
			System.out.println();
			System.out.println("And 결과 : false");
		}
		
		isOR = ((num1 == num2) || (num1 == num3));
		System.out.println("Or 결과 : "+ isOR);
		
		sc5.close();
	}
	
	public static void test1() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력시, 양수인지 아닌지 출력합니다.");
		System.out.print("정수 하나 입력해주세요 : ");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("양수입니다.");
		} else System.out.println("양수가 아닙니다.");
		
		sc.close();
	}
	
	public static void test2() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력해주세요 : ");
		num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0 입니다.");
		} else if (num > 0) {
			System.out.println("양수 입니다.");
		} else System.out.println("음수 입니다.");
		
		sc.close();
	}
	
	public static void test3() {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("짝수, 홀수 판별기 입니다 : ");
		num = sc.nextInt();
		
		if ((num%2) == 0) {
			System.out.println("짝수 입니다.");
		} else System.out.println("홀수 입니다.");
		
		sc.close();
	}
	
	public static void test4() {
		char num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력해 주세요(- 포함) : ");
		num = sc.next().charAt(7);
		
		if (num == '1' || num == '3') {
			System.out.println("남자 입니다.");
		} else if (num == '2' || num == '4') {
			System.out.println("여자 입니다.");
		} else {
			System.out.println("잘못 입력된 주민번호입니다.");
		}
		
		sc.close();		
	}
	
	public static void test5() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력해주세요 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력해주세요(첫번째 정수보단 커야합니다) : ");
		num2 = sc.nextInt();
		
		if(num2 <= num1) {
			System.out.println("두번째 정수는 첫번째 정수보다 커야합니다.");
			System.out.print("두번째 정수를 다시 입력해주세요 : ");
			num2 = sc.nextInt();
			if(num2 <= num1) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
		
		System.out.print("세번째 정수를 입력해주세요 : ");
		num3 = sc.nextInt();
		
		if(num1 >= num3 || num3 > num2) {
			System.out.println();
			System.out.println("true");
		} else {
			System.out.println();
			System.out.println("false");
		}
		
		sc.close();
 	}
	
	public static void test6() {
	
		int fiMoney = 0;
		int seMoney = 0;
		int thMoney = 0;
		double fiBonus = 0.4;
		double seBonus = 0.0;
		double thBonus = 0.15;
		double fitotal = 0.0;
		double setotal = 0.0;
		double thtotal = 0.0;
		String resultA;
		String resultB;
		String resultC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A 사원의 연봉을 입력해 주세요 : ");
		fiMoney = sc.nextInt();
		System.out.print("B 사원의 연봉을 입력해 주세요 : ");
		seMoney = sc.nextInt();
		System.out.print("C 사원의 연봉을 입력해 주세요 : ");
		thMoney = sc.nextInt();
		
		fitotal = (double) fiMoney + ((double)fiMoney * fiBonus);
		setotal = (double) seMoney + ((double)seMoney * seBonus);
		thtotal = (double) thMoney + ((double)thMoney * thBonus);
		
		if(fitotal >= 3000) {
			resultA = "3000 이상";
		} else resultA = "3000 미만";
		
		if(setotal >= 3000) {
			resultB = "3000 이상";
		} else resultB = "3000 미만";
		
		if(thtotal >= 3000) {
			resultC = "3000 이상";
		} else resultC = "3000 미만";
		
		System.out.println();
		System.out.printf("A사원 연봉/연봉+a : %d / %.2f\n", fiMoney, fitotal);
		System.out.println(resultA);
		System.out.printf("B사원 연봉/연봉+a : %d / %.2f\n", seMoney, setotal);
		System.out.println(resultB);
		System.out.printf("C사원 연봉/연봉+a : %d / %.2f\n", thMoney, thtotal);
		System.out.println(resultC);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//method4();
		//practice5();
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
	}

}

