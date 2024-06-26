package com.kh.StackEx;

import java.util.Stack;

/*
Stack(스택) : 데이터를 저장하는 자료구조(LIFO - 후입선출)
			 ex. 뒤로 가기 기능, 실행 취소 기능

메서드
push() : 스택에 데이터 추가 (add도 가능, add 는 보통 리스트나 컬렉션에서 주로 사용 - stack 클래스가 vector를 상속받아 만들어진 클래스라 add도 사용 가능)
pop() : 스택에서 맨 위에 있는 데이터를 제거하고 그 값을 반환(보여줌)
peek() : 스택에서 가장 위(꼭대기) 데이터를 보여주며 단순히 보여주기만 할뿐 제거하지는 않음(큐에서는 제일 앞에 위치한 데이터를 보여줌) 
		 -> 스택과 큐 모두 팝, 디큐 처럼 바로 다음에 나올 값을 알려줌 
isEmpty() : 비어있는지 확인
size() : 크기 확인

*/

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(1);
		stack.push(2);

		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println("======= 스택 2 =======");

		Stack<Integer> stack2 = new Stack<>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		System.out.println("가장 마지막에 보여주고 사라진 스택2의 값 : " + stack2.pop());
		System.out.println("스택 2의 맨 위 값은 : " + stack2.peek());
		System.out.println("스택 2는 비어있나요?? : " + stack2.isEmpty());
		System.out.println("스택 2의 사이즈는? : "+stack2.size());

	}
}
