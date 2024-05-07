package com.kh.example.practice3.model.vo;

public class Circle {
	private final double  PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int inRadius) {
		this.radius = inRadius;
	}
	
	public double getPI() {
		return PI;
	}
	
	public void incrementRadius() {
		radius += 1;
	}
	
	public void info() {
		System.out.println("원의 반지름 : "+radius);
		System.out.println("PI : "+PI);
	}
	
	public void getAreaOfCircle() {
		double area = radius * radius * PI;
		System.out.println("원의 넓이 : "+area);
	}
	
	public void getSizeOfCircle() {
		double size = radius * 2 * PI;
		System.out.println("원의 둘레 : "+size);
	}
}
