package com.kh.inheritance.OverLoadingEx;

public class Run {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("홍길동");
		
		Person person2 = new Person("박영희");
		
		Person person3 = new Person("김철수", 20);
		
		person1.displayInfo();
		person2.displayInfo();
		person3.displayInfo();
	}

}
