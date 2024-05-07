package com.kh.loop.ex;

public class LoopFor {
	/*
		for-each문
		배열이나 반복 가능한 모든 값에 대해 반복적으로 작업할 때 사용하는 편리한 반복문
		처음부터 끝까지 한번 진행
	*/
	public static void main(String[] args) {
		
		for (int i = 1; i <= 2; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("===== for문 2번 =====");
		
		for (int a = 1; a <= 3; a++) {
			System.out.print("a 의 값은 : "+a+"\n");
		}
		System.out.println("===== for문 3번 =====");
		
		for (int num = 1; num < 6; num++) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("===== for문 4번 =====");
		
		for (int num = 2; num <= 10; num += 2) {
			System.out.print(num+" ");
		}
		System.out.println();
		for (int num = 1; num <= 10; num++) {
			if ((num%2)==0) System.out.print(num+" ");
		}
		
		System.out.println();
		System.out.println("================== for문 5번 ==================");
		
		int ohdan = 5;
		
		for (int i = 1; i < 10; i++) {
			System.out.print(ohdan+ "단 5 * "+i+" = "+(ohdan*i)+"\t");
			if((i%3) == 0) System.out.println();
		}
		
		System.out.println();
		System.out.println("================== for문 6번 ==================");
		
		int samdan = 3;
		
		for (int num = 1; num < 10; num++) {
			System.out.print(samdan+ "단 3 * "+num+" = "+(samdan*num)+"\t");
			if((num%3) == 0) System.out.println();
		}
	}

}
