package com.kh.ListEx;

import java.util.*;

/*
List : 자료를 순차적으로 나열한 자료구조(배열과 비슷)
	   인덱스가 존재함, 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
	   인터페이스 객체로 생성이 불가능함, 다형성으로 이용할 수 있음
	   
	   ex. List list = new ArrayList(3); - 3칸짜리 생성
   	   E(Element) : 요소를 뜻하는 상징적인 글자(자료형 X)
   	   				== Object String Student 등 객체를 가리지 않고 넣을 수 있음
*/

public class ListEx {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>(3);
		list.add("아무거나");
		list.add(new Object());
		list.add(123123);
		list.add(456456);
		list.add(false);
		
		System.out.println(list);
	}
}
