package com.kh.SynchronizedEx;

public class SynchronizedPractice {
	private static int num = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			Thread t = new Thread(() -> {
				synchronized (SynchronizedEx.class) {
					num++;
					System.out.println("숫자 : " + num);
				}

			});
			t.start();
		}
	}
}
