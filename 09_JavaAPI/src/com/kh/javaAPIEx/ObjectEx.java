package com.kh.javaAPIEx;

/*
Object : 모든 자바 클래스의 최상위 클래스
 		 모든 클래스가 기본으로 상속받는 클래스
 		 Object 클래스는 기본으로 사용한다 라는 개념이 있기 때문에
 		 굳이 new Object 를 사용해서 사용하진 않음
 		 기본으로 모든 클래스는 Object가 기본으로 쓸 수 있게 만들어짐
 		 메서드 예 : equals, toString
*/
public class ObjectEx {
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Object에서 부터 내려오는 메서드 입니다.";
	}
	
	public static void main(String[] args) {
		// Object 는 기본이기 때문에 굳이 new를 사용해서 공간 생성 X, 그렇다고 만들수 없는 것은 아님
		Object obj = new Object();
		
		System.out.println(obj);
	}
}
