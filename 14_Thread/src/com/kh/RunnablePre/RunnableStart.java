package com.kh.RunnablePre;

public class RunnableStart {
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			RunnablePractice rp = new RunnablePractice(i);
			
			Thread t = new Thread(rp);
			t.start();
			
		}
		
		System.out.println("메인 메서드 종료일까요?");
	}
}
