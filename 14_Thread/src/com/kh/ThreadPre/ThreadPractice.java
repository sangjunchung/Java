package com.kh.ThreadPre;

import java.util.Date;

public class ThreadPractice extends Thread {
	int second;
	
	public ThreadPractice(int inSecond) {
		this.second = inSecond;
	}

	@Override
	public void run() {
		Date date = new Date();
		System.out.println(second + "시작"+date);

		try {
			Thread.sleep(3000);
			
			date = new Date();
			System.out.println(second + "종료"+date);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
