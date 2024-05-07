package com.kh.javaAPIEx;

/*
String : 문자열을 나타내는 클래스
		 문자열을 생성하고 조작하는데 사용
		 
String str = new String(); - 이젠 String 에서 이 방식은 사용하지 않음
String str = ""; - 현재 사용하는 방식		 

substring = 문자열 자르기

toUpperCase() = 문자열 모두 대문자
toLowerCase() = 문자열 모두 소문자
trim() = 문자열 앞, 뒤 공백을 모두 제거해줌
split() = 문자열을 특정 구분자를 기분으로 잘라서 문자열 배열로 반환해줌
replace() = 문자열에서 문자열을 특정 문자열로 바꿔줌
*/

public class StringEx {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		// 가비지 컬렉션 - 쓰레기통
		// 코딩에서 사용하고 사용되지 않는 것을 자동으로 수집하여 없애는 것
		String phone = "010";
		phone += "-1234-5678";
		System.out.println(phone);
		
		String str = "  Hello World!";
		
		String subStr1 = str.substring(8);
		System.out.println(subStr1);
		
		String subStr2 = str.substring(8, 10);
		System.out.println(subStr2);
		
		String upStr = str.toUpperCase();
		System.out.println(upStr);
		
		String lowStr = str.toLowerCase();
		System.out.println(lowStr);
		
		String trimStr = str.trim();
		System.out.println(trimStr);
		
		String stripStr = str.strip();
		System.out.println(stripStr);
		
		String fruit = "apple,banana,grape";
		String[] fruits = fruit.split(",");
		for(String st : fruits) {
			System.out.println(st);
		}
		
		String reStr = str.replace("World", "home");
		System.out.println(reStr);
		
		char ch = str.charAt(13);
		System.out.println(ch);
	}

}
