package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.getAreaOfCircle();
		circle.getSizeOfCircle();
		
		System.out.println(circle.getPI());
		System.out.println(circle.getRadius());
		
		circle.setRadius(5);
		circle.info();
		
		circle.incrementRadius();
		circle.info();
		
		circle.getAreaOfCircle();
		circle.getSizeOfCircle();
	}

}
