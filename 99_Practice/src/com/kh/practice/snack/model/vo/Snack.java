package com.kh.practice.snack.model.vo;

public class Snack {
	String kind;	// 종류
	String name;	// 이름
	String flavor;	// 맛
	int numOf;		// 개수
	int price;		// 가격
	
	public Snack() {
		
	}
	
	public Snack(String inKind, String inName, String inFlavor, int inNumOf, int inPrice) {
		this.kind = inKind;
		this.name = inName;
		this.flavor = inFlavor;
		this.numOf = inNumOf;
		this.price = inPrice;
	}
	
	public void information() {
		System.out.printf("%s(%s - %s) %d개 %d원", kind, name, flavor, numOf, price);
	}
	
	public void getInfo() {
		information();
	}
	
	public void setInfo(String inKind, String inName, String inFlavor, int innumOf, int inPrice) {
		this.kind = inKind;
		this.name = inName;
		this.flavor = inFlavor;
		this.numOf = innumOf;
		this.price = inPrice;
		
		System.out.println("저장 완료되었습니다.");
	}
}
