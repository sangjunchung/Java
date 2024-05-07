package com.kh.op;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 비교 연산자 == (같으면 true, 다르면 false) / != (같으면 false, 다르면 true)
		// + 는 " " 문자열이 있으면 각 각의 값을 이어주는 역활을 함
		// 문자열이 들어간 출력 프린트에서 연산(+, -, *, /)이 포함되었을 경우 +가 우선순위가 높을 때
		// 이어주는 역활이 아닌 연산으로 동작할 수도 있으므로 괄호()를 사용하여 우선 순위를 정립해줘야함
		
		int a = 10;
		int b = 10;
		
		System.out.println(" a == b 일 때 : " + (a==b));
		
		int c = 20;
		int d = 10;
		
		System.out.println(" c != d 일 때 : " + (c!=d));
		
		System.out.println(a==c);
	}

}
