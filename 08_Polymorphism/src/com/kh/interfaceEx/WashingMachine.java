package com.kh.interfaceEx;

public class WashingMachine implements Machine {

	@Override
	public void powerOn() {
		System.out.println("세탁기의 power 버튼을 눌러서 킵니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("세탁기의 power 버튼을 눌러서 끕니다.");
	}
	
}
