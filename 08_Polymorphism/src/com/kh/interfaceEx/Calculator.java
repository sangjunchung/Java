package com.kh.interfaceEx;

public interface Calculator {
	double PI = 3.14;
	int MIN = -100_000_000;
	int MAX = 100_000_000;
	
	int sum(int a, int b);
	int sub(int a, int b);
	int mul(int a, int b);
	int div(int a, int b);
	int rem(int a, int b);
	
}
