package com.kh.ComparatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Comparator : 비교하는 객체

메서드
compare(변수명1, 변수명2) : 두 객체나 변수를 비교해서 정렬 순서를 결정
변수명1이 변수명2 보다 작으면 음수 반환
변수명1이 변수명2와 같으면 0 반환
변수명1이 변수명2 보다 크면 양수 반환
 
reversed() : 순서를 거꾸로 뒤집어서 순서를 매길 때 사용

comparing(클래스명 :: 참조할 메서드명) 클래스 밑에서 참조할 메서드를 가지고 와서 정렬 기준 만들어줌
*/

public class ComparatorEx {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		
		System.out.println(words);
		
		Comparator<String> lengthCom = Comparator.comparing(String :: length).reversed();
		
		words.sort(lengthCom);
		
		System.out.println(words);
	}
}
