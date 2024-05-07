package com.kh.IteratorEx;

import java.util.*;

/*
ListIterator
hasNext() : 다음 값이 존재하는지 true false 로 확인
next() : 다음 값 가져오기 
hasPrevious() : 이전 값이 존재하는지 true false 로 확인
previous() : 이전 값 가져오기

값을 추가, 삭제할 수 있음
add() : 추가
remove() : 삭제
*/

public class ListIteratorEx {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<>();
		color.add("빨강");
		color.add("화이트");
		color.add("초록");

		ListIterator<String> repeat = color.listIterator();

		while (repeat.hasNext()) {
			System.out.println(repeat.next());
		}

		while (repeat.hasPrevious()) {
			System.out.println(repeat.previous());
		}

		// add 해서 값을 추가할 때는 앞에서 추가됨
		repeat.add("노랑");
		System.out.println(color);

		/*
		 * Exception in thread "main" java.lang.IllegalStateException at
		 * java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980) at
		 * com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:39)
		 * 
		 * add 값을 추가하면서 앞으로 이동한 다음에는 리스트의 끝에 위치
		 * 더 이상 다음이 없기 때문에 삭제할 수 없음
		 * 
		 * 해결 방법
		 * next() 또는 previous 를 사용하여 위치를 이동시킨 후 사용하면 삭제 가능
		 */
		repeat.previous();
		repeat.remove();
		System.out.println(color);
	}
}
