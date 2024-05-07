package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		
	}
	
	public void setProduct(String inpName, int inPrice, String inBrand) {
		this.pName = inpName;
		this.price = inPrice;
		this.brand = inBrand;
	}
	
	public void information() {
		System.out.println("제품 이름 : "+pName);
		System.out.println("제품 가격 : "+price);
		System.out.println("제품 브랜드 : "+brand);
	}
}
