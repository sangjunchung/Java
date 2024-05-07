package com.kh.interfaceEx;

/*
interface : 클래스 간의 접점을 만드는 용도
필드에 작성하는 모든 변수가 public static final 로 작성이 됨
굳이 변수 앞에 public static final을 붙이지 않아도 알아서 붙어서 쓰임

메서드에 작성하는 모든 메서드 앞에 public abstract가 알아서 붙어서 만들어짐

인터페이스는 자바에서 다른 클래스에서 구현할 메스드의 명세를 정의하는 역활
인터페이스에 작성하는 필드와 메서드는 다른 클래스에서 구현될 것을 기대하는 것
인터페이스에 선언된 변수는 final이므로 고정 값을 가짐
*/
public interface Machine {
	int volt = 220;

	void powerOn();
	void powerOff();
}
