package com.kh.DeQueEx;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Deque(덱) - 양쪽 끝에서 삽입과 삭제가 모두 가능
 		    스택이랑 큐의 기능 모두 제공, 양방향으로 데이터를 추가하거나 제거할 수 있음
 		    
메서드
addFirst() : 맨 앞에 값을 추가
removeFirst() : 맨 앞의 값을 제거
addLast() : 맨 뒤에 값을 추가
removeLast() : 맨 뒤의 값을 제거
getFirst() : 맨 앞의 값이 무엇인지 확인(제거 X)
getLast() : 맨 뒤의 값이 무엇인지 확인(제거 X)

Deque 는 인터페이스이기 때문에 ArrayDeque 로 된 객체를 이용해서 공간 생성
*/

public class DeQueEx {
	
	public static void main(String[] args) {
		Deque<Integer> dec = new ArrayDeque<>();
		
		System.out.println(dec);
		dec.addFirst(1);
		dec.addFirst(2);
		dec.addFirst(3);
		dec.addLast(4);
		dec.add(5);
		dec.addFirst(6);
		System.out.println(dec);
		
		dec.addLast(7);
		dec.addLast(9);
		dec.addLast(8);
		System.out.println(dec);
		
		dec.removeFirst();
		System.out.println(dec);
		
		dec.remove();
		System.out.println(dec);
		
		dec.removeLast();
		System.out.println(dec);
	
		System.out.println(dec.getFirst());
		System.out.println(dec.getLast());
	}
}
