package com.kh.arrayList.ex;

import java.util.ArrayList;

/*
	ArrayList 리스트는 배열과 비슷하지만 크기가 제한이 되어있지 않고 원하는 만큼 담을 수 있음
	리스트 명을 ArrayList 로 사용하지 말 것
	
	선언 ArrayList<자료형> 변수명 = new ArrayList<자료형>();
	자료형 int > Integer / String > String / double > Double
	
	method
	add 추가
	get 반환
	set 수정
	remove 삭제
	size 개수 확인
	isEmpty 비어있는지 확인
	clear 모두 삭제
*/
public class ArrayListEx {
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		System.out.println(num.isEmpty());
		
		num.add(10);
		
		System.out.println("추가 확인 : "+num.get(0));
		System.out.println(num.size());
		
		num.set(0, null);
		System.out.println(num.get(0));
		
		num.remove(0);
		System.out.println(num.size());
	}
}
