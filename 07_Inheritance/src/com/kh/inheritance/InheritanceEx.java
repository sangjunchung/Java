package com.kh.inheritance;
/*
	상속 - 자식 클래스가 부모 클래스 기능을 그대로 물려받는 기능
	
	ex.
	class Animal(){  // 부모 클래스
		String name;
		
		public Animal(String inName){
			this.name = inName;
		}
		
		public void method(){
			System.out.println(이름+" 입니다.");
		}
	}
	
	class Dog extends Animal{  // 자식 클래스
	
		public Dog(String inName){
			super(inName);
		}
		@Override
		public void method(){
			System.out.println("부모의 자식인" +이름+ " 입니다.");
		}
	}
	
*/
public class InheritanceEx {

}
