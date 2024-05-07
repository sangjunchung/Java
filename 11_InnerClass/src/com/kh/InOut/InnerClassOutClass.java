package com.kh.InOut;

public class InnerClassOutClass {
	private int num = 10;
	
	class InnerClass {
		void printOut() {
			System.out.println("숫자보기 : " + num);
		}
	}
	
	public InnerClassOutClass() {
	
	}
	
	public static void main(String[] args) {
		InnerClassOutClass inOut = new InnerClassOutClass();
		InnerClassOutClass.InnerClass in = inOut.new InnerClass();
		in.printOut();
	}
}
