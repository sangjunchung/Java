package com.kh.SetEx;

import java.util.HashSet;

/*
set (집합, 주머니) 
	순서를 유지하지 않음
	중복 데이터 저장 X (같은게 들어오면 덮어쓰기)
	
	HashSet (대표적인 set) : 처리 속도가 빠른 set
	LinkedHashSet : 순서를 유지하는 set
	TreeSet : 자동정렬되는 set
	
	ex. HashSet
	 		사용조건 1 : 객체에 equals() 가 오버로딩 되어 있어야함
			사용조건 2 : 객체에 hashCode() 가 오버로딩 되어 있어야함
			Set<자료형> set = new HashSet<>();
			HashSet<자료형> hash = new HashSet<>();	 
*/

public class SetEx {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		// add 데이터를 추가
		set.add("로맨스");
		set.add("공포");
		set.add("액션"); 
		set.add("스릴러");
		System.out.println(set);
		// remove 데이터 제거
		set.remove("로맨스");
		System.out.println(set);
		// size 데이터 크기 확인
		System.out.println(set.size());
		// contains 특정 데이터가 존재하는지 확인
		System.out.println(set.contains("스릴러"));
		// clear 데이터 모두 제거
		set.clear();
		System.out.println(set);
	}
}
