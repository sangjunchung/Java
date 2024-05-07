package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {

	public void guguDan() {
		int dan = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 세계로 오신 것을 환영합니다.");
		
		while(true) {
			System.out.println("종료를 원하면 0 입력하세요.");
			System.out.print("원하는 단을 입력해 주세요 : ");
			dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("구구단을 종료합니다.");
				break;
			}
			
			System.out.println("=================== "+dan+"단 ===================");
			for (int i = 1; i < 10; i++) {
				System.out.print(dan+ " * " +i+" = "+(dan*i)+"\t");
				if((i%3) == 0) System.out.println();
			}
			System.out.println("===========================================");
		}
	}
	
	public void guguDan2() {
		int dan = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("거꾸로 구구단 세계로 오신 것을 환영합니다.");
		
		while(true) {
			int line = 1;
			System.out.println("종료를 원하면 0 입력하세요.");
			System.out.print("원하는 단을 입력해 주세요 : ");
			dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("구구단을 종료합니다.");
				break;
			}
			
			System.out.println("=================== "+dan+"단 ===================");
			for (int i = 9; i >= 1; i--) {
				System.out.print(dan+ " * " +i+" = "+(dan*i)+"\t");
				if((line%3) == 0) {
					System.out.println();
				}
				line++;
			}
			System.out.println("===========================================");
		}
	}
	
	public void guguDan3() {
		
		for (int dan = 1; dan < 10; dan++) {
			System.out.println("* * * * * * * * * * "+dan+" * * * * * * * * * * *");
			for (int num = 1; num < 10; num++) {
				System.out.printf("%d * %d = %d\t", dan, num, (dan*num));
				if((num%3)==0) System.out.println();
			}
			System.out.println();
		}
	}
	
	public void guguDan4() {
		
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("* * * * * * * * * * "+dan+" * * * * * * * * * * *");
			for (int num = 1; num < 10; num++) {
				System.out.printf("%d * %d = %d\t", dan, num, (dan*num));
				if((num%3)==0) System.out.println();
			}
			System.out.println();
		}
	}
	public void randomNumber() {
		int rdNum = 0;
		
		Random rd = new Random();
		
		rdNum = rd.nextInt(10)+1;
		System.out.print("랜덤 숫자 : "+rdNum);
	}
	
	public void randomFor() {
		int rdNum = 0;
		
		Random rd = new Random();
		
		for(int i=0; i<3; i++) {
			rdNum = rd.nextInt(10)+1;
			System.out.print(rdNum+" ");
		}
	}
	
	public void randomFor2() {
		int rdNum = 0;
		
		Random rd = new Random();
		
		for(int i=1; i<=6; i++) {
			rdNum = rd.nextInt(45)+1;
			System.out.println("랜덤 번호 "+i+" : "+rdNum);
		}
	}
	
	public void oddNum() {
		for (int num=1; num<=10; num++) {
			if((num%2)==1) System.out.print(num+" ");
		}
	}
	
	public void evenNum() {
		for(int num = 1; num<=10; num++) {
			if((num%2)==0) System.out.print(num+" ");
		}
	}
	
	public void squareStar() {
		int star = 3;
		
		for (int i=0; i<star; i++) {
			for (int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void fiveStar() {
		int star = 5;
		
		for (int i=0; i<star; i++) {
			for (int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void numberGame() {
		int rdNum = 0;
		int innum = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		rdNum = rd.nextInt(25)+1;
		
		while(check) {
			System.out.print("숫자를 맞춰보세요(1~25) : ");
			innum = sc.nextInt();
			
			if (rdNum == innum) {
				System.out.println("축하합니다!! 숫자를 맞추셨습니다.");
				System.out.println("랜덤 숫자 : "+rdNum);
				break;
			} else {
				if (rdNum > innum) {
					System.out.println("땡! 틀렸습니다. 랜덤 숫자는 입력한 수보다 큽니다.");
				} else {
					System.out.println("땡! 틀렸습니다. 랜덤 숫자는 입력한 수보다 작습니다.");
				}
			}
		}
	}
	
	public void numberGameFor() {
		int rdNum = 0;
		int innum = 0;
		boolean gameOver = false;
		boolean gameAgain = true;
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		while(gameAgain) {
			gameAgain = false;
			rdNum = rd.nextInt(25)+1;
			
			for(int life = 2; life >= 0; life--) {
				System.out.print("숫자를 맞춰보세요. 기회는 3번 입니다 (1~25) : ");
				innum = sc.nextInt();
				
				if (rdNum == innum) {
					System.out.println("축하합니다!! 숫자를 맞추셨습니다.");
					System.out.println("랜덤 숫자 : "+rdNum);
					gameOver = false;
					break;
				} else {
					if (rdNum > innum) {
						System.out.println("땡! 틀렸습니다. 랜덤 숫자는 입력한 수보다 큽니다.");
						System.out.println("잔여 목숨 : "+life);
					} else {
						System.out.println("땡! 틀렸습니다. 랜덤 숫자는 입력한 수보다 작습니다.");
						System.out.println("잔여 목숨 : "+life);
					}
				}
				gameOver = true;
			}
			if(gameOver) {
				System.out.println("모든 기회를 소진하였습니다. 게임오버");
				System.out.println("랜덤 숫자는 " +rdNum+" 이었습니다.");
			}
			System.out.print("게임을 다시 시작하시겠습니까? 1. yes / 2. no : ");
			int regame = sc.nextInt();
			
			if (regame == 1) {
				gameAgain = true;
			} else System.out.println("프로그램을 종료합니다.");
		}
	}
}
