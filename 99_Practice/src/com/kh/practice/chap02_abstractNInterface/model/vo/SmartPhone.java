package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone {
	private String maker;

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}

	public SmartPhone() {

	}
	
	public abstract String printInformation();
}
