package com.kh.RunnablePre;

public class RunnablePractice implements Runnable {
	int second;

	public RunnablePractice(int inSecond) {
		this.second = inSecond;
	}

	@Override
	public void run() {
		try {
			System.out.println(second + "스레드 시작");

			Thread.sleep(1000);

			System.out.println(second + "스레드 종료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
