package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>(Set.of("키위", "복숭아", "참외", "수박", "딸기"));
		
		System.out.println(ts);
		ts.remove("복숭아");
		System.out.println(ts.contains("수박"));
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		System.out.println(ts.first());
		System.out.println(ts.last());
		ts.clear();
		System.out.println(ts);
	}
}
