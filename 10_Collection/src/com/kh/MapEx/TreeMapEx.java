package com.kh.MapEx;

import java.util.TreeMap;

/*
TreeMap 이진검색 트리 - 데이터 검색 삽입 삭제 연산을 빠르게 가능
키-값(key-value) 저장하는 자료구조
Map 또한 키 중복 X 키는 동일하지만 value가 다를 경우 가장 마지막에 작성한 value가 덮어씌어짐

키를 기준으로 정렬해서 저장(정렬 : 0-9, A-Z, a-z, ㄱ-ㅎ) 
 
메서드
put(key, value) : TreeMap 에 key, value 추가
get(key) : 저장된 키에 있는 value 값을 전달 
containsKey(key) : TreeMap 에 해당 key 값이 있는지 확인
containsValue(value) : TreeMap 에 해당 value 값이 있는지 확인 
remove(key) : 해당 키와 키에 저장된 값을 삭제
size() : 키-값 쌍의 개수 반환 (저장되어 있는)
isEmpty() : 비어있는지 확인
clear() : 모두 제거
*/

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		Integer[] keys = { 1, 2, 3 };
		String[] values = { "one", "two", "three" };

		for (int i = 0; i < keys.length; i++) {
			tm.put(keys[i], values[i]);
		}
		
		System.out.println(tm);
		System.out.println(tm.get(2));
		
		tm.remove(3);
		System.out.println(tm);
		
		System.out.println(tm.containsKey(1));
		System.out.println(tm.size());
		System.out.println(tm.isEmpty());
		
		tm.clear();
		System.out.println(tm);
		
	}
}
