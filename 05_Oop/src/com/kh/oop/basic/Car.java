package com.kh.oop.basic;

public class Car {
	// 필드
	public String color;
	public int speed;
	public String door;
	public String window;
	public String sunRoof;
	public String insurance;
	// 생성자 = 필수 옵션
	// 생성자 이름 = 클래스 이름 = 파일명
	// 생성자 = 메소드를 담거나 초기화를 위한 생성자
	public Car() {
		
	}
	
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	// 메서드
	public void displayInfo() {
		System.out.println("차 정보 : ");
		System.out.println("Color : "+color);
		System.out.println("Speed : "+speed);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("검정색", 200);
		myCar.displayInfo();
		
		Car storeCar = new Car("하양색", 100);
		storeCar.displayInfo();
	}
}
