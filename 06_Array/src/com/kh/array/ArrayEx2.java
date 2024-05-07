package com.kh.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers["+i+"] = "+i);
		}
		
		method();
	}
	
	public static void method() {
		int[] num = new int[3];
		int count = 10;
		
		for(int i=0; i<num.length; i++) {
			num[i] = count;
			count += 10;
		}
		
		String[] str = {"월", "화", "수", "목", "금", "토", "일"};
		double[] db1 = new double[3];
		db1[0] = 10.1;
		db1[1] = 11.2;
		db1[2] = 13.2;
		
		char[] chr = {'A', 'B', 'C'};
		
		for(int i =0; i<num.length; i++) {
			System.out.println("num["+i+"] = "+num[i]);
		}
		
		for(int i=0; i<str.length; i++) {
			System.out.println("str["+i+"] = "+str[i]);
		}
		
		for(int i=0; i<db1.length; i++) {
			System.out.println("db1["+i+"] = "+db1[i]);
		}
		
		for(int i=0; i<chr.length; i++) {
			System.out.println("chr["+i+"] = "+chr[i]);
		}
	}

}
