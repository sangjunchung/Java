package com.kh.abstractEx;

public class createFigure {

	public static void main(String[] args) {
		Triangle tri1 = new Triangle("빨간색", 3, 4);

		System.out.println("삼각형의 색깔 : "+tri1.getColor());
		System.out.println("삼각형의 넓이 : "+tri1.area());
		System.out.println("삼각형의 둘레 : "+tri1.periphery());
		
		System.out.println("=================");
		
		Square squ1 = new Square("검은색", 5, 6);

		System.out.println("사각형의 색깔 : "+squ1.getColor());
		System.out.println("사각형의 넓이 : "+squ1.area());
		System.out.println("사각형의 둘레 : "+squ1.periphery());
	}

}
