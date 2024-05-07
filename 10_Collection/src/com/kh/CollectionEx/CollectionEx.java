package com.kh.CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Collection 인터페이스 파일들을 연결시켜주는 존재
		   List, Set 의 부모 클래스
		   순차적으로 회전하면서 코드를 조회하거나 코드 안에 작성한 내용을 순회하고, 
		   추가 삭제 검색 등 기본 작업을 제공

sort = 리스트를 기본 정렬 순서에 따라 정렬
	1. 숫자 : 오름차순 정렬 - 작은 값에서 큰 값 순서로 정렬
	2. 문자열 : 문자의 사전 순서에 따라 정렬
	3. 우리가 파일을 만들면서 정한 기준 : compareTo() 메소드를 재 정의하여 정렬 기준을 작성할 수 있음

min, max = 최소값, 최대값

binarySearch = 이진탐색을 사용해서 리스트에서 지정된 요소를 찾을 수 있음
			   이진탐색 : 정렬된 배열이나 리스트에서 특정한 값의 위치를 찾는 알고리즘

addAll = 내가 추가하고자 하는 모든 값을 추가

*/

public class CollectionEx {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(4);
		numbers.add(1);
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		ArrayList<String> color = new ArrayList<>(Arrays.asList("black", "white"));
		System.out.println(color);
	}
}
