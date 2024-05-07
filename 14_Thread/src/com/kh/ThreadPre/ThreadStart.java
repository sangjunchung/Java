package com.kh.ThreadPre;

public class ThreadStart {

	public static void main(String[] args) {
		
		for(int i=0; i<50; i++) {
			Thread t = new ThreadPractice(i);
			t.start();
		}
		
		System.out.println("메인 메서드 종료");
	}
}
