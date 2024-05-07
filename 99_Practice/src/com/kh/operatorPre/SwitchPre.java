package com.kh.operatorPre;

import java.util.Random;
import java.util.Scanner;

public class SwitchPre {

	public static void method1() {
		
		int day = 0;
		String text;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		day = sc.nextInt();
		
		switch (day) {
			case 1:
				text = "월요일입니다.";
				break;
			default:
				text = "아무 요일도 아닙니다.";
		}
		System.out.println(text);
		
		sc.close();
	}
	
	public static void method2() {
		int num = 0;
		String text;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카페입니다. 1번부터 3번까지 메뉴가 있습니다.");
		System.out.print("원하는 번호를 골라주세요 : ");
		num = sc.nextInt();
		
		switch(num) {
			case 1:
				text = "아메리카노 나왔습니다.";
				break;
			case 2:
				text = "카페라떼 나왔습니다.";
				break;
			case 3:
				text = "흑당버블티 나왔습니다.";
				break;
			default :
				text = "잘못 입력했습니다. 다시 이용해주세요.";
		}
		System.out.println(text);
		
		sc.close();
	}
	
	public static void method3() {
		String city;
		String text;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ex. 서울, 레이캬비크, 리야드, 알제, 누크");
		System.out.print("수도 이름을 입력시 나라 이름이 출력됩니다 : ");
		city = sc.nextLine();
		
		switch(city) {
			case "서울" : 
				text = "대한민국";
				break;
			case "레이캬비크" :
				text = "아이슬란드";
				break;
			case "리야드" :
				text = "사우디아라비아";
				break;
			case "알제" :
				text = "알제리";
				break;
			case "누크" :
				text = "그린란드";
				break;
			default :
				text = "잘못된 수도명 입니다. 다시 입력해 주세요.";
		}
		System.out.println(text);
		
		sc.close();
	}
	
	public static void method4() {
		int month = 0;
		String season;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12까지 원하는 숫자를 입력해주세요 : ");
		month = sc.nextInt();
		
		switch(month) {
			case 1:
				season = "겨울";
				break;
			case 2:
				season = "겨울";
				break;
			case 3:
				season = "봄";
				break;
			case 4:
				season = "봄";
				break;
			case 5:
				season = "봄";
				break;
			case 6:
				season = "여름";
				break;
			case 7:
				season = "여름";
				break;
			case 8:
				season = "여름";
				break;
			case 9:
				season = "가을";
				break;
			case 10:
				season = "가을";
				break;
			case 11:
				season = "가을";
				break;
			case 12:
				season = "겨울";
				break;
			default :
				season = month+"월은 존재하지 않습니다.";
		}
		System.out.println(season);
		
		sc.close();
	}
	
	public static void RPS() {
		String user;
		String com;
		int key = 0;
		String result;
		// 가위 0 바위 1 보 2 
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("가위, 바위, 보 중에 하나를 입력해주세요~ : ");
		user = sc.nextLine();
		
		key = rd.nextInt(3);
		
		switch (key) {
			case 0 :
				com = "가위";
				break;
			case 1 :
				com = "바위";
				break;
			default :
				com = "보";
		}
		
		if (user.equals("가위")) {
			if (com.equals("가위")) {
				result = "무승부 입니다.";
			}
			else if (com.equals("바위")) {
				result = "컴퓨터의 승 입니다.";
			}
			else {
				result = "당신의 승 입니다.";
			}
		}
		else if (user.equals("바위")) {
			if (com.equals("가위")) {
				result = "당신의 승 입니다.";
			}
			else if (com.equals("바위")) {
				result = "무승부 입니다.";
			}
			else {
				result = "컴퓨터의 승 입니다.";
			}
		}
		else {
			if (com.equals("가위")) {
				result = "컴퓨터의 승 입니다.";
			}
			else if (com.equals("바위")) {
				result = "당신의 승 입니다.";
			}
			else {
				result = "무승부 입니다.";
			}
		}
		
		System.out.println();
		System.out.println("유저 : "+user+", 컴퓨터 : "+com);
		System.out.println(result);
		
		sc.close();
		
	}
	
	public static void method5() {
		String text;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A, B, C, D, E, F 중 하나의 등급을 입력하세요 : ");
		char grade = sc.next().charAt(0);
		
		switch (grade) {
			case 'A' : case 'a' :
				text = "4.0";
				break;
			case 'B' : case 'b' :
				text = "3.0";
				break;
			case 'C' : case 'c' :
				text = "2.0";
				break;
			case 'D' : case 'd' :
				text = "1.0";
				break;
			case 'E' : case 'e' :
				text = "0.5";
				break;
			case 'F' : case 'f' :
				text = "0.0";
				break;
			default : 
				text = "입력한 정보가 없습니다.";	
		}
		System.out.println(text);
		
		sc.close();
	}
	
	public static void test1() {
		char ch;
		int change = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("글자 하나 입력시 유니코드로 바꿔 출력합니다 : ");
		ch = sc.next().charAt(0);
		
		change = (int) ch;
				
		System.out.println();
		System.out.println("문자 : "+ch);
		System.out.println("a unicode : "+change);
		
		sc.close();
	}
	
	public static void test2() {
		double korScore = 0.0;
		double engScore = 0.0;
		double mathScore = 0.0;
		int total = 0;
		int avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		korScore = sc.nextDouble();
		System.out.print("영어 점수를 입력하세요 : ");
		engScore = sc.nextDouble();
		System.out.print("수학 점수를 입력하세요 : ");
		mathScore = sc.nextDouble();
		
		total = (int)(korScore + engScore + mathScore);
		avg = total / 3;
		
		System.out.println();
		System.out.println("국어 : "+korScore);
		System.out.println("영어 : "+engScore);
		System.out.println("수학 : "+mathScore);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		sc.close();
	}
	
	public static void test3() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		/*
		System.out.println(iNum1/5); // 2
		System.out.println(iNum2/2 ); // 2
		System.out.println((double)iNum1); // 10.0
		System.out.println(dNum*4); // 10.0
		System.out.println((double)iNum1/4); // 2.5
		System.out.println(dNum); // 2.5
		System.out.println((int)fNum); // 3
		System.out.println((int)(iNum1/fNum)); // 3
		System.out.println((iNum1/fNum));// 3.3333333
		System.out.println((iNum1/fNum)); // 3.3333333333333335
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println((int)(ch+iNum1)); // 75
		System.out.println( (char)(ch+iNum1)); // 'K'
		*/
		System.out.println( iNum1%iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( iNum2*dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( (double)iNum1/(double)iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( (int)(iNum1/fNum) ); // 3
		System.out.println( iNum1/fNum );// 3.3333333
		System.out.println( (double)iNum1/fNum ); // 3.3333333333333335
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)(ch+iNum1) ); // 75
		System.out.println( (char)(ch+iNum1) ); // 'K'
	}
	
	public static void simsim() {
		int[] arr = new int[7];
		int j = 0;

		for (int i : arr) {
			arr[j] = ((int)(Math.random()*100))+1;
			j++;
		}
		
		for (int i : arr) {
			j--;
			System.out.print(arr[j]+" ");
		}
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		//RPS();
		//method5();
		//test1();
		//test2();
		//test3();
		simsim();
	}

}
