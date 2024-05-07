package com.kh.MapEx;

import java.util.TreeMap;

public class TreeMapPre {

	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<>();

		String[] a = { "apple", "banana", "orange", "grape", "watermelon" };
		String[] b = { "사과", "바나나", "오렌지", "포도", "수박" };
		
		for(int i=0; i<a.length; i++) {
			tm.put(a[i], b[i]);
		}
		
		System.out.println(tm);
		System.out.println(tm.get("banana"));
		System.out.println(tm.size());
		System.out.println(tm.isEmpty());
		System.out.println(tm.containsKey("grape"));
		System.out.println(tm.containsValue("포도"));
		
		for(String key : tm.keySet()) {
			System.out.print(key+" ");
		}
		System.out.println();
		
		for(String value : tm.values()) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		
		tm.clear();
		System.out.println(tm.isEmpty());
	}
}
