package com.kh.ExceptionEx;

import java.util.*;

/*
Exception = 예외
	예외는 코드로 처리 가능한 에러
 
try{
내가 예외를 발생시킬 수 있지만 작성해서 시도하고 싶은 코드를 작성
} catch (Exception e){
예외가 발생했을 때 보여줄 코드나 문구를 작성
}

catch문은 무제한으로 작성할 수 있음
catch 를 여러개 쓸 경우
	catch(배열 Exception e)
	      .....
	catch(Exception e) 예외 최상위 Exception은 가장 마지막에 사용
*/

public class ExceptionEx {
	private Scanner sc = new Scanner(System.in);

	public ExceptionEx() {

	}

	public void method1() {
		int[] array = { 10, 20, 30, 40 };

		for (int i = 0; i <= array.length; i++) {
			try {
				System.out.println(array[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("1번 예외상황");
			} catch (Exception e) {
				System.out.println("에러 발생! 배열의 인덱스를 벗어났습니다.");
			}
		}
	}

	public static void main(String[] args) {
		ExceptionEx exception = new ExceptionEx();
		exception.method1();
	}
}
