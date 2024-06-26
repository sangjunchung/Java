package com.kh.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue(큐) - 먼저 추가된 항목이 먼저 제거(FIFO - 선입선출)
		    데이터가 줄을 서있는 것과 유사하며, 가장 먼저 등어간 항목이 가장 앞에 위치
			ex. 대기, 이벤트 처리

메서드
offer() : 큐에 공간이 충분한 경우 값이 추가되고, 추가되면 true 반환, 추가되지 못하면 예외
		add를 사용할 수 있지만 offer와 마찬가지로 공간이 없으면 예외 처리가됨
poll() : 값을 제거하고 반환, 만약에 비어있는 경우 null 반환
remove() : poll 과 동일한 기능을 수행하지만, 비어있는 경우 예외를 던짐
peek() : 맨 앞에 있는 값을 반환, 제거하지는 않음
element() : peek 와 동일한 기능을 수행하지만, 비어있는 경우 예외를 던짐
*/
public class QueueEx {
	
	public static void main(String[] args) {
		// Queue는 인터페이스 이기 때문에 직접 Queue = new Queue 로 사용할수 없음
		// 그래서 Queue = new LinkedList 로 사용함
		Queue<Integer> que = new LinkedList<>();
		que.offer(1);
		que.offer(2);
		que.offer(3);
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que.peek());
		System.out.println(que.isEmpty());
		System.out.println(que.size());
	}
}
