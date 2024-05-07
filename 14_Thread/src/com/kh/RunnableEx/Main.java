package com.kh.RunnableEx;

public class Main {

	public static void main(String[] args) {
		
		RunnableEx re = new RunnableEx();
		
		Thread thread = new Thread(re);
		thread.start();
	}
}
