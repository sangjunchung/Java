package com.kh.abstractEx;

/*
abstract class - 추상클래스
미완성 클래스이기 때문에 컴퓨터에 추상클래스로 만든 파밍의 자체 공간을 만드는 것은 불가능
ex.클래스 [접근제어자] abstract class 파일명();
ex.메서드 [접근제어자] abstract [반환값] 메서드명();
*/

public abstract class Figure {

	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public Figure(String inColor) {
		this.color = inColor;
	}

	// abstract 메서드는 미완성 메서드이기 때문에 자식 클래스가 추상클래스가 아닌 구현된 클래스라면 완성시켜줘야함
	public abstract double area();
	public abstract double periphery();

	public void printInfo() {
		System.out.println("이 도형은 넓이가 " + area() + " 이고, 둘레가 " + periphery() + " 입니다.");
	}
}
