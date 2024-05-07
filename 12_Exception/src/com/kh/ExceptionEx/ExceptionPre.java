package com.kh.ExceptionEx;

public class ExceptionPre {

	public static void main(String[] args) {

		try { // 예외가 발생할순 있지만 일단 실행
			int divResult = 10 / 0;

			System.out.println(divResult);
			// 산수관련 exception
		} catch (ArithmeticException e) {
			System.out.println("산수 문제가 발생했습니다.");
		} catch (Exception e) {

		}

		try {
			int[] array = { 1, 2, 3 };
			System.out.println(array[3]);
		} catch (Exception e) {
			System.out.println("범위를 벗어났습니다.");
		}
	}
}
