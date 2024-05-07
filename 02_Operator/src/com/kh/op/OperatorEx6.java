package com.kh.op;

public class OperatorEx6 {
	/*
	증감 연산자 += , -= , *= , /= 
	ex. a += 2; == a = a + 2;
	*/
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num4 = 10;
		int num5 = 5;
		
		System.out.println("======= [+=] =======");
		System.out.println("num1 = "+num1+", num2 = "+num2);
		
		num1 += 3;
		System.out.println("num1 += 3 을 해준 num1 의 값 :"+num1);
	
		num2 += num1;
		System.out.println("num1 의 값 : "+num1+", num2 의 값 : "+num2);
		
		num4 -= 2;
		num5 -= num4;
		
		System.out.println("======= [-=] =======");
		System.out.println("num4 의 값 : "+num4+", num5 의 값 : "+num5);
		
	}

}
