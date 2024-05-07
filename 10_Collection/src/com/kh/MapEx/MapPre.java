package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {

	public MapPre() {

	}

	public void practice1() {
		Map<Integer, String> map = new HashMap<>();

		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");

		System.out.println(map);
	}

	public void practice2() {
		Map<String, String> map = new HashMap<>();

		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯데타워", "서울시 송파구");

		System.out.println(map);
		System.out.println(map.get("롯데타워"));

		map.remove("등산");

		for (String a : map.keySet()) {
			System.out.println(a + " - " + map.get(a));
		}
	}

	public void practice3() {
		Map<String, Integer> fruit = new HashMap<>();

		fruit.put("사과", 100);
		fruit.put("바나나", 200);
		fruit.put("체리", 300);

		System.out.println("200월 과일 있니? " + (fruit.containsValue(200) ? "있음" : "없음"));
		System.out.println("체리 있니? " + (fruit.containsKey("체리") ? "있음" : "없음"));

		System.out.println(fruit.size());
	}

	public void practice4() {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "에그마요");
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(4, "스파이시쉬림프");
		System.out.println(map);

		System.out.println("3번은? " + map.get(3));
		System.out.println("총 메뉴 수 : " + map.size());

		map.remove(1);
		System.out.println("맵 비어있는지? " + map.isEmpty());

		for (int i : map.keySet()) {
			System.out.println(i + "번 메뉴 : " + map.get(i));
		}
		
		for(Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey()+" - "+e.getValue());
		}
		
		map.clear();
		System.out.println(map);
		System.out.println("맵 비어있는지? " + map.isEmpty());
	}

	public static void main(String[] args) {
		MapPre mp = new MapPre();
		// mp.practice1();
		// mp.practice2();
		// mp.practice3();
		mp.practice4();
	}
}
