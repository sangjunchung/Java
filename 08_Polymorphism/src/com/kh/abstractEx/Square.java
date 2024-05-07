package com.kh.abstractEx;

public class Square extends Figure {

	private double baseLine;
	private double height;

	public Square(String inColor, double inBaseLine, double inHeight) {
		super(inColor);
		this.baseLine = inBaseLine;
		this.height = inHeight;
	}

	@Override
	public double area() {
		return baseLine * height;
	}

	@Override
	public double periphery() {
		return (baseLine + height) * 2;
	}

}
