package com.kh.oop.method;

public class Car {
	
	public String brand;
	public String model;
	public int year;
	
	public Car() {
		
	}

	public Car(String inBrand, String inModel, int inYear) {
		this.brand = inBrand;
		this.model = inModel;
		this.year = inYear;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Carmy", 2022);
		System.out.printf("%s\t%s\t%d\n", car1.brand, car1.model, car1.year);
	}
	
}
