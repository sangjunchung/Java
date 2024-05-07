package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("사과");
		a.add("바나나");
		a.add("오렌지");
	
		System.out.println(a);
		System.out.println(a.get(1));
		
		a.set(1, "포도");
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		a.remove(2);
		System.out.println(a);
		
		a.remove("사과");
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
	}
}
