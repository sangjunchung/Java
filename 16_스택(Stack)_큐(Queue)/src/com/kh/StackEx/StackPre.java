package com.kh.StackEx;

import java.util.Stack;

public class StackPre {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		stack.push(20);

		System.out.println("스택 현황 : " + stack);
		System.out.println("제거되는 맨위 값 : " + stack.pop());
		System.out.println("현재 맨위 값 : " + stack.peek());
		System.out.println("현재 스택이 비어있는지? : " + stack.isEmpty());
		System.out.println("현재 스택의 사이즈는? : " + stack.size());
		System.out.println("스택 현황 : " + stack);
	}
}
