package com.kh.array;

public class ArrayEx1 {
/*
	배열 (자료구조)
	같은 자료형의 변수를 하나의 묶음으로 다루는 것
	생성된 배열은 index를 이용해서 구분
	배열의 길이를 n이라 할때 시작은 0, 마지막은 n-1
	
	[참조형 변수] - 주소를 저장하는 변수
	
	-소문자로 시작하는(int double 등)을 제외한 대부분의 변수
	-대표적인 참조형 변수 : String
*/
	public static void main(String[] args) {
		int[] numbers = new int[5];
		System.out.println(numbers);
		System.out.println(numbers[0]);
		
		numbers[0] = 10;
		System.out.println(numbers[0]);
		
		int num = 10;
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = num;
			num += 10;
		}
		for(int i: numbers) {
			System.out.println(i);
		}
		
		String[] str = new String[7];
		
		str[0] = "월";
		str[1] = "화";
		str[2] = "수";
		str[3] = "목";
		str[4] = "금";
		str[5] = "토";
		str[6] = "일";
		
		System.out.println(str[0]);
		System.out.println(str[1]);
	}
}
