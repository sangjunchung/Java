package com.kh.SetEx;

import java.util.TreeSet;

/*
TreeSet
중복을 허용하지 않고, 값을 자동으로 정렬하는 구조 
검색 트리의 형태로 데이터를 저장하며, 자동으로 정렬된 상태를 유지

자동으로 0 ~ 9, A - Z, a - z, ㄱ - ㅎ 정렬해줌

add() : 추가
remove() : 제거
contains() : 지정된 값이 있는지 확인
isEmpty() : TreeSet 이 비어있는지 확인
size() : 개수 확인
first() : 가장 작은 데이터 반환
last() : 가장 큰 데이터 반환
clear() : 모든 값 제거
*/

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(5);
		tree.add(2);
		tree.add(1);
		
		System.out.println(tree);
		
		tree.remove(2);
		
		System.out.println(tree);
		
		System.out.println(tree.contains(5));
		System.out.println(tree.isEmpty());
		System.out.println(tree.size());
		System.out.println(tree.first());
		System.out.println(tree.last());
		tree.clear();
		System.out.println(tree);
		
	}
}
