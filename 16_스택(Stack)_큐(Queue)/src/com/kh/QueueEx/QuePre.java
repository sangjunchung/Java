package com.kh.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QuePre {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.offer(80);
		que.offer(60);
		que.offer(30);
		que.offer(20);
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que.peek());
		System.out.println(que.isEmpty());
		System.out.println(que);
	}
}
