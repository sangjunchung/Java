package com.kh.RunnableEx;

/*
Runnable 
Thread 대신 여러개 가져오거나 상속받을 때 사용하는 인터페이스
*/

public class RunnableEx implements Runnable {

	@Override
	public void run() {
			System.out.println("스레드 실행 중");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("스레드 종료");
	}
}
