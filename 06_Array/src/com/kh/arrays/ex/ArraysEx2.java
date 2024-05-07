package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {
	
	public ArraysEx2() {
		
	}
	
	public void method1() {
		int[] num = {6, 4, 2, 3, 5, 7, 9};
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		int[] abc = Arrays.copyOf(num, num.length);
		
		System.out.println(Arrays.equals(num, abc));
		
		int[] qwe = new int[3];
		
		Arrays.fill(qwe, 6);
		
		System.out.println(Arrays.toString(qwe));
	}
	
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
	}
}
