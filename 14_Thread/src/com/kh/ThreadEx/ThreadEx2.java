package com.kh.ThreadEx;

public class ThreadEx2 extends Thread {
	int second;

	public ThreadEx2(int inSecond) {
		this.second = inSecond;
	}

	@Override
	public void run() {
		System.out.println(this.second + "스레드 시작중~~");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.second + "스레드 종료 중");
	}
}
