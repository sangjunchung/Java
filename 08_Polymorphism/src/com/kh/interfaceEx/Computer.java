package com.kh.interfaceEx;

// 클래스, 추상 클래스 상속 : extends (확장하다)
// 인터페이스 상속 : implements (구현하다)
// 추상클래스 - 미완성된 값을 가지고 변경 및 확장하는게 목표
// 인터페이스 - 정해진 값을 가지고 클래스를 완성하는게 목표

public class Computer implements Machine {

	@Override
	public void powerOn() {
		System.out.println("컴퓨터의 power 버튼을 눌러서 킵니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("컴퓨터의 power 버튼을 눌러서 끕니다.");
	}

}
