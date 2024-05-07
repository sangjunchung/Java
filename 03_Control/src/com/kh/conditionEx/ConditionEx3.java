package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	if문 정수 비교
		if ( 숫자 == 숫자)
	if문 문자열 비교
		if ("문자열".equals("문자열"))
	문자열을 String 변수명에 넣어준다면 "문자열" 큰 따옴표를 붙여서 적지 않고 지정해준 변수명을 적어주면 된다.
		String str = "문자열";
		if (str.equals(str))
		if ("문자열".equals(str))
		if (str.equals("문자열"))
	*/
	
	public static void main(String[] args) {
		int num = 10;
		String str = "hello";
		String str1 = "둘";
		String str2 = "";
		
		if (num == 10) System.out.println("숫자가 동일합니다.");
		if (str.equals("hello")) System.out.println("두 문자열이 같습니다.");
		
		if ("둘".equals(str1)) System.out.println("모두 둘 입니다.");
	}

}
