package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
	public ArrayPre() {
		
	}
	
	public void practice1() {
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;
		
		for(int i : num) {
			result += i;
		}
		System.out.println("배열의 총 합 : "+result);
	}
	
	public void practice2() {
		ArrayList<String> goods = new ArrayList<>();
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("TV");
		goods.add("에어컨");
		
		System.out.println(goods);
		
		for(String a : goods) {
			System.out.print(a+" ");
		}
	}
	
	public void practice3() {
		int[] numbers = {3, 7, 2, 9, 1};
		int max = numbers[0];
		
		for(int i : numbers) {
			if(max < i) max = i;
		}
		System.out.println("배열의 최대 값 : "+max);
	}
	
	public void practice4() {
		String[] fruit = {"사과", "바나나", "딸기", "오렌지"};
		String search = "키위";
		boolean found = false;
		
		for(String str : fruit) {
			if(search.equals(str)) {
				found = true;
				break;
			}
		}
		System.out.println(search+ " 찾았니? "+(found ? "찾음" : "못찾음"));
	}
	
	public void practice5() {
		String[] zoo = {"코끼리", "원숭이", "푸바오", "토끼", "공작"};
		String search ="";
		boolean found = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾는 동물을 입력해주세요 : ");
		search = sc.next();
		
		for(String a : zoo) {
			if(search.equals(a)) {
				found = true;
				break;
			}
		}
		System.out.println(search+ "는 동물원에 "+(found? "있습니다." : "없습니다."));
	}
}
