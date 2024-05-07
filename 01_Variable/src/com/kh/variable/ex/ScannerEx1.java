package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx1 {
	
	public static void main(String[] args) {
				
		/*
		Scanner 클래스
		
		사용자로부터 키보드 입력을 받기 위해 Java에서 제공하는 클래스
		
		기본으로 구성되어 있는 것은 아님
		import java.util.Scanner; 패키지 표시를 해준 후 사용 가능
		
		Scanner.next() : 공백 없이 단어(String) 1개 입력
		Scanner.nextLine() : 공백 포함해서 문자열(String) 입력
		Scanner.nextInt() : int형 정수 1개 입력
		Scanner.nextLong() : long형 정수 1개 입력
		Scanner.nextDouble() : 실수 1개 입력
		
		이외에 Scanner 클래스 안에는 여러가지 기능이 존재
		스캐너는 불러온 다음 Close를 사용해서 공간을 닫아주는 표시를 해주는게 좋음(필수는 아님)
		
		Scanner 사용하기
		1. 클래스 위에 import 구문 사용하여 Scanner 패키지 참조
		2. Scanner 객체 사용
		3. System.im 키보드로 입력하는 값을 받을 수 있도록 함
		4. System.out 기능 사용하여 키보드로 입력 받은 내용 출력하기
		5. Scanner.Close 메서드 사용해서 닫아주기
		*/
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		double num3;
		String word1;
		String word2;
		String str1;
		
		System.out.print("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		System.out.print("첫번째 실수 입력 : ");
		num3 = sc.nextDouble();
		
		System.out.print("첫번째 단어 입력 : ");
		word1 = sc.next();
		System.out.print("두번째 단어 입력 : ");
		word2 = sc.next();
		
		sc.nextLine();
		/* 
		   next() / nextInt() / nextDouble() 등을 작성한 이후 엔터키 입력시 버퍼(공백)가 남아 이후 nextLine() 구문을 작성시
		   해당 버퍼가 다음 nextLine() 구문에 바로 입력이 되므로 next() / nextInt() / nextDouble() 구문 사용 이후 
		   nextLine()을 작성해야되는 상황이 오면 nextLine()를 미리 한번 작성하여 버퍼 값을 제거해야함, 이후 nextLine() 사용시 정확하게 사용 가능 
		*/ 			
		System.out.println("첫번째 문장 입력 : ");
		str1 = sc.nextLine();

		System.out.println("첫번째 정수의 값 : "+num1);
		System.out.println("두번째 정수의 값 : "+num2);
		System.out.println("첫번째 실수의 값 : "+num3);
		System.out.println("첫번째 단어 : "+word1);
		System.out.println("두번째 단어 : "+word2);
		System.out.println("첫번째 문장 : "+str1);
		// Scanner 이용해서 입력을 진행할 경우 System.out.print를 이용해서 값이 제대로 입력되었는지 확인해주는게 좋음
		
		sc.close();		
		
	}
}
