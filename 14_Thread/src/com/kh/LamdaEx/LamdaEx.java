package com.kh.LamdaEx;

/*
람다식(Lamda)
클래스식으로 구분해서 만드는 함수를 하나의 식으로 표현한 것
매서드의 이름이 필요없기 때문에 이름이 없어서 익명 함수

기존에 작성하던 방식
public 반환타입 메서드명(매개변수){ 실행문 }

람다식
( 매개변수 목록 ) -> { 람다식 바디 }

ex.
기존식 : public String Hello(){ return "World!" }
람다식 : () -> "World!"

람다식의 장점 : 코드를 간단하게 만들 수 있음
람다식의 단점 : 람다식이 너무 많아지면 코드 사용의 구분이 어려움
*/

public class LamdaEx {
	private static int num = 0;

	public void basicThread() {
		for (int i = 0; i < 3; i++) {
			Runnable r = new Runnable() {

				@Override
				public void run() {
					synchronized (LamdaEx.class) {
						num++;
						System.out.println("숫자 : " + num);
					}
				}
			};
			Thread t = new Thread(r);
			t.start();
		}
	}

	public void lamdaThread() {
		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(() -> {
				synchronized (LamdaEx.class) {
					num++;
					System.out.println("숫자 : " + num);
				}
			});
			t.start();
		}
	}
}
