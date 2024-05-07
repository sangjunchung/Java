package com.kh.oop.constructor;

public class ConstructorEx {
	/*
	생성자 변수를 원하는 값으로 초기화 할수 있음
	초기값이 0일때 초기값에 1을 넣어주면 초기값이 1로 초기화됨
	
	1.반환값이 없음(return 사용X, void도 사용하지 않음)
	2.객체(클래스)를 초기화 하는 방법이 많을 경우 모두 사용 가능 
	
	선언 예제
	1. public 클래스이름(){} 
		- 디폴트 생성자 
		- 필수가 없음
	2. public 클래스이름(ex. int a){
			this.num = a;
		}
		- 필수 생성자
		- 필수로 받아야하는 값이 존재함
		- 필수로 받아야하는 값은 필드에 적힌 값만 가능
	3.	- 값이 지정된 생성자
		- 필드나 생성자에서 값을 지정해준 생성자
	*/
	
	public String name;
	public String phone;
	public int idNum;
	public int money;
	
	public ConstructorEx() {
		
	}
	
	public ConstructorEx(String inName) {
		this.name = inName;
	}
	
	public ConstructorEx(String inName, String inPhone) {
		this.name = inName;
		this.phone = inPhone;
	}
	
	public ConstructorEx(String inName, String inPhone, int inIdNum) {
		this.name = inName;
		this.phone = inPhone;
		this.idNum = inIdNum;
	}
	
	public ConstructorEx(String inName, String inPhone, int inIdNum, int inMoney) {
		this.name = inName;
		this.phone = inPhone;
		this.idNum = inIdNum;
		this.money = inMoney;
	}
	
	// 값을 지정한 생성자
	// 값을 지정한 생성자는 초기의 값만 지정해주기 때문에
	// 매개변수를 필수로 넣어주지 않아도 되지만
	// 기본 생성자와 생김새가 같아 에러가 발생하기 때문에
	// 보통 임의의 매개변수를 넣어줌
	public ConstructorEx(int a) {
		name = "이름을 입력해주세요.";
		phone = "휴대폰 번호를 입력해주세요.";
		idNum = 1;
		money = 0;
	}
}
