package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
StringTokenizer
Token = 동전 최소 단위 정보를 가진 물리적 가상적 물체 
*/

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("자바 는 즐 거워");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		StringTokenizer token2 = new StringTokenizer("오렌지,사과,포도", ",");
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
	}
}
