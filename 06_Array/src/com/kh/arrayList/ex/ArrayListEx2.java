package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	public ArrayListEx2() {
		
	}
	
	public void method1() {
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("딸기");
		fruit.add("바나나");
		fruit.add("사과");
		
		for(int i=0; i<fruit.size(); i++) {
			System.out.print(fruit.get(i)+" ");
		}
		System.out.println();
		
		fruit.set(1, "키위");
		
		for(int i=0; i<fruit.size(); i++) {
			System.out.print(fruit.get(i)+" ");
		}
		System.out.println();
		System.out.println(fruit.size());
		
		fruit.remove(1);
		
		for(String str : fruit) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println(fruit.isEmpty());
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		System.out.println(animal.size());
		
		for(int i =0; i<animal.size(); i++) {
			System.out.print(animal.get(i)+" ");
		}
		System.out.println();
	
		
		animal.set(2, "토끼");
		
		for(int i =0; i<animal.size(); i++) {
			System.out.print(animal.get(i)+" ");
		}
		System.out.println();
		
		animal.remove(3);
		
		for(String str : animal) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		animal.clear();
		System.out.println(animal.isEmpty());
	}
	
	public void method3() {
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== 피자메뉴 ===");
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페퍼로니");
		
		for(int i=0; i<pizza.size(); i++) {
			System.out.print(pizza.get(i)+" ");
		}
		System.out.println();
		
		pizza.set(2, "파인애플");
		
		for(String str : pizza) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		pizza.remove("파인애플");
		
		for(String str : pizza) {
			System.out.print(str+" ");
		}
		System.out.println();
		System.out.println("피자가게가 사라질 예정입니다.");
		
		pizza.clear();
		System.out.println(pizza.isEmpty());
	}
	
	public static void main(String[] args) {
		ArrayListEx2 al2 = new ArrayListEx2();
		//al2.method1();
		//al2.method2();
		al2.method3();
	}
}
