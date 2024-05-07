package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {

	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값을 입력하세요. : ");
		int a = sc.nextInt();
		
		System.out.print("b의 값을 입력하세요. : ");
		int b = sc.nextInt();
		
		System.out.println();
		System.out.println("a의 값은 "+a+" 이고, b의 값은 "+b+" 입니다.");		
		if(a==b) System.out.println("그러므로 a와 b의 값은 같습니다.");
		else System.out.println("그러므로 a와 b의 값은 다릅니다.");
		
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("c의 값을 입력하세요. : ");
		int c = sc.nextInt();
		
		System.out.print("d의 값을 입력하세요. : ");
		int d = sc.nextInt();
		int e = ++c;
		
		System.out.println();
		System.out.println("c : "+c+", d : "+d+", e : "+e);
		System.out.println("c == d : "+(c==d));
		System.out.println("c == e : "+(c==e));
		
		int f = ++c;
		System.out.println("f : "+f);
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람의 수를 입력하세요. : ");
		int human = sc.nextInt();
		System.out.print("사탕의 갯수를 입력하세요. : ");
		int candy = sc.nextInt();
		
		if(human > candy) {
			System.out.println();
			System.out.println("사람의 수가 사탕 갯수보다 많아 한 사람도 사탕을 가져가지 못합니다.");
			System.out.print("사탕은 "+candy+" 개 남았습니다.");
		}
		else {
			int getCandy = candy / human;
			int extraCandy = candy % human;
			
			System.out.println();
			System.out.print("한 사람당 사탕을 "+getCandy+" 개씩 나눠 가졌으며, "+extraCandy+" 개의 여분의 사탕이 남았습니다.");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
	}

}
