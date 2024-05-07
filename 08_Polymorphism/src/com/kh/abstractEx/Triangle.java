package com.kh.abstractEx;

public class Triangle extends Figure {

	private double baseLine;
	private double height;

	public Triangle(String inColor, double inBaseLine, double inHeight) {
		super(inColor);
		this.baseLine = inBaseLine;
		this.height = inHeight;
	}

	@Override
	public double area() {
		return baseLine * height * 0.5;
	}

	@Override
	public double periphery() {
		double hypotenuse = Math.sqrt(Math.pow(baseLine, 2) + Math.pow(height, 2));
		return hypotenuse + baseLine + height;
	}
}
