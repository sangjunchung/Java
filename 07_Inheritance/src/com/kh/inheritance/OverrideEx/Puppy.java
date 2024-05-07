package com.kh.inheritance.OverrideEx;

public class Puppy extends Animal {
	/*
	 	super - 자신이 상속받은 부모 클래스에 대한 레퍼런스 변수로, 부모 클래스의 멤버에 접근할 때 사용
				주로 객체안에 있는 부모의 멤버변수와 자신의 멤버변수를 구별하기 위해 사용

	 	super() : 자바에서 자식 클래스의 생성자는 반드시 상위 클래스의 생성자를 호출해야함
	 			  호출할 때 super()를 호출하며, 상위 클래스의 생성자를 호출할 수 있음
	*/
	public Puppy(String inName) {
		super(inName);
	}
	/*
		@Override : 부모 클래스에서 부모가 가진 메서드를 다시 작성하거나 수정해서 정의 내릴 때 사용
					필수로 작성하는 것은 아니지만, 작성을 해줌으로 인해 부모 클래스에서 가지고 와서 수정했다는 개발자적 표시를 해주는것
	*/
	
	@Override
	public void sound() {
		System.out.println(name+" 이(가) 멍멍 짖습니다.");
	}
}
