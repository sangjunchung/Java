package com.kh.interfaceEx;

public class ChildCarc implements Calculator, Machine, Calculator2 {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}

	@Override
	public int rem(int a, int b) {
		return a % b;
	}

	@Override
	public void powerOn() {
		System.out.println("전원을 킵니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	@Override
	public double pow(int a, int b) {
		return Math.pow(a, b);
	}

	@Override
	public double sqrt(int a) {
		return Math.sqrt(a);
	}

}
