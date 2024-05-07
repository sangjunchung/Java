package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
List Vector : Java1 버전 대에서 제일 먼저 등장해서 사용된 것 
	 ArrayList : 검색에 좋음 데이터 삽입과 삭제가 빈번한 경우 부적합함
 	 LinkedList : 검색에는 부적합함 데이터 삽입과 삭제에는 좋음

*/
public class ListPre {
	
	public ListPre() {
	
	}
	
	public void linkedEx() {
		// List<String> link = new LinkedList<>(); 이렇게 사용해도 되지만 아래 사용 권장
		LinkedList<String> link = new LinkedList<>();
		link.add("말");
		link.add("호랑이");
		link.add("송아지");
		System.out.println(link);
	}
	
	public void vectorEx() {
		// List<String> vec = new Vector<>(); 이렇게 사용해도 되지만 아래 사용 권장
		Vector<String> vec = new Vector<>();
		vec.add("자바");
		vec.add("파이썬");
		vec.add("C");
		System.out.println(vec);
	}
	
	public void arrayEx() {
		ArrayList<String> array = new ArrayList<>();
		array.add("사과");
		array.add("바나나");
		array.add("포도");
		System.out.println(array);
	}
	
	public static void main(String[] args) {
		ListPre lp = new ListPre();
		
		lp.vectorEx();
		lp.linkedEx();
		lp.arrayEx();
	}
}
