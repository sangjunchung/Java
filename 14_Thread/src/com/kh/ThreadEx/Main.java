package com.kh.ThreadEx;

public class Main {

	public static void main(String[] args) {
		ThreadEx thread = new ThreadEx();
		thread.start();

		System.out.println("1차 스레드 끝, Ex2 스레드 시작!");

		for (int i = 0; i < 3; i++) {
			Thread t = new ThreadEx2(i);

			if (i == 2) {
				t.setPriority(Thread.MIN_PRIORITY);
			} else if (i == 1) {
				t.setPriority(Thread.MAX_PRIORITY);
			} else {
				t.setPriority(Thread.NORM_PRIORITY);
			}
			t.start();
		}

		System.out.println("메인 끝~~~!");
	}
}
