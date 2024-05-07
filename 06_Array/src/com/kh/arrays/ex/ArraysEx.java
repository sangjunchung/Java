package com.kh.arrays.ex;

import java.util.Arrays;
/*
	Arrays 배열과 관련된 다양한 작업을 쉽게 처리할 수 있도록 도와줌
	
	메소드
	sort() : 오름차순으로 정렬
	copyOf() : 배열을 복사해서 똑같은 배열을 생성해줌
	equals() : 두 배열이 똑같은지 비교
	fill() : 배열을 모두 지정된 값으로 채워줌
	toString() : 배열을 문자열로 변경해서 보여줌
	
	asList() : 배열을 리스트로 변환해서 추가, 배열을 수정하지 않고 배열의 내용을 감싸서 보여줌
	
	String[] 배열 = {"사과", "바나나"};
	ArrayList<String> 리스트 = Arrays.asList(배열);
	ArrayList<String> 리스트 = Arrays.asList("사과", "바나나");
*/
public class ArraysEx {
	
	public static void main(String[] args) {
		
		int[] num = {5, 8, 2, 4, 3};
		
		// 배열을 오름차순으로 정렬
		Arrays.sort(num);
		// 배열의 주소를 출력
		System.out.println(num);
		// 배열을 문자열로 변경해서 출력
		System.out.println(Arrays.toString(num));
		
		// 배열을 복사(배열명, 길이(어디까지 복사할지))
		int[] abd = Arrays.copyOf(num, num.length);
		
		System.out.println(Arrays.toString(abd));
		// 두 배열이 동일하는지 비교
		System.out.println(Arrays.equals(num, abd));
		
		int[] sameNum = new int[5];
		// 배열에 모두 같은 수로 채움
		Arrays.fill(sameNum, 3);
		
		System.out.println(Arrays.toString(sameNum));
	}
}
