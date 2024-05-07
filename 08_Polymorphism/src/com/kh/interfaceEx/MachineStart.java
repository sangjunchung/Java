package com.kh.interfaceEx;

public class MachineStart {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.powerOn();
		com1.powerOff();

		WashingMachine wash1 = new WashingMachine();
		wash1.powerOn();
		wash1.powerOff();

		ChildCarc c1 = new ChildCarc();
		c1.powerOn();
		c1.powerOff();
		
		int a = 10;
		int b = 5;

		System.out.println(a + " + " + b + " = " + c1.sum(a, b));
		System.out.println(a + " - " + b + " = " + c1.sub(a, b));
		System.out.println(a + " * " + b + " = " + c1.mul(a, b));
		System.out.println(a + " / " + b + " = " + c1.div(a, b));
		System.out.println(a + " % " + b + " = " + c1.rem(a, b));
		System.out.println(a + " 의 " + b + " 제곱 = " + c1.pow(a, b));
		System.out.println(a + " 의 제곱근 = "  + c1.sqrt(a));

	}

}
